package com.example.kiemtra.repository;

import com.example.kiemtra.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NhanVienRepository
    extends JpaRepository<NhanVien, String>
{
}