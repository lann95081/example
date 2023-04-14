package com.example.finalbe.service.impl;

import com.example.finalbe.dto.ICoSoDto;
import com.example.finalbe.model.CoSo;
import com.example.finalbe.repository.ICoSoRepository;
import com.example.finalbe.service.ICoSoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CoSoService implements ICoSoService {
    @Autowired
    private ICoSoRepository iCoSoRepository;

    @Override
    public Page<ICoSoDto> findAllAndSearch(Pageable pageable) {
        return iCoSoRepository.findAllByaAndSearch(pageable);
    }

    @Override
    public void delete(Integer ma) {
        iCoSoRepository.deleteLogical(ma);
    }

    @Override
    public void save(String tenCoSo, String ngayKhaiTruong, String diaChi, Integer maNhanVien) {
        iCoSoRepository.save(tenCoSo,ngayKhaiTruong,diaChi,maNhanVien);
    }
}
