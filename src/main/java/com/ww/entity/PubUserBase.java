package com.ww.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "Pub_User_Base")
public class PubUserBase {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "userName")
    private String username;

    @Column(name = "passWord")
    private String password;

    @Column(name = "trueName")
    private String truename;

    private String sex;

    @Column(name = "DeptName")
    private String deptname;

    @Column(name = "Job")
    private String job;

    @Column(name = "Mobile")
    private String mobile;

    @Column(name = "QQ")
    private String qq;

    private String tel;

    private String fax;

    private String province;

    private String area;

    private String addr;

    private String cpyname;

    private String remark;

    @Column(name = "addTime")
    private Date addtime;

    @Column(name = "updateTime")
    private Date updatetime;

    @Column(name = "isDel")
    private Boolean isdel;

    private String email;

    @Column(name = "email_approve")
    private String emailApprove;

    @Column(name = "mobile_approve")
    private String mobileApprove;

    @Column(name = "province_id")
    private Integer provinceId;

    @Column(name = "city_id")
    private Integer cityId;

    @Column(name = "id_card")
    private String idCard;

    @Column(name = "birth_day")
    private Date birthDay;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "business_card")
    private String businessCard;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_addr")
    private String companyAddr;

    @Column(name = "business_license")
    private String businessLicense;

    @Column(name = "contact_user_name")
    private String contactUserName;

    @Column(name = "contact_mobile")
    private String contactMobile;

    private String img;

    @Column(name = "Detail")
    private String detail;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return userName
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return passWord
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return trueName
     */
    public String getTruename() {
        return truename;
    }

    /**
     * @param truename
     */
    public void setTruename(String truename) {
        this.truename = truename;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return DeptName
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * @param deptname
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    /**
     * @return Job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * @return Mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return QQ
     */
    public String getQq() {
        return qq;
    }

    /**
     * @param qq
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * @param addr
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * @return cpyname
     */
    public String getCpyname() {
        return cpyname;
    }

    /**
     * @param cpyname
     */
    public void setCpyname(String cpyname) {
        this.cpyname = cpyname;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return addTime
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * @param addtime
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * @return updateTime
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * @return isDel
     */
    public Boolean getIsdel() {
        return isdel;
    }

    /**
     * @param isdel
     */
    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return email_approve
     */
    public String getEmailApprove() {
        return emailApprove;
    }

    /**
     * @param emailApprove
     */
    public void setEmailApprove(String emailApprove) {
        this.emailApprove = emailApprove;
    }

    /**
     * @return mobile_approve
     */
    public String getMobileApprove() {
        return mobileApprove;
    }

    /**
     * @param mobileApprove
     */
    public void setMobileApprove(String mobileApprove) {
        this.mobileApprove = mobileApprove;
    }

    /**
     * @return province_id
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * @param provinceId
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * @return city_id
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * @param cityId
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * @return id_card
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * @param idCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * @return birth_day
     */
    public Date getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay
     */
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * @return zip_code
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return business_card
     */
    public String getBusinessCard() {
        return businessCard;
    }

    /**
     * @param businessCard
     */
    public void setBusinessCard(String businessCard) {
        this.businessCard = businessCard;
    }

    /**
     * @return company_name
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return company_addr
     */
    public String getCompanyAddr() {
        return companyAddr;
    }

    /**
     * @param companyAddr
     */
    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }

    /**
     * @return business_license
     */
    public String getBusinessLicense() {
        return businessLicense;
    }

    /**
     * @param businessLicense
     */
    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    /**
     * @return contact_user_name
     */
    public String getContactUserName() {
        return contactUserName;
    }

    /**
     * @param contactUserName
     */
    public void setContactUserName(String contactUserName) {
        this.contactUserName = contactUserName;
    }

    /**
     * @return contact_mobile
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * @param contactMobile
     */
    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    /**
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * @return Detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
}