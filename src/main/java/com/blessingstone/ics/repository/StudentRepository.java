package com.blessingstone.ics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blessingstone.ics.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>
{

}
