package com.sherlock.design.principle.dimit.good;

import lombok.Data;

import java.util.Date;
@Data
public class LoginLog {

    private String username;

    private Date loginDate;


}