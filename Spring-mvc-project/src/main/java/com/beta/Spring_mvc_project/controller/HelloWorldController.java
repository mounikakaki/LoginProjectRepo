package com.beta.Spring_mvc_project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
	public class HelloWorldController {
		
		@RequestMapping("/showForm")
		public String showForm() {
			return "helloworld-fprm";
		}

		@RequestMapping("/processForm")
		public String processForm() {
			return "helloworld";
		}
		
		@RequestMapping("/processFormWithModel")
		public String processFormModel(HttpServletRequest request, Model model) {
			String name = request.getParameter("studentName");
			String result=name.toUpperCase();
			model.addAttribute("name", result);
			return "helloworld";
		}
		
		@RequestMapping("/processFormWithReqParam")
		public String processFormModelWithReqParam(@RequestParam("studentName") String name, Model model) {
			String result="Hey "+name.toUpperCase();
			model.addAttribute("name", result);
			return "helloworld";
		}
}
