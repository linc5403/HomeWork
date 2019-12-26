package club.banyuan.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created on 2019/12/25 4:25 下午
 *
 * @author lgt
 */
@Entity
@Table(name="person")
public class Person {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="gender")
    private String gender;
    @Column(name="birthday")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
    private Date birthday;
    @Column(name="ADDRESS")
    private String address;

    public Person() {
    }

    public Person(int id, String name, String gender, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
//        this.birthday = birthday;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  '{'+
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
