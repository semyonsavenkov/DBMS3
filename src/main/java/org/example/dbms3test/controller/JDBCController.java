package org.example.dbms3test.controller;

import lombok.RequiredArgsConstructor;
import org.example.dbms3test.repository.JDBCRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JDBCController {

    final JDBCRepository jdbcRepository;

    @GetMapping("/products/fetch-product")
    public ResponseEntity<?> getProductName(@RequestParam String name) {
        return new ResponseEntity<>(jdbcRepository.getProductName(name), HttpStatus.OK);
    }

}
