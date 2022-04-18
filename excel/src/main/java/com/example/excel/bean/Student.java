package com.example.excel.bean;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

@Data
public class Student {
    @TableId(value = "S")
    private String S;
    private String Sname;
    private String Sage;
    private String Ssex;
}
