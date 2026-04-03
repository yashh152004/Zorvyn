package com.internship_zorvyn.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class RecordResponseDTO {

    private Long id;
    private Double amount;
    private String type;
    private String category;
    private LocalDate date;
}