package com.qfedu.sys.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer userid;
    private String loginname;
    private String identity;
    private String realname;
    private Integer sex;
    private String address;
    private String phone;
    private String pwd;
    private String position;
    private Integer type;
    private Integer available;
}
