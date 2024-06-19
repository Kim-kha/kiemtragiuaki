package com.example.kiemtra.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//import javax.persistence.Entity;
//import javax.persistence.Id;
import java.util.Set;
//import javax.persistence.OneToMany;

@Entity

public class PhongBan {
    @Id
    private String maPhong;
    private String tenPhong;

    @OneToMany ( mappedBy = "phongBan")
    private Set<NhanVien> nhanViens;

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public Set<NhanVien> getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(Set<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }
}
