package com.example.dao;

/**
 * 用户类
 */
public class User {
    private String id;
    private String m_name;

    private String code;

    private String pwd;

    private  String age;

    private String power;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getM_name() {
        return m_name;
    }

    public String getCode() {
        return code;
    }

    public String getPwd() {
        return pwd;
    }

    public String getAge() {
        return age;
    }

    public String getPower() {
        return power;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
