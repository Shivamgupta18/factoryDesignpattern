package com.factory.model.main;

import com.factory.model.Car;
import com.factory.model.enuum.CarType;
import com.factory.model.factory.CarFactory;

public class CarTest {
	public static void main(String[] args) {
		CarFactory carfactory = new CarFactory();
		//suv
		
	Car carsuv=carfactory.getCardByType(CarType.Sedan);
	carsuv.printDetails();
	}
}
