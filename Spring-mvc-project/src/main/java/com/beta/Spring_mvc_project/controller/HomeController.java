package com.beta.Spring_mvc_project.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

@RequestMapping("/")
 public String showPage() {
	 return "main-menu";
 }
}
