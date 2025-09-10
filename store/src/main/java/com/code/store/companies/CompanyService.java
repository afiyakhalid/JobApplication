package com.code.store.companies;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompany();
  boolean  updatedcompany(Company company,Long id);
  void create(Company company);


}
