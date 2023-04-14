package com.example.finalbe.dto;

import com.example.finalbe.model.NhanVien;

public class NhanVienDto {
    private String tenCoSo;
    private String ngayKhaiTruong;
    private String diaChi;
    private NhanVien nhanVien;

    public NhanVienDto() {
    }

    public String getTenCoSo() {
        return tenCoSo;
    }

    public void setTenCoSo(String tenCoSo) {
        this.tenCoSo = tenCoSo;
    }

    public String getNgayKhaiTruong() {
        return ngayKhaiTruong;
    }

    public void setNgayKhaiTruong(String ngayKhaiTruong) {
        this.ngayKhaiTruong = ngayKhaiTruong;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
}
