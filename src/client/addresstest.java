package client;

import beans.address;
import beans.address.Builder;

public class addresstest {

	public static void main(String[] args) 
	{
	
	// building address with all the files. You can give these in any squence. if you
	// use constructor then you have to stick to the sequence of parameters. 
	 address a1 = new address.Builder().houseNumber("A2").street("wakad").state("MH").zipcode("411027").city("Pune").build();
	// you can also pass less parameters. With this method you dont need to create mutiple 
	 // constructor
     address a2 = new address.Builder().houseNumber("A3").street("pimple").state("MH").build();
     System.out.println(a1.toString());
     System.out.println(a2.toString());
		
	}

}
