package com.example.finalbe.repository;

import com.example.finalbe.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INhanVienRepository extends JpaRepository<NhanVien, Integer> {
}
