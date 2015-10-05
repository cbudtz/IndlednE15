package car2;
import java.awt.Color;

import car2.Car2;

public class Tests {

	public static void main(String[] args) {
		Car2 c = new Car2("Citroen", "SV 34234", "Rød");
		Car2 c2 = new Car2("Citroen", "SK 34233", "Blå");
		Car2 c3 = new Car2("Citroen", "LI 23432", "Rød");
		Car2 c4 = new Car2("Citroen", "SV 34234", "Rød");
		///Test
		System.out.println(c.alike(c2));
		System.out.println(c.alike(c3));
		///Test
		System.out.println(c.equals(c2));
		System.out.println(c.equals(c));
		System.out.println(c.equals(c4));
		///Test
		System.out.println(c.toString());
		System.out.println(c2.toString());
		///Test
		System.out.println(c.getBrand()) ; 
		System.out.println(c.getColor());
		System.out.println(c.getLicenseplate());
		c.setBrand("Tesla");
		System.out.println(c.alike(c4));
		c.setLicenseplate("DTU ROCKS");
		System.out.println(c.equals(c4));
		c3.setColor(Color.CYAN.toString());
		System.out.println(c3.alike(c4));
		///Test
		System.out.println(c4.getRegno());
		System.out.println(c3.getRegno());
		System.out.println(c2.getRegno());
		System.out.println(c.getRegno());
		System.out.println(Car2.getNextRegno());
		///EOT

	}

}
