package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class DateEntity {
    private String date;
    private String startTime;
    private String endTime;
}
