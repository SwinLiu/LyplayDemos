package com.lyplay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lyplay.domain.CompEmployeeGroup;
import com.lyplay.pk.CompEmployeeGroupPK;

public interface CompEmployeeGroupRepository extends JpaRepository<CompEmployeeGroup, CompEmployeeGroupPK> {

	CompEmployeeGroup findById(CompEmployeeGroupPK id);

}
