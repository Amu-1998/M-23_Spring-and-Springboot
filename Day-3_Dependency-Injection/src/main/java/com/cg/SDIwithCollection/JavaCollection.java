package com.cg.SDIwithCollection;

import java.util.List;
import java.util.Set;

public class JavaCollection {
	List addressList;
	Set addressSet;
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	
	public void display()
	{
		System.out.println("List Element :"+addressList+" "+"and Set Elements: "+addressSet);
	}
}
