package com.abstractclass;

 abstract public class Abstr {

	 
	   public int camera(int a,int b)
	   {
		   
		   int c=a+b;
		   
		   System.out.println("result" +c);
		   
		   return c;
	   }
	   
	   public float backlight(float a,float b)
	   {
		   
		   float d=a-b;
		   
		   System.out.println("result" +d);
		   
		   return d;
	   }
	
	   
	   abstract void frontcamera();  // abstract method mention by abstract
	 
	   
	   
	   
	   public static void main(String[] args)
	   {
		   Abstr obj=new Abstr();
		   obj.backlight(12.3, 12.0);
		   obj.camera(23, 54);
		   
		   
	   }
	   
	   //WE CAN NOT INSTANCIATE AN ABSTRACT CLASS
	   
	   
	   
	   
	   
	   
	   
	   
	/*   abstract class contain no.of methods ie either normal methods(non-abstract methods)
	   and abstrct methods(abstract method nothing but A METHOD WHICH DOESN'T CONTAIN ANY BODY
	   IT MEANS WE CAN DECLARE A METHOD WITH ();
	   WHAT EVER METHOD WE DECLARE ,THAT WE CANT DEFINE IN OBJECT.SO THERE IS NO IMPLEMENTATION)
	   
	   THOUGH YOU HAVE NO.OF NON ABSTRACT METHODS WITH ONLY ONE ABSTRACT METHOD,THEN THE CLASS
	   CONSIDERED AS "abstract class"
	   abstract class CAN'T BE INSTANCIATED.
	   */
	
}
