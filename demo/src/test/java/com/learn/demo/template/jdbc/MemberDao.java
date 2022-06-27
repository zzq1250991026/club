package com.learn.demo.template.jdbc;

import javax.sql.DataSource;
import java.util.List;

public class MemberDao extends JdbcTemplate{
    public MemberDao(DataSource dataSource){
        super(dataSource);
    }
    public List<?> selectAll(){
        String s="";
     /*   return super.executeQuery(s,new RowMapper<Member>(){
            @Override
            public Member mapRow(ResultSet set, int rowNum) throws Exception {
                return null;
            }
        },null);*/
        return null;
        }
}
