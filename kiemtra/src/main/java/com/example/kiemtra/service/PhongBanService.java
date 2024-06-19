package com.example.kiemtra.service;

import com.example.kiemtra.model.PhongBan;
import com.example.kiemtra.repository.PhongBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PhongBanService {
    @Autowired
    private PhongBanRepository phongBanRepository;
    public List<PhongBan> getAllPhongBans() {
        return phongBanRepository.findAll();
    }

    public PhongBan getPhongBanById(String id) {
        return phongBanRepository.findById(id).orElse(null);
    }

    public PhongBan savePhongBan(PhongBan phongBan) {
        return phongBanRepository.save(phongBan);
    }

    public void deletePhongBan(String id) {
        phongBanRepository.deleteById(id);
    }

    public void addPhongBan(PhongBan phongBan) {
    }
}
