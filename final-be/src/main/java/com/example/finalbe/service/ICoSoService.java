package com.example.finalbe.service;

import com.example.finalbe.dto.ICoSoDto;
import com.example.finalbe.model.CoSo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICoSoService {
    Page<ICoSoDto> findAllAndSearch(Pageable pageable);

    void delete(Integer ma);

    void save(String tenCoSo, String ngayKhaiTruong, String diaChi, Integer maNhanVien);
}
