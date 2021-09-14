package org.honma.excel.used;

import com.sun.rowset.internal.Row;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.honma.common.entity.AjaxResult;
import org.honma.excel.entity.Shop;
import org.honma.excel.entity.ShopEmployee;
import org.honma.excel.entity.ShopIncomeExcel;
import org.honma.excel.entity.ShopIncomeRes;
import org.honma.utils.StringUtils;
import org.honma.utils.poi.ExcelUtil;
import org.honma.utils.uuid.IdUtils;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 批量替换Excel的值 (指定键值对)
 *
 * @Author: lijunjie
 * @Date: 2021/9/10
 */
public class ExcelReplace {
    public static void main(String[] args) {
        ExcelReplace excelReplace = new ExcelReplace();
        excelReplace.shopIncomeTransfer("8月份业绩");
    }

    /**
     * 把营业额表转成跟数据结构对应的表
     */
    public void shopIncomeTransfer(String sheetName){
        ExcelUtil<ShopIncomeExcel> excelUtil = new ExcelUtil<ShopIncomeExcel>(ShopIncomeExcel.class);

        try {
            //1 拿到原始数据
            FileInputStream shopInCome = new FileInputStream(new File("D:\\Work\\滨海盐城\\颐高广场营业额统计08.30.xlsx"));
            List<ShopIncomeExcel> shopIncomeExcels = excelUtil.importExcel(sheetName,shopInCome);
            //2 处理数据
            ArrayList<ShopIncomeRes> shopIncomeRes = new ArrayList<>();
            for (ShopIncomeExcel s :
                    shopIncomeExcels) {
//                replaceKey.put(s.getName(), s.getShopId());
//                System.out.println(s);
                String shopId = s.getShopId();
                for (Method method : s.getClass().getDeclaredMethods()) {

                    String methodName = method.getName();
                    if (methodName.contains("get")){
                        //调用getter方法, 赋值给结果类
//                        String value = (String)method.invoke(s);
//                        System.out.print(method.getName()+": "+value+ ", ");
//                        if (methodName.equals("getId")){
//                            //主键id
//                            incomeRes.setId(value);
//                        }else if (methodName.equals("getShopId")){
//                            //商铺id
//                            incomeRes.setShopId(value);
//                        }
                        if (methodName.contains("getC")){

                            //营收
                            String value = (String)method.invoke(s);
                            if (value != null && value != "") {
                                ShopIncomeRes incomeRes = new ShopIncomeRes();
                                incomeRes.setId(IdUtils.simpleUUID());

                                incomeRes.setTurnover(Double.valueOf(value));

                                //商铺id
                                incomeRes.setShopId(shopId);

                                //年, 月, 日
                                String substring = methodName.substring(4);
                                Integer day = Integer.valueOf(substring);
//                            System.out.println(day);
                                Integer year = 2021;
                                Integer month = 8;
                                incomeRes.setDay(day);
                                incomeRes.setMonth(month);
                                incomeRes.setYear(year);
                                //营业额
                                incomeRes.setTurnover(Double.valueOf(value));
                                System.out.println(incomeRes);
                                shopIncomeRes.add(incomeRes);
                            }

                        }
                    }
                }
            }
            //3 输出结果Excel
            ExcelUtil<ShopIncomeRes> resExcelUtil = new ExcelUtil<>(ShopIncomeRes.class);
            resExcelUtil.exportExcel(shopIncomeRes, "8月份营业额");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void shopIdReplace(){
        /**
         * 实现功能: 把Excel里的商铺名称(shopName)替换成对应的商铺id(shopId)
         */
        // 1 获取要替换的键值对 用HashMap保存
        HashMap<String, String> replaceKey = new HashMap<>();
        ExcelUtil<Shop> excelUtil = new ExcelUtil<Shop>(Shop.class);
        try {
            FileInputStream shopIn = new FileInputStream(new File("D:\\Work\\滨海盐城\\商铺基本信息09.08(1).xlsx"));
            List<Shop> shops = excelUtil.importExcel(shopIn);
//            System.out.println(shops);
            for (Shop s :
                    shops) {
                replaceKey.put(s.getName(), s.getShopId());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //2 执行替换
        ExcelUtil<ShopEmployee> employeeExcelUtil = new ExcelUtil<ShopEmployee>(ShopEmployee.class);
//        HSSFRow cells = new HSSFRow();
//        employeeExcelUtil.getCellValue(new Row(), 8);
        //结果表
        ArrayList<ShopEmployee> employees = new ArrayList<>();
        try {
            FileInputStream employeeIn = new FileInputStream(new File("D:\\Work\\滨海盐城\\商铺人员信息表(1)(1).xlsx"));
            List<ShopEmployee> shopEmployees = employeeExcelUtil.importExcel(employeeIn);
            for (ShopEmployee shopEmployee : shopEmployees) {
                //替换数据
                String shopId = replaceKey.get(shopEmployee.getShopId());
                if (!StringUtils.isEmpty(shopId)){
                    shopEmployee.setShopId(shopId);
                }
                employees.add(shopEmployee);
                System.out.println(shopEmployee);
            }
            // 导出Excel
//            FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\Work\\滨海盐城\\"+ IdUtils.simpleUUID()+".xlsx"));
            AjaxResult sheetName = employeeExcelUtil.exportExcel(employees, "sheetName");
            System.out.println(sheetName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
