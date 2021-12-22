package com.xworkz.Collections.Stabilizer.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.Collections.Stabilizer.DTO.StabilizerDto;

public class StabilizerImpl implements StabilizerInterface{
List stabilizer=new ArrayList();

	@Override
	public void save(StabilizerDto dto) {
		stabilizer.add(dto);
		System.out.println("Object added Successfully");
		
	}

	@Override
	public void display() {
		Iterator iterator=stabilizer.iterator();
		
		while(iterator.hasNext()) {
			StabilizerDto s=(StabilizerDto)iterator.next();
			System.out.println(s.getSerialNo());
			System.out.println(s.getBrand());
			System.out.println(s.getPrice());
			System.out.println(s.getVolt());
			System.out.println("----------------------------");
		}
		
	}

	@Override
	public void remove(StabilizerDto dto) {
		boolean remove=stabilizer.remove(dto);
		
		if(remove) {
			System.out.println("Object removed successfully");
		}
		
	}

	@Override
	public void updatePriceBySerialNo(int newprice, int serialNo) {
		for(Object object:stabilizer) {
			StabilizerDto s=(StabilizerDto)object;
			if(s.getSerialNo()==serialNo) {
				s.setPrice(newprice);
			}
		}
		
	}
		
	}
