package com.rikkeiacademy.demo_language.controller;

import com.rikkeiacademy.demo_language.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/insert")
    public String insert(Model model){
        Product p = new Product();
        model.addAttribute("p",p);
        return "insertProduct";
    }

    @PostMapping("/insert")
    public String save(@ModelAttribute Product p, Model model){
        return "viewProduct";
    }
}
