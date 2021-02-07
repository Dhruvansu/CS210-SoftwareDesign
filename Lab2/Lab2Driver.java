//Dhruv Thakkar

package Lab2;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab2Driver {
	
	public static void countListings() throws FileNotFoundException {
		int count = 0;
		 Scanner obj = new Scanner(System.in);
		 System.out.println("Enter the filename in .csv format: ");
		 String fname = obj.nextLine();
		 Scanner file = new Scanner(new File(fname));
		 System.out.println("Enter the descriptive phrase: ");
		 String phrase = obj.nextLine();
		 phrase = phrase.toUpperCase();
		 String line;
		 
		 while (file.hasNextLine()) {
			 line = file.nextLine().toUpperCase();
			 if (line.contains(phrase)) {
				 count++;
			 }
		 }
		System.out.println(count);
		 obj.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		countListings();
		Host host1 = new Host(25851263,"Dhruv","02/7/21","Springfield","Upto date with the society", 
			"2 mins","90%","75%",true);
		Host host2 = new Host(12345678,"Thakkar","01/7/21","Webster","Effiecient",
				"3 mins","85%","80%",true);
		Airbnb airbnb1 = new Airbnb(98765432,"New Paradise","A new way to experience Paradise",
				"Family room","Sofas,chairs,sope,shampoo,robe,drinks",99.0,host1,"condo",
				4,2,2,2,4);
		Airbnb airbnb2 = new Airbnb(135792468,"Vintage Dream Gateway","Experience your vintage dream here with us",
				"Executive room","Sofas,massage chais,sopes,shampoos,robes,drinks,adult drinks",145.99,host2,"apartment",
				5,4,3,2,5);
		HotelListing hotel1 = new HotelListing(898989898,"Blue Lagoon","Let you mind explore the waves",
				"penthouse","wifi,swinsuits,robes,tv,sofa,chairs",250.0,0.0,2,true,true,false);
		HotelListing hotel2 = new HotelListing(999636710,"Fantasy Jungle","One Stop shop for vividly unique experiences",
				"Presidential suite","wifi,robes,tv,sofa,chairs",600.0,19.99,0,false,false,true);
		
		System.out.println("Airbnb name: " + airbnb1.getName() + " is hosted by "+ host1.getName());
		System.out.println("Airbnb name: " + airbnb2.getName() + " is hosted by "+ host2.getName());
		System.out.println("Hotel name: " + hotel1.getName() + " - " + hotel1.getDescription());
		System.out.println("Hotel name: "+ hotel2.getName() + " - " + hotel2.getDescription());
		
	}
	
}
