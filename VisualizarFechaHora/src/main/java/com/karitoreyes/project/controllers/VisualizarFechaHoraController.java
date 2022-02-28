package com.karitoreyes.project.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VisualizarFechaHoraController {
	@RequestMapping("/")
	public String index(Model model) {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		DateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM, yyyy");
		Date date = new Date();
		String dateToSend = dateFormat.format(date);
		model.addAttribute("date", dateToSend);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		DateFormat dateFormat = new SimpleDateFormat("hh:mm aaa");
		Date date = new Date();
		String dateToSend = dateFormat.format(date);
		model.addAttribute("time", dateToSend);
		return "time.jsp";
	}
	
}