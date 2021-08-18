package com.springload.springload.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springload.springload.entities.Load;

@Service
public class LoadServiceImp implements LoadService{
	
	List<Load>list;
	
	public LoadServiceImp() {
		
		list=new ArrayList<>();
		list.add(new Load(100,"mumbai","bhopal","hard","container",5,500,"nothing",17082021));
		list.add(new Load(102,"goa","bhopal","hard","container",50,5000,"nothing",17082021));
		
	}

	@Override
	public List<Load> getLoad() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Load getLoad(long loadsId) {


		Load l =null;
		
		for(Load load: list)
		{
			if (load.getId()==loadsId) {
				l=load;
				break;
			}
		}
		return l;
	}

	@Override
	public Load addLoad(Load load) {
		list.add(load);
		return load;
	}

	@Override
	public Load updateLoad(Load load) {


		list.forEach(e->{
			if (e.getId()==load.getId()) {
				e.setLoadingPoint(load.getLoadingPoint());
				e.setUnloadingPoint(load.getUnloadingPoint());
				e.setProductType(load.getProductType());
				e.setTruckType(load.getTruckType());
				e.setNoOfTruck(load.getNoOfTruck());
				e.setWeight(load.getWeight());
				e.setComment(load.getComment());
				e.setDate(load.getDate());
			}
		});
		return load;
	}

	@Override
	public void deleteLoad(long loadsId) {
		list.stream().filter(load->{
			if (load.getId()!=loadsId) {
				return true;
			}else {
				return false;
			}
		}).collect(Collectors.toList());
		
	}


	}


