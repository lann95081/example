package com.example.finalbe.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CoSo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_co_so")
    private Integer maCoSo;
    private String tenCoSo;
    private String ngayKhaiTruong;
    private String diaChi;
    private Boolean trangThai;

    @OneToMany(mappedBy = "coSo")
    @JsonIgnore
    private Set<KhachHang> khachHangs;

    @OneToMany(mappedBy = "coSo")
    @JsonIgnore
    private Set<NhanVien> nhanViens;

    public CoSo() {
    }

    public Set<NhanVien> getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(Set<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    public Integer getMaCoSo() {
        return maCoSo;
    }

    public void setMaCoSo(Integer maCoSo) {
        this.maCoSo = maCoSo;
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

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public Set<KhachHang> getKhachHangs() {
        return khachHangs;
    }

    public void setKhachHangs(Set<KhachHang> khachHangs) {
        this.khachHangs = khachHangs;
    }
}
