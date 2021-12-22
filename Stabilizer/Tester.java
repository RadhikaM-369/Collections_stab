package com.xworkz.Collections.Stabilizer;

import com.xworkz.Collections.Stabilizer.DTO.StabilizerDto;
import com.xworkz.Collections.Stabilizer.Service.StabilizerServiceImpl;

public class Tester {

	public static void main(String[] args) {
	StabilizerServiceImpl s=new StabilizerServiceImpl();
	
StabilizerDto s1=new StabilizerDto(1121," Vgaurd", 1000, 20.50);
	
StabilizerDto s2=new StabilizerDto(1122," Vgaurd Crystal", 1600, 20.50);
StabilizerDto s3=new StabilizerDto(1123," Microtek", 2000, 160.00);
StabilizerDto s4=new StabilizerDto(1124," Sypro Axvolt", 2100, 165.50);

s.ValidateSave(s1);
s.ValidateSave(s2);
s.ValidateSave(s3);
s.ValidateSave(s4);

s.display();

s.remove(s1);
System.out.println("After deleting object ");
s.display();
s.updatePriceBySerialNo(1200, 1123);
System.out.println("After updating new price");
s.display();
}

}
