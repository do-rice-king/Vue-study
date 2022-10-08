package com.example.demo.mapper;


import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface AiBaseMapper {

    void insertMsg(String msg);
}
