package com.internship_zorvyn.demo.dto;

import java.time.LocalDate;

public class RecordResponseDTO {

    private Long id;
    private Double amount;
    private String type;
    private String category;
    private LocalDate date;

    // CONSTRUCTOR
    public RecordResponseDTO(Long id, Double amount, String type, String category, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.category = category;
        this.date = date;
    }

    // GETTERS
    public Long getId() { return id; }
    public Double getAmount() { return amount; }
    public String getType() { return type; }
    public String getCategory() { return category; }
    public LocalDate getDate() { return date; }

    // SETTERS
    public void setId(Long id) { this.id = id; }
    public void setAmount(Double amount) { this.amount = amount; }
    public void setType(String type) { this.type = type; }
    public void setCategory(String category) { this.category = category; }
    public void setDate(LocalDate date) { this.date = date; }
}