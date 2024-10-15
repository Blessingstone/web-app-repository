package com.blessingstone.ics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blessingstone.ics.model.Student;

@Controller
@RequestMapping("/")
public class StudentController
{
    @GetMapping("/form")
    public String showForm(Model model)
    {
	model.addAttribute("student", new Student());
	return "studentForm";
    }    

    @PostMapping("/submitStudent")
    public String submitForm(@ModelAttribute Student student, Model model)
    {	
	model.addAttribute("student");
	
	return "studentOutput";
    }
   

}
