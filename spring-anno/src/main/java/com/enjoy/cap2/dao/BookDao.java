package com.enjoy.cap2.dao;

import org.springframework.stereotype.Repository;

@Repository
//默认名字是类名首字母小写 bookDao
public class BookDao {
    private String lable="1";

    public String getLable() {
        return lable;
    }
}
