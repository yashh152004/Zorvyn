package com.internship_zorvyn.demo.controller;

import com.internship_zorvyn.demo.model.Role;
import com.internship_zorvyn.demo.service.FinancialService;
import com.internship_zorvyn.demo.dto.RecordRequestDTO;
import com.internship_zorvyn.demo.dto.RecordResponseDTO;
import java.util.Map;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/records")
@RequiredArgsConstructor
public class FinancialController {

    private final FinancialService service;

    @PostMapping
    public Object create(@Valid @RequestBody RecordRequestDTO dto,
                         Authentication auth) {
        return service.create(dto, auth.getName());
    }

    @GetMapping
    public Page<RecordResponseDTO> get(
            @RequestParam int page,
            @RequestParam int size,
            Authentication auth
    ) {
        String email = auth.getName();

        Role role = Role.valueOf(
                auth.getAuthorities().iterator().next()
                        .getAuthority().replace("ROLE_", "")
        );

        return service.getRecords(email, PageRequest.of(page, size), role)
                .map(r -> new RecordResponseDTO(
                        r.getId(),
                        r.getAmount(),
                        r.getType().name(),
                        r.getCategory(),
                        r.getDate()
                ));
    }
}