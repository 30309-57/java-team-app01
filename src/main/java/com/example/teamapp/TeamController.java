package com.example.teamapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.teamapp.service.SakonoService;

@Controller
public class TeamController {
	@Autowired private SakonoService tanakaService; // メンバーのServiceを注入

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("leaderMsg", "リーダーです！");
        model.addAttribute("tanakaMsg", SakonoService.getProfile()); // 画面に渡す
        return "index";
    }
}
