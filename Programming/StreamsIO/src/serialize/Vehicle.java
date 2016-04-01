package serialize;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Vehicle implements Serializable {
	
	private final String  _brand;
	private final String  _model;
	private final transient Wheel[] _wheels;
	
	public Vehicle(String brand, String model, Wheel[] wheels) {
		_brand  = brand;
		_model  = model;
		_wheels = wheels;
	}
	
	public String getBrand() {
		return _brand;
	}
	
	public String getModel() {
		return _model;
	}
	
	public Wheel[] getWheels() {
		return _wheels;
	}
	
	private void writeObject(ObjectOutputStream outS) throws IOException {
		outS.defaultWriteObject();
		outS.writeObject(new Date());
		System.out.println("Write Vehicle Object.");
	}
	
	private void readObject(ObjectInputStream outS) throws IOException, ClassNotFoundException {
		outS.defaultReadObject();
		Object date = outS.readObject();
		if(date instanceof Date) 
			System.out.println(((Date)date).getTime());
		
		 System.out.println("Read Vehicle Object.");
	}
}
