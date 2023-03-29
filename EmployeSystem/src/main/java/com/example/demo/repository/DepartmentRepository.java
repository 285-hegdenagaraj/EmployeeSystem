package com.example.demo.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.entity.Department;


public interface DepartmentRepository extends MongoRepository<Department, Integer>{
	public Optional<Department> findById(long id);
	public Optional<List<Department>> findByOrganizationId(long id);
}


