package com.example.studentredux;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

interface repository extends JpaRepository<Students,Integer> {
}
