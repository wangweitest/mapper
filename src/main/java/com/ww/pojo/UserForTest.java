package com.ww.pojo;

import javax.persistence.*;

@Table(name = "user_for_test")
public class UserForTest {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Id
    @Column(name = "erp_id")
    private Integer erpId;

    @Column(name = "user_name")
    private String userName;

    private String pwd;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return erp_id
     */
    public Integer getErpId() {
        return erpId;
    }

    /**
     * @param erpId
     */
    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}