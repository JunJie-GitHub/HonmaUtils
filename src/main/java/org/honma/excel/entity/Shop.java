package org.honma.excel.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.honma.common.annotation.Excel;

import java.util.Date;

/**
 * 商铺基本信息对象 t_shop
 *
 * @author junjie
 * @date 2021-09-08
 */

@ApiModel(value = "商铺基本信息对象")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shop
{

    /** 主键 */
    @Excel(name = "主键")
    @ApiModelProperty(value = "主键",position = 0)
    private String id;

    /** 房间 */
    @Excel(name = "房间")
    @ApiModelProperty(value = "房间",position = 1)
    private String room;

    /** 商铺编号 */
    @Excel(name = "商铺编号")
    @ApiModelProperty(value = "商铺编号",position = 2)
    private String shopId;

    /** 法人 */
    @Excel(name = "法人")
    @ApiModelProperty(value = "法人",position = 3)
    private String legalPerson;

    /** 面积 */
    @Excel(name = "面积")
    @ApiModelProperty(value = "面积",position = 4)
    private Double area;

    /** 商铺名称 */
    @Excel(name = "商铺名称")
    @ApiModelProperty(value = "商铺名称",position = 5)
    private String name;

    /** 品牌 */
    @Excel(name = "品牌")
    @ApiModelProperty(value = "品牌",position = 6)
    private String brand;

    /** 员工人数 */
    @Excel(name = "员工人数")
    @ApiModelProperty(value = "员工人数",position = 7)
    private Integer peoples;

    /** 商铺类型 */
    @Excel(name = "商铺类型")
    @ApiModelProperty(value = "商铺类型",position = 8)
    private String type;

    /** 坐标X */
    @Excel(name = "坐标X")
    @ApiModelProperty(value = "坐标X",position = 9)
    private Double longitude;

    /** 坐标Y */
    @Excel(name = "坐标Y")
    @ApiModelProperty(value = "坐标Y",position = 10)
    private Double latitude;

    /** 楼层 */
    @Excel(name = "楼层")
    @ApiModelProperty(value = "楼层",position = 11)
    private String floor;

    /** 创建人 */
    @Excel(name = "创建人")
    @ApiModelProperty(value = "创建人",position = 12)
    private String createdBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    @ApiModelProperty(value = "创建时间",position = 13)
    private Date createdTime;

    /** 更新人 */
    @Excel(name = "更新人")
    @ApiModelProperty(value = "更新人",position = 14)
    private String updatedBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    @ApiModelProperty(value = "更新时间",position = 15)
    private Date updatedTime;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setRoom(String room)
    {
        this.room = room;
    }

    public String getRoom()
    {
        return room;
    }
    public void setShopId(String shopId)
    {
        this.shopId = shopId;
    }

    public String getShopId()
    {
        return shopId;
    }
    public void setLegalPerson(String legalPerson)
    {
        this.legalPerson = legalPerson;
    }

    public String getLegalPerson()
    {
        return legalPerson;
    }
    public void setArea(Double area)
    {
        this.area = area;
    }

    public Double getArea()
    {
        return area;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getBrand()
    {
        return brand;
    }
    public void setPeoples(Integer peoples)
    {
        this.peoples = peoples;
    }

    public Integer getPeoples()
    {
        return peoples;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setLongitude(Double longitude)
    {
        this.longitude = longitude;
    }

    public Double getLongitude()
    {
        return longitude;
    }
    public void setLatitude(Double latitude)
    {
        this.latitude = latitude;
    }

    public Double getLatitude()
    {
        return latitude;
    }
    public void setFloor(String floor)
    {
        this.floor = floor;
    }

    public String getFloor()
    {
        return floor;
    }
    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    public String getCreatedBy()
    {
        return createdBy;
    }
    public void setCreatedTime(Date createdTime)
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime()
    {
        return createdTime;
    }
    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy()
    {
        return updatedBy;
    }
    public void setUpdatedTime(Date updatedTime)
    {
        this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime()
    {
        return updatedTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("room", getRoom())
            .append("shopId", getShopId())
            .append("legalPerson", getLegalPerson())
            .append("area", getArea())
            .append("name", getName())
            .append("brand", getBrand())
            .append("peoples", getPeoples())
            .append("type", getType())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .append("floor", getFloor())
            .append("createdBy", getCreatedBy())
            .append("createdTime", getCreatedTime())
            .append("updatedBy", getUpdatedBy())
            .append("updatedTime", getUpdatedTime())
            .toString();
    }
}
