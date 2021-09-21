package pl.itpoznanski.crud_app_after_brake.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.itpoznanski.crud_app_after_brake.service.furnitureService;

import java.util.Optional;

@Controller
public class furnitureController {
    @Autowired
    furnitureService furnitureService;

    //poprzez Index oznaczam domyslna strone
    @GetMapping()
    public String index(Model model){
        model.addAttribute("furnitures",furnitureService.findAll());
        return "index";
    }
    @GetMapping("/deleteFurniture/{id}")
    public String delete (@PathVariable int id){
        furnitureService.deleteById(id);
        return "inform";
    }
}
