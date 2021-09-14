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
 * 企业员工对象 t_company_employee
 *
 * @author ruoyi
 * @date 2021-09-08
 */

@ApiModel(value = "企业员工对象")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompanyEmployee
{

    /** 员工ID */
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
    private Long age;

    /** 学历 */
    @Excel(name = "学历")
    @ApiModelProperty(value = "学历",position = 4)
    private String education;

    /** 政治面貌 */
    @Excel(name = "政治面貌")
    @ApiModelProperty(value = "政治面貌",position = 5)
    private String politicsStatus;

    /** 身份证号码 */
    @Excel(name = "身份证号码")
    @ApiModelProperty(value = "身份证号码",position = 6)
    private String identityCard;

    /** 企业ID */
    @Excel(name = "企业ID")
    @ApiModelProperty(value = "企业ID",position = 11)
    private String companyId;

    private String searchName;

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
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
    public void setAge(Long age)
    {
        this.age = age;
    }

    public Long getAge()
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
    public void setPoliticsStatus(String politicsStatus)
    {
        this.politicsStatus = politicsStatus;
    }

    public String getPoliticsStatus()
    {
        return politicsStatus;
    }
    public void setIdentityCard(String identityCard)
    {
        this.identityCard = identityCard;
    }

    public String getIdentityCard()
    {
        return identityCard;
    }

    public void setCompanyId(String companyId)
    {
        this.companyId = companyId;
    }

    public String getCompanyId()
    {
        return companyId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("sex", getSex())
            .append("age", getAge())
            .append("education", getEducation())
            .append("politicsStatus", getPoliticsStatus())
            .append("identityCard", getIdentityCard())
            .append("companyId", getCompanyId())
            .toString();
    }
}
