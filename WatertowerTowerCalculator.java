/*
 *File: name WatertowerTowerCalculator.java
 * 
 *Programmer: Dylon Ross
 *ULID: 847031829
 *
 *Date: Sep 9, 2017
 *
 *Class:IT 168
 *Lecture Section: 16
 *Lecture Instructor: Nasiba Alrawi
 *Lab Section: 18
 *Lab Instructor: Nildfer Fatma
 */
package ilstu.edu;

/**
 *<insert class desciption here>
 *
 * @author Dylon Ross
 *
 */
public class WatertowerTowerCalculator
{ 
	public static void main( String[] args)
	{
		String input = ("Enter the width of the sphere");
		
		
		//double Scanner;
		//sanner scan= new Scanner(System.in );
		
		// Constants
		final double PI=3.14;
		final double GALLONS_CONVERSIONS= 7.48;
	
		
		// Varaibles
		double width=400;
		double radius;
		double radiussquared;
		double radiuscubed;
		double area_in_inches;
		double area_in_feet;
		double volume_in_inches;
		double volume_in_feet;
		double radius_squared;
		double gallons_of_water;
		
	
		
	
		                                  
		// calculations
		width=400;
		radius=width/2;
		radiussquared=radius*radius;
		radiuscubed=Math.pow( radius, 3);
		area_in_inches=4*PI*radiussquared;
		area_in_feet=area_in_inches/12;
		volume_in_inches=4/3*PI*(radiussquared);
		volume_in_feet= volume_in_inches/12;
		gallons_of_water=volume_in_feet*GALLONS_CONVERSIONS;
		
		
		
		
		//output
		
		System.out.println("Enter the width of the sphere");
		System.out.println(width);
		System.out.println("Area in inches = "+  area_in_inches );
		System.out.println("Area in feet = "+  area_in_feet);
		System.out.println("volume in inches = " +  volume_in_inches);
		System.out.println("Volume in feet = " +  volume_in_feet);
		System.out.println("Gallons of Water = "+  gallons_of_water);
		
		
		
				
		
		
		
		
		
		
		
		
		
		
	}
}
