package com.internship_zorvyn.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "financial_records")
public class FinancialRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private RecordType type;

    private String category;

    private LocalDate date;

    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User createdBy;

    // CONSTRUCTORS
    public FinancialRecord() {}

    public FinancialRecord(Long id, Double amount, RecordType type, String category,
                           LocalDate date, String description, User createdBy) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.category = category;
        this.date = date;
        this.description = description;
        this.createdBy = createdBy;
    }

    // GETTERS
    public Long getId() { return id; }
    public Double getAmount() { return amount; }
    public RecordType getType() { return type; }
    public String getCategory() { return category; }
    public LocalDate getDate() { return date; }
    public String getDescription() { return description; }
    public User getCreatedBy() { return createdBy; }

    // SETTERS
    public void setId(Long id) { this.id = id; }
    public void setAmount(Double amount) { this.amount = amount; }
    public void setType(RecordType type) { this.type = type; }
    public void setCategory(String category) { this.category = category; }
    public void setDate(LocalDate date) { this.date = date; }
    public void setDescription(String description) { this.description = description; }
    public void setCreatedBy(User createdBy) { this.createdBy = createdBy; }
}