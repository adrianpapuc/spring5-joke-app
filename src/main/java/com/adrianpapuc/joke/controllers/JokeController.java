package com.adrianpapuc.joke.controllers;

import com.adrianpapuc.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private String joke;

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public void resetJoke(){
        joke = jokeService.getJoke();
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        joke = jokeService.getJoke();
        model.addAttribute("joke",joke);

        return "chucknoris";

    }
}
