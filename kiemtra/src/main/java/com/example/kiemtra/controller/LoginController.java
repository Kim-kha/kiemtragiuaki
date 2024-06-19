package com.example.kiemtra.controller;

import com.example.kiemtra.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/nhanviens")
public class LoginController {

    @Autowired
    private LoginService loginService; // Inject LoginService

    @GetMapping("/login")
    public String login() {
        return "login"; // Trả về trang login.html
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        boolean isAuthenticated = loginService.authenticate(username, password); // Gọi phương thức authenticate từ LoginService
        if (isAuthenticated) {
            return "redirect:/nhanvien/nhanviens"; // Điều hướng đến trang danh sách nhân viên nếu đăng nhập thành công
        } else {
            model.addAttribute("error", "Tên đăng nhập hoặc mật khẩu không đúng");
            return "login"; // Trả về trang login.html với thông báo lỗi
        }
    }

    @GetMapping("/logout")
    public String logout() {
        // Không cần thực hiện gì cụ thể với logout trong bài này
        return "redirect:/login"; // Điều hướng đến trang login
    }
}
