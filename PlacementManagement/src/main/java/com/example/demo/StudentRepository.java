package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

//JPARepository is exist in Spring data JPA  dependencies and it contains all
//the CRUD operation of spring JPA

public interface StudentRepository extends JpaRepository<Student,Integer>
{

}
