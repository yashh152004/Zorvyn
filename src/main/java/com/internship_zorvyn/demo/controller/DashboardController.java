package com.internship_zorvyn.demo.controller;
import com.internship_zorvyn.demo.service.FinancialService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
@RestController
@RequestMapping("/dashboard")
@RequiredArgsConstructor
public class DashboardController {

    private final FinancialService service;


    @GetMapping("/summary")
    public Map<String, Object> summary() {

        Double income = service.getIncome();
        Double expense = service.getExpense();

        return Map.of(
                "income", income,
                "expense", expense,
                "net", income - expense
        );
    }
}
