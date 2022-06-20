package com.example.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DateRepository {

    @Insert("insert into milestones (date, startTime, endTime) values (#{date}, #{startTime}), #{endTime}")
    void insert(String date, String startTime, String endTime);

    @Select("select * from milestones where date = #{date}")
    DateEntity findByDate(String date);
}