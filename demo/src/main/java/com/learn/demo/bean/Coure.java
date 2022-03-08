package com.learn.demo.bean;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

@Data
public class Coure {
    @TableId
    private  String C;
    private  String Cname;
    private String string;
}
