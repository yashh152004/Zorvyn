package com.internship_zorvyn.demo.dto;

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
