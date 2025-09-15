package com.sudal.springtest.jpa.repository;

import com.sudal.springtest.jpa.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
