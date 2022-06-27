package com.learn.demo.template.jdbc;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTemplate {
    private DataSource dataSource;
    public JdbcTemplate(DataSource dataSource){
        this.dataSource=dataSource;
    }
    protected ResultSet executeQuery(PreparedStatement statement,Object[] values) throws Exception{
        for(int i = 0;i<values.length;i++){
            statement.setObject(i,values[i]);
        }
        return statement.executeQuery();
    }

    @Override
    public String toString() {
        return "JdbcTemplate{" +
                "dataSource=" + dataSource +
                '}';
    }
}
