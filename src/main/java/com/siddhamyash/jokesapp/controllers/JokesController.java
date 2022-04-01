package com.siddhamyash.jokesapp.controllers;

import com.siddhamyash.jokesapp.services.JokesService;
import com.siddhamyash.jokesapp.services.JokesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String sendJoke(Model model){

        model.addAttribute("joke", jokesService.getJoke());

        return "index";

    }
}
