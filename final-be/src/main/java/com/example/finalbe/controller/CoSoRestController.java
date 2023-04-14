package com.example.finalbe.controller;

import com.example.finalbe.dto.ICoSoDto;
import com.example.finalbe.dto.NhanVienDto;
import com.example.finalbe.model.CoSo;
import com.example.finalbe.service.ICoSoService;
import com.example.finalbe.service.INhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class CoSoRestController {
    @Autowired
    private ICoSoService iCoSoService;


    @GetMapping("")
    public ResponseEntity<Page<ICoSoDto>> showList(@PageableDefault(value = 2) Pageable pageable) {
        Page<ICoSoDto> coSoDtos = iCoSoService.findAllAndSearch(pageable);
        if (coSoDtos.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(coSoDtos,HttpStatus.OK);
    }

    @DeleteMapping("/{ma}")
    private ResponseEntity<?> delete(@PathVariable("ma") Integer ma) {
        try {
            iCoSoService.delete(ma);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/save")
    private ResponseEntity<?> save(@RequestBody NhanVienDto nhanVienDto) {
        try {
            iCoSoService.save(nhanVienDto.getTenCoSo(), nhanVienDto.getNgayKhaiTruong(), nhanVienDto.getDiaChi(), nhanVienDto.getNhanVien().getMaNhanVien());
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
