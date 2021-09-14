package org.honma.excel.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.honma.common.annotation.Excel;

/**
 * 商铺员工对象 t_shop_employee
 *
 * @author ruoyi
 * @date 2021-09-08
 */

@ApiModel(value = "商铺员工对象")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShopEmployee
{

    /** 员工ID */
    @Excel(name = "序号")
    @ApiModelProperty(value = "员工ID",position = 0)
    private String id;

    /** 姓名 */
    @Excel(name = "姓名")
    @ApiModelProperty(value = "姓名",position = 1)
    private String name;

    /** 性别 */
    @Excel(name = "性别")
    @ApiModelProperty(value = "性别",position = 2)
    private String sex;

    /** 年龄 */
    @Excel(name = "年龄")
    @ApiModelProperty(value = "年龄",position = 3)
    private Integer age;

    /** 学历 */
    @Excel(name = "学历")
    @ApiModelProperty(value = "学历",position = 4)
    private String education;

    /** 身份证 */
    @Excel(name = "身份证号")
    @ApiModelProperty(value = "身份证",position = 5)
    private String identityCard;

    /** 手机号 */
    @Excel(name = "手机号码")
    @ApiModelProperty(value = "手机号码",position = 6)
    private String phone;

    /** 商铺ID */
    @Excel(name = "单位")
    @ApiModelProperty(value = "单位",position = 11)
    private String shopId;

    @Override
    public String toString() {
        return "ShopEmployee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", phone='" + phone + '\'' +
                ", shopId='" + shopId + '\'' +
                '}';
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }
    public void setAge(Integer age)
    {
        this.age = age;
    }

    public Integer getAge()
    {
        return age;
    }
    public void setEducation(String education)
    {
        this.education = education;
    }

    public String getEducation()
    {
        return education;
    }
    public void setIdentityCard(String identityCard)
    {
        this.identityCard = identityCard;
    }

    public String getIdentityCard()
    {
        return identityCard;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setShopId(String shopId)
    {
        this.shopId = shopId;
    }

    public String getShopId()
    {
        return shopId;
    }

}
