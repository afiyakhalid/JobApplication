package com.code.store.companies;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    private  CompanyService companyService;
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
@GetMapping
    public ResponseEntity<List<Company>>  getAllCompany(){

     return new ResponseEntity<>( companyService.getAllCompany(),HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updatedCompany(@PathVariable Long id,@RequestBody Company company){
        companyService.updatedcompany(company,id);
        return  new ResponseEntity<>("company updated successfully", HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<String> addCompany(@RequestBody Company company){
        companyService.create(company);
        return new ResponseEntity<>("Company added successfully",HttpStatus.OK);
    }
}
