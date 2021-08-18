package com.springload.springload.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springload.springload.entities.Load;
import com.springload.springload.services.LoadService;

@RestController
public class MyController {
	
	@Autowired
	private LoadService loadService;
	
	//get the load
	@GetMapping("/load")
	public List<Load> getLoad() 
	{
		return this.loadService.getLoad();
	
	}
	
	//single code get
	@GetMapping("/load/{loadsId}")
	public Load getLoad(@PathVariable String loadsId)
	{
		return this.loadService.getLoad(Long.parseLong(loadsId));
	}
	
	// add load
	@PostMapping("/load")
	public Load addLoad(@RequestBody Load load)
	{
		return this.loadService.addLoad(load);
	}
	
	//update load using put requset
	@PutMapping("/load/{loadsId}")
	public Load updateLoad(@RequestBody Load load)
	{
		return this.loadService.updateLoad(load);
	}
	
	//delete the load
	@DeleteMapping("/load/{loadsId}")
	public void deleteLoad(@PathVariable("loadsId") String loadsId)
	{
		this.loadService.deleteLoad(Long.parseLong(loadsId));
	}
}
