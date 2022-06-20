package com.example.demo.web;
import com.example.demo.domain.WebService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;


@Controller
public class WebController {
    private WebService webService;

    @GetMapping("/")
    public String top (){
        return "TopPage";
    }
    
    @GetMapping("/input")
    public String input (){
        return "FormPage";
    }

}
