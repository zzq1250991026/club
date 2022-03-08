package com.learn.demo.bean;

import ch.qos.logback.classic.db.names.TableName;
import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

@Data
public class Teacher {
    @TableId
    private String T;
    private String Tname;
}
