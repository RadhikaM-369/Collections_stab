package com.xworkz.Collections.Stabilizer.Service;

import com.xworkz.Collections.Stabilizer.DAO.StabilizerImpl;
import com.xworkz.Collections.Stabilizer.DTO.StabilizerDto;
import com.xworkz.Collections.Stabilizer.Exception.InvalidPriceException;
import com.xworkz.Collections.Stabilizer.Exception.InvalidVoltException;
import com.xworkz.Collections.Stabilizer.Exception.IvalidSerialNoException;
import com.xworkz.Speaker.Exceptions.InvalidBrandException;

public class StabilizerServiceImpl implements StabilizerServiceInterface{

	StabilizerImpl stab=new StabilizerImpl();
	boolean status=true;
	
	@Override
	public void ValidateSave(StabilizerDto dto) {
	
		try {
		
			if(dto.getBrand()==null) {
			this.status=false;
			throw new InvalidBrandException("Please enter valid brand name");
			}
			
			if(dto.getPrice()<600) {
				this.status=false;
			throw new InvalidPriceException("Please enter valid price");
			}
			
			if(dto.getSerialNo()==0) {
				this.status=false;
			throw new IvalidSerialNoException("Please enter valid Serial number");
			}
			
			if(dto.getVolt()<15.00) {
				this.status=false;
			throw new InvalidVoltException("Please enter valid Volt");
			}
		}
		catch(InvalidBrandException e) {
			e.printStackTrace();
		}
		catch(InvalidPriceException e) {
			e.printStackTrace();
		}
		catch(IvalidSerialNoException e) {
			e.printStackTrace();
		}		
		catch(InvalidVoltException e) {
			e.printStackTrace();
		}
		
		if(status) {
		stab.save(dto);	
		}
}

	@Override
	public void display() {
	stab.display();
	}

	@Override
	public void remove(StabilizerDto dto) {
	stab.remove(dto);			
	}

	@Override
	public void updatePriceBySerialNo(int newprice, int serialNo) {
	stab.updatePriceBySerialNo(newprice, serialNo);
		
	}

	}

