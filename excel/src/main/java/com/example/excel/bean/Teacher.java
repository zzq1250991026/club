package com.example.excel.bean;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

@Data
public class Teacher {
    @TableId
    private String T;
    private String Tname;
}
