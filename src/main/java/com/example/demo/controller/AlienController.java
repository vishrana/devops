package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienModelDAO;
import com.example.demo.model.AlienModel;

@Controller
public class AlienController {
   	
	@Autowired
	AlienModelDAO adao;
	
	@RequestMapping("/")
	@ResponseBody
	public List<AlienModel> fetchAlien() {
		System.out.print(adao.findAll());
		return adao.findAll();
	}
	
	@GetMapping("/alien/{aid}")
	@ResponseBody
	public Optional<AlienModel> fetchAlien(@PathVariable("aid") int aid) {
		System.out.print(adao.findById(aid));
		return adao.findById(aid);
	}
	
	@PostMapping("/alien")
	@ResponseBody
	public AlienModel fetchAlien(@RequestBody AlienModel al) {
		System.out.print(al.toString());
		adao.save(al);
		return al;
	}
	
	@PutMapping("/alien")
	@ResponseBody
	public AlienModel fetchAlienPut(@RequestBody AlienModel al) {
		System.out.print(al.toString());
		adao.save(al);
		return al;
	}

	
	
}
