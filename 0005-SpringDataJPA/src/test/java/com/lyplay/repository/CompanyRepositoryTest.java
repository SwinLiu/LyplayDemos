package com.lyplay.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lyplay.BaseTest;
import com.lyplay.domain.Company;

public class CompanyRepositoryTest extends BaseTest{

	@Autowired
    private CompanyRepository companyRepository;
	
    @Test
    public void test() throws Exception {
    	Company company = new Company();
    	company.setCompanyName("Swin test");
    	
    	companyRepository.save(company);
    	
    	company.setAddress("Test address");
    	
    	companyRepository.save(company);
    }

}
