package com.spring.springcloudlibraryemp.Service;

import com.spring.springcloudlibraryemp.pojo.attendance;
import com.spring.springcloudlibraryemp.pojo.employee;
import com.spring.springcloudlibraryemp.pojo.fenye;
import com.spring.springcloudlibraryemp.pojo.leave;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface EmpService {

    public int login(String username, String password);

    public employee selectEmpByname(String username);

    public List<attendance> getattendByid(int empid, int pageSize, int pageNo);

    public int getCount(int empid, String prefixdate, String suffixdate, Integer daka_state);
    public List<attendance> getattendBycondition(int empid, Integer pageSize,Integer pageNo, String prefixdate,String suffixdate,Integer daka_state);
    public int daka( String datetime, String username, Integer empid, Integer hour,String timea);
    public int isdaka(String datetime, Integer empid);
    public int adddaka(String datetime, Integer empid);

    public int addleave(leave leave);

}
