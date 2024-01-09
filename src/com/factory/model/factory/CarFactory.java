package com.factory.model.factory;

import com.factory.model.Car;
import com.factory.model.Maruti;
import com.factory.model.Sedan;
import com.factory.model.Suv;
import com.factory.model.enuum.CarType;
import com.factory.model.main.CarTest;

public class CarFactory {
    public Car getCardByType(CarType cartype) {
    	switch (cartype) {
		case SUV: 
			return new Suv();
		case Maruti: 
			return new Maruti();
		case Sedan: 
			return new Sedan();
		default:
			return null;
		}
    }
}
