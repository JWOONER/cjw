package com.neighborCabinet.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeaderTest {
	
	@RequestMapping("/header")
	public String head() {
		return "/layout/header";
	}
	
	@RequestMapping("/boxList")
	public String boxList(Model model) {
		
//		ArrayList<BoxInfoVO_y> type_A = service.type_AList();
//		ArrayList<BoxInfoVO_y> type_B = service.type_BList();
//		model.addAttribute("type_A", type_A);
//		model.addAttribute("type_B", type_B);
		
		return "/boxOrder/boxList";
	}
	
	@RequestMapping("/boxOrder")
	public String boxOrder() {
		
		return "/boxOrder/boxOrder";
	}
	@RequestMapping("/boxOrder2")
	public String boxOrder2() {
		
		return "/boxOrder/boxOrder2";
	}
}
