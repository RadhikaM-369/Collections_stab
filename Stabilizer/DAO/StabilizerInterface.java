package com.xworkz.Collections.Stabilizer.DAO;

import com.xworkz.Collections.Stabilizer.DTO.StabilizerDto;

public interface StabilizerInterface {
public void save(StabilizerDto dto);
public void display();
public void remove(StabilizerDto dto);
public void updatePriceBySerialNo(int newprice,int serialNo);
}
