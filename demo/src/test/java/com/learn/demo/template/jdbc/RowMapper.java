package com.learn.demo.template.jdbc;

import java.sql.ResultSet;

public interface RowMapper<T> {
    T mapRow(ResultSet set,int rowNum) throws Exception;
}
