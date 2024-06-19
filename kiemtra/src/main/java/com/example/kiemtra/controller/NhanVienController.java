package com.example.kiemtra.controller;

import com.example.kiemtra.model.NhanVien;
import com.example.kiemtra.model.PhongBan;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import com.example.kiemtra.service.NhanVienService;
import com.example.kiemtra.service.LoginService;
import com.example.kiemtra.service.PhongBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    @Autowired
    private PhongBanService phongBanService;

    public String list(Model model) {
        model.addAttribute("listNhanViens", nhanVienService.getAllNhanViens());
        return "index";
    }


    @GetMapping("/nhanviens")
    public String viewHomePage(Model model) {
        model.addAttribute("nhanVien", nhanVienService);

        model.addAttribute("listPhongBans", phongBanService.getAllPhongBans());
        return "update_nhanvien" ;
    }


    @GetMapping("/deleteNhanVien/{id}")
    public String deleteNhanVien(@PathVariable(value = "id") String id) {
        nhanVienService.deleteNhanVien(id);
        return "redirect:/nhanviens";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        SecurityContextHolder.clearContext(); // Xóa thông tin đăng nhập
        return "redirect:/login"; // Điều hướng đến trang login
    }
}
