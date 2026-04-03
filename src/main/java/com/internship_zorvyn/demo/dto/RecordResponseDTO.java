package com.internship_zorvyn.demo.dto;

@Data
@AllArgsConstructor
public class RecordResponseDTO {

    private Long id;
    private Double amount;
    private String type;
    private String category;
    private LocalDate date;
}