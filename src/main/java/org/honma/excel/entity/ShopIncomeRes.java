package org.honma.excel.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import org.honma.common.annotation.Excel;

import java.util.Date;

/**
 * @Author: lijunjie
 * @Date: 2021/9/13
 */
public class ShopIncomeRes {

    /** 商铺ID */
    @Excel(name = "ID")
    @ApiModelProperty(value = "ID",position = 0)
    private String id;

    /** 年 */
    @Excel(name = "年")
    @ApiModelProperty(value = "年",position = 1)
    private Integer year;

    /** 月 */
    @Excel(name = "月")
    @ApiModelProperty(value = "月",position = 2)
    private Integer month;

    /** 日 */
    @Excel(name = "日")
    @ApiModelProperty(value = "日",position = 3)
    private Integer day;

    /** 营业额 */
    @Excel(name = "营业额")
    @ApiModelProperty(value = "营业额",position = 4)
    private Double turnover;

    /** 创建人 */
    @Excel(name = "创建人")
    @ApiModelProperty(value = "创建人",position = 5)
    private String createdBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    @ApiModelProperty(value = "创建时间",position = 6)
    private Date createdTime;

    /** 更新人 */
    @Excel(name = "更新人")
    @ApiModelProperty(value = "更新人",position = 7)
    private String updatedBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    @ApiModelProperty(value = "更新时间",position = 8)
    private Date updatedTime;

    /** 商铺ID */
    @Excel(name = "商铺ID")
    @ApiModelProperty(value = "商铺ID",position = 9)
    private String shopId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Double getTurnover() {
        return turnover;
    }

    public void setTurnover(Double turnover) {
        this.turnover = turnover;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Override
    public String toString() {
        return "ShopIncomeRes{" +
                "id='" + id + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", turnover=" + turnover +
                ", createdBy='" + createdBy + '\'' +
                ", createdTime=" + createdTime +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedTime=" + updatedTime +
                ", shopId='" + shopId + '\'' +
                '}';
    }
}
