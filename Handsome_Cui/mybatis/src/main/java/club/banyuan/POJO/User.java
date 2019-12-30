package club.banyuan.POJO;

import java.util.Date;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019/12/30
 */
public class User {
    private int id;
    private java.lang.String name;
    private int gender;
    private java.lang.String address;
    private java.util.Date birthday;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
