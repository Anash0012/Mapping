package com.example.Mapping.Repository;

import com.example.Mapping.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop, String> {
}
