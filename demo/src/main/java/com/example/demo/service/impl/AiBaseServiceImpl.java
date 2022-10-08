package com.example.demo.service.impl;

import com.example.demo.mapper.AiBaseMapper;
import com.example.demo.service.AiBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AiBaseServiceImpl implements AiBaseService {
    @Autowired
    AiBaseMapper aiBaseMapper;
    @Override
    public void insertMsg(String msg) {
        aiBaseMapper.insertMsg(msg);
    }
}
