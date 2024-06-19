package com.example.kiemtra.service;

import com.example.kiemtra.model.NhanVien;
import com.example.kiemtra.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;
    public List<NhanVien> getAllNhanViens(){
        return nhanVienRepository.findAll();
    }

    public NhanVien getNhanVienById(String id){
        return nhanVienRepository.findById(id).orElse(null);
    }

    public NhanVien saveNhanVien(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    public void deleteNhanVien(String id) {
        nhanVienRepository.deleteById(id);
    }

}
