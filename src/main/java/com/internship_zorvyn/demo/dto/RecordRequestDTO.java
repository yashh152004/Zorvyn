package com.internship_zorvyn.demo.dto;

import com.internship_zorvyn.demo.model.RecordType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class RecordRequestDTO {

    @NotNull
    @Positive
    private Double amount;

    @NotNull
    private RecordType type;

    private String category;
    private LocalDate date;
    private String description;

    // CONSTRUCTOR
    public RecordRequestDTO() {}

    // GETTERS
    public Double getAmount() { return amount; }
    public RecordType getType() { return type; }
    public String getCategory() { return category; }
    public LocalDate getDate() { return date; }
    public String getDescription() { return description; }

    // SETTERS
    public void setAmount(Double amount) { this.amount = amount; }
    public void setType(RecordType type) { this.type = type; }
    public void setCategory(String category) { this.category = category; }
    public void setDate(LocalDate date) { this.date = date; }
    public void setDescription(String description) { this.description = description; }
}