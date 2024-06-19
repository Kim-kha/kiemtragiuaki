package com.example.kiemtra.controller;

import com.example.kiemtra.model.PhongBan;
import com.example.kiemtra.service.PhongBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/phongban")
public class PhongBanController {

    private final PhongBanService phongBanService;

    @Autowired
    public PhongBanController(PhongBanService phongBanService) {
        this.phongBanService = phongBanService;
    }

    @GetMapping("/list")
    public String getAllPhongBan(Model model) {
        model.addAttribute("phongBanList", phongBanService.getAllPhongBans());
        return "list-phongban";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("phongBan", new PhongBan());
        return "add-phongban";
    }

    @PostMapping("/add")
    public String addPhongBan(@ModelAttribute("phongBan") PhongBan phongBan) {
        phongBanService.addPhongBan(phongBan);
        return "redirect:/phongban/list";
    }
}
