package com.lyplay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lyplay.domain.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

	Company findById(Long id);

}
