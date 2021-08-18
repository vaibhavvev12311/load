package com.springload.springload.services;

import java.util.List;

import com.springload.springload.entities.Load;

public interface LoadService {
	
	
	
	public List<Load> getLoad();
	
	public Load getLoad(long loadsId);
	
	public Load addLoad(Load load);
	
	public Load updateLoad(Load load);
	
	public void deleteLoad(long loadsId);

}
