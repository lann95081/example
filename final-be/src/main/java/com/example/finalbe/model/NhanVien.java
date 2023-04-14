package com.example.finalbe.model;

import javax.persistence.*;

@Entity
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maNhanVien;
    private String tenNhanVien;
    private String ngaySinh;
    private boolean gioiTinh;

    @ManyToOne
    @JoinColumn(name = "ma_vi_tri", referencedColumnName = "ma_vi_tri")
    private ViTri viTri;

    @ManyToOne
    @JoinColumn(name = "ma_co_so", referencedColumnName = "ma_co_so")
    private CoSo coSo;

    public NhanVien() {
    }

    public CoSo getCoSo() {
        return coSo;
    }

    public void setCoSo(CoSo coSo) {
        this.coSo = coSo;
    }

    public Integer getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(Integer maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }
}
