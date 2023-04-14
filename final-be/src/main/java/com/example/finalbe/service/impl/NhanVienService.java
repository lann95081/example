package com.example.finalbe.service.impl;

import com.example.finalbe.model.NhanVien;
import com.example.finalbe.repository.INhanVienRepository;
import com.example.finalbe.service.INhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService implements INhanVienService {
    @Autowired
    private INhanVienRepository iNhanVienRepository;


    @Override
    public List<NhanVien> findAll() {
        return iNhanVienRepository.findAll();
    }
}
