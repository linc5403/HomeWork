package com.example.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Auther: 张伟
 * @Date: 2019/12/25
 * @Description: com.example.entity
 * @version: 1.0
 */
@Entity
//@Component
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Integer id;
    private String name;
    private String gender;
    private Date birthday;
    private String adress;

    public Person() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getAdress() {
        return adress;
    }
}
