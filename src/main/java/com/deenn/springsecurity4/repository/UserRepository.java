package com.deenn.springsecurity4.repository;

import com.deenn.springsecurity4.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Student, Long> {
}
