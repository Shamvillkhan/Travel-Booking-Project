package com.Travell.Application.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Travell.Application.entity.Packages;
import com.Travell.Application.service.PackagesService;

@Controller
@RequestMapping("/packages")
public class PackagesController {

    @Autowired
    private PackagesService packagesService;

    @GetMapping("get-all")
    public String viewPackages(Model model) {
        model.addAttribute("packagesList", packagesService.listAll());
        return "packages-list";
    }

    @GetMapping("/form")
    public String newPackageForm(Model model,Packages packages) {
        model.addAttribute("packages", packages);
        return "packages-form";
    }

    @PostMapping("/save")
    public String savePackage(@ModelAttribute("packages") Packages packages) {
    	packagesService.save(packages);
        return "redirect:/";
    }


}

