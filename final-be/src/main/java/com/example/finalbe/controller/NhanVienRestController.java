package com.example.finalbe.controller;

import com.example.finalbe.dto.ICoSoDto;
import com.example.finalbe.model.NhanVien;
import com.example.finalbe.service.INhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class NhanVienRestController {
    @Autowired
    private INhanVienService iNhanVienService;

    @GetMapping("/nhan-vien")
    public ResponseEntity<?> showList() {
        List<NhanVien> nhanViens = iNhanVienService.findAll();
        if (nhanViens.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(nhanViens,HttpStatus.OK);
    }
}
