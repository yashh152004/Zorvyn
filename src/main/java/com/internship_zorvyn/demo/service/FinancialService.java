package com.internship_zorvyn.demo.service;

import com.internship_zorvyn.demo.model.*;
import com.internship_zorvyn.demo.repository.FinancialRecordRepository;
import com.internship_zorvyn.demo.repository.UserRepository;
import com.internship_zorvyn.demo.dto.RecordRequestDTO;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FinancialService {

    private final FinancialRecordRepository repo;
    private final UserRepository userRepo;

    

    public FinancialRecord create(RecordRequestDTO dto, String email) {

        User user = userRepo.findByEmail(email).orElseThrow();

        FinancialRecord record = new FinancialRecord();
        record.setAmount(dto.getAmount());
        record.setType(dto.getType());
        record.setCategory(dto.getCategory());
        record.setDate(dto.getDate());
        record.setDescription(dto.getDescription());
        record.setCreatedBy(user);

        return repo.save(record);
    }

    public Page<FinancialRecord> getRecords(String email, Pageable pageable, Role role) {

        if (role == Role.ADMIN) {
            return repo.findAll(pageable);
        }

        return repo.findByCreatedByEmail(email, pageable);
    }

    public Double getIncome() {
        return Optional.ofNullable(repo.totalIncome()).orElse(0.0);
    }

    public Double getExpense() {
        return Optional.ofNullable(repo.totalExpense()).orElse(0.0);
    }
}