package com.example.finalbe.repository;

import com.example.finalbe.dto.ICoSoDto;
import com.example.finalbe.model.CoSo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ICoSoRepository extends JpaRepository<CoSo, Integer> {
    @Query(value = "select c.ma_co_so as maCoSo, c.ten_co_so as tenCoSo," +
            "c.ngay_khai_truong as ngayKhaiTruong," +
            "c.dia_chi as diaChi," +
            "n.ten_nhan_vien as tenNhanVien" +
            " from `co_so` as c" +
            " join `nhan_vien` as n on c.ma_co_so = n.ma_co_so" +
            " join `vi_tri` as v on n.ma_vi_tri = v.ma_vi_tri" +
            " where v.ma_vi_tri = 1 and c.trang_thai = false",nativeQuery = true)
    Page<ICoSoDto> findAllByaAndSearch(Pageable pageable);

    @Modifying
    @Transactional
    @Query(value = "update `co_so` set trang_thai = true where ma_co_so = :ma", nativeQuery = true)
    void deleteLogical(@Param("ma") Integer ma);

    @Modifying
    @Transactional
    @Query(value = "insert into co_so(ten_co_so,ngay_khai_truong,dia_chi,ma_nhan_vien) value (:tenCoSo, :ngayKhaiTruong, :diaChi, :maNhanVien)", nativeQuery = true)
    void save(@Param("tenCoSo") String tenCoSo,
              @Param("ngayKhaiTruong") String ngayKhaiTruong,
              @Param("diaChi") String diaChi,
              @Param("maNhanVien") Integer maNhanVien);
}
