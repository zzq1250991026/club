package com.learn.demo.bean;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

//implements UserDetails
@Data
public class Student  {
    @TableId(value = "S")
    private String S;
    private String Sname;
    private String Sage;
    private String Ssex;
    public Student(){
    }
    public Student(String s, String sname,String sage,String ssex){
        this.S=s;
        this.Sname=sname;
        this.Sage=sage;
        this.Ssex=ssex;
    }
//获得当前用户对象所具有的的角色信息
/*    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }
//当前用户是否过期
    @Override
    public boolean isAccountNonExpired() {
        return false;
    }
//当前用户是否未锁定
    @Override
    public boolean isAccountNonLocked() {
        return false;
    }
//当前用户密码是否过期
    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }
//当前用户是否可用
    @Override
    public boolean isEnabled() {
        return false;
    }*/
}
