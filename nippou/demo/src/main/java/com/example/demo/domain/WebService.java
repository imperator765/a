package com.example.demo.domain;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WebService {

    private DateRepository dateRepository;

    @Transactional
    public void create(String date, String startDate, String endDate){
        dateRepository.insert(date, startDate, endDate);
        
    }

}
