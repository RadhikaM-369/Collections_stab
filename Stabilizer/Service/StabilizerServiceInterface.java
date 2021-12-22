package com.xworkz.Collections.Stabilizer.Service;

import com.xworkz.Collections.Stabilizer.DTO.StabilizerDto;

public interface StabilizerServiceInterface {
	
	public void ValidateSave(StabilizerDto dto);
	public void display();
	public void remove(StabilizerDto dto);
	public void updatePriceBySerialNo(int newprice,int serialNo);
}
