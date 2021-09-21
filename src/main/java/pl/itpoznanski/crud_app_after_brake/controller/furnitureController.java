package pl.itpoznanski.crud_app_after_brake.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.itpoznanski.crud_app_after_brake.service.furnitureService;

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
}
