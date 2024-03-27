package com.codegym.mangement_city.controller;

import com.codegym.mangement_city.model.City;
import com.codegym.mangement_city.service.CityService;
import com.codegym.mangement_city.service.CoutryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("city")
public class CityController {
    @Autowired
    private CityService cityService;

    @Autowired
    private CoutryService coutryService;
    @GetMapping
    public String getAll(Model model){
        model.addAttribute("cities", cityService.findAll());
        return "/list_city";
    }

    @GetMapping("/edit")
    public String showEdit(Model model, @RequestParam("id") Long id){
        model.addAttribute("countries", coutryService.findAll());
        model.addAttribute("city", cityService.findById(id));
        return "/edit";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute City city){
        cityService.update(city);
        return "redirect:/city";
    }

    @GetMapping("/delete")
    public String showDelete(@RequestParam("id") Long id){
        cityService.delete(id);
        return "redirect:/city";
    }

    @GetMapping("/info")
    public String showInfo(Model model, @RequestParam("id") Long id){
        model.addAttribute("city", cityService.findById(id));
        return "infoCity";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("coutries", coutryService.findAll());
        return "/create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute City city){
        cityService.add(city);
        return "redirect:/city";
    }
}
