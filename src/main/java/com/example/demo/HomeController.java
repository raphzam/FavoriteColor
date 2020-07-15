package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Random;

@Controller
public class HomeController {

    @RequestMapping("/survey")
    public String loadSurvey(Model model){
        model.addAttribute("answers", new Answers());
        model.addAttribute("question", questionGenerator());
        return "survey";
    }

    @PostMapping("/survey")
    public String loadResults(@Valid Answers answers, BindingResult result){
        if (result.hasErrors()){
            return "survey";
        }
        return "results";
    }

    public String questionGenerator(){
        Random random = new Random();
        String question="";
        int questionPicker = random.nextInt(1);

        if(questionPicker==0){
            question = "What is your favorite color?";
        } else {
            question = "What is the speed of an unladen swallow?";
        }

    return question;

}



}




