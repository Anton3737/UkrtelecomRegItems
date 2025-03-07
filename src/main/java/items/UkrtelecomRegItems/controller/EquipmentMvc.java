package items.UkrtelecomRegItems.controller;


import items.UkrtelecomRegItems.entity.*;
import items.UkrtelecomRegItems.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/activation")
public class EquipmentMvc {


    private EquipmentDao equipmentDao;



    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("equipment", new EquipmentRegistry());
        return "equipmentRegistrationForm"; // Ім'я Thymeleaf-шаблону (equipment_form.html)
    }

}
