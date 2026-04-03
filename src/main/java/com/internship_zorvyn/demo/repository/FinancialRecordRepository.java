package com.internship_zorvyn.demo.repository;

import com.internship_zorvyn.demo.model.FinancialRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialRecordRepository extends JpaRepository<FinancialRecord, Long> {

    @Query("SELECT SUM(f.amount) FROM FinancialRecord f WHERE f.type='INCOME'")
    Double totalIncome();

    @Query("SELECT SUM(f.amount) FROM FinancialRecord f WHERE f.type='EXPENSE'")
    Double totalExpense();

    Page<FinancialRecord> findByCreatedByEmail(String email, Pageable pageable);
}