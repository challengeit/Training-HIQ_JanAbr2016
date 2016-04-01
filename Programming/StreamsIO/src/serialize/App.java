package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Wheel[] wheels = new Wheel[2];
		wheels[0] = new Wheel("OZ", "asdadas");
		wheels[1] = new Wheel("BBS", "asdadas");
		
		Vehicle vehicle = new Vehicle("Toyota", "Yaris", wheels);
		write(vehicle);
		
		Vehicle vehicle2 = read();
		System.out.println(vehicle2.getBrand());
	}
	
	private static Vehicle read() throws FileNotFoundException, IOException, ClassNotFoundException {
		try(ObjectInputStream inpS = new ObjectInputStream(new FileInputStream("obj"))) {
			
			Object object = inpS.readObject();
			return (object instanceof Vehicle)? (Vehicle)object : null;
		}
	}
	
	private static void write(Vehicle vehicle) throws FileNotFoundException, IOException {	
		try(ObjectOutputStream outS = new ObjectOutputStream(new FileOutputStream("obj"))) {
			outS.writeObject(vehicle);
		}
	}
}
