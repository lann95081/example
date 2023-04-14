package com.example.finalbe.repository;

import com.example.finalbe.model.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IKhachHangRepository extends JpaRepository<KhachHang, Integer> {
}
