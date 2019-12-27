package com.ql.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description
 * @author：QL
 * @date:Created in 2019/12/25 4:49 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private int id;
    private String name;
    private String gender;
    private Date birthday;
    private String address;
}
