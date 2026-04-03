package com.internship_zorvyn.demo.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.time.LocalDate;
import com.internship_zorvyn.demo.model.RecordType;
@Data
public class RecordRequestDTO {

    @NotNull
    @Positive
    private Double amount;

    @NotNull
    private RecordType type;

    private String category;
    private LocalDate date;
    private String description;
}