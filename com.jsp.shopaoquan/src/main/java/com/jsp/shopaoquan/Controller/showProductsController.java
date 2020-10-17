package com.jsp.shopaoquan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jsp.shopaoquan.Entity.product;
import com.jsp.shopaoquan.Service.productService;

@Controller
public class showProductsController {
	@Autowired
	private productService productService;
	@RequestMapping(value = {"/products/{sort}"})
	public String sortProducts(Model model, @PathVariable("sort") String sort) {
		if (sort == null ) {
		List<product> list = productService.findAll();
		model.addAttribute("list", list);
		} else if (sort.equals("sortPrice")) {
			List<product> list = productService.sortPrice();
			model.addAttribute("list", list);
		}
		return "products";
	}
	@RequestMapping("/products")
	public String product(Model model) {
		List<product> list = productService.findAll();
		model.addAttribute("list", list);
		return "products";
	}
	@RequestMapping(value = {"/","/home/{sort}","/home"}, method = RequestMethod.GET)
	public String index(Model model) {
		List<product> listFP = productService.findFP();
		List<product> listLP = productService.findLP();
		model.addAttribute("listFP", listFP);
		model.addAttribute("listLP", listLP);
		
		return "index";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
}
