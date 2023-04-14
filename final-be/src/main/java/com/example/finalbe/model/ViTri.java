package com.example.finalbe.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ViTri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_vi_tri")
    private Integer maViTri;
    private String tenViTri;

    @OneToMany(mappedBy = "viTri")
    @JsonIgnore
    private Set<NhanVien> nhanViens;

    public ViTri() {
    }

    public Integer getMaViTri() {
        return maViTri;
    }

    public void setMaViTri(Integer maViTri) {
        this.maViTri = maViTri;
    }

    public String getTenViTri() {
        return tenViTri;
    }

    public void setTenViTri(String tenViTri) {
        this.tenViTri = tenViTri;
    }

    public Set<NhanVien> getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(Set<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }
}
