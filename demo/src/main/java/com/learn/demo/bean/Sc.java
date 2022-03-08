package com.learn.demo.bean;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

@Data
public class Sc {
    @TableId
    private String S;
    private String C;
    private String score;
}
