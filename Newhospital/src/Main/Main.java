package Main;

import java.util.Scanner;
public class Main extends Hospital { 
	public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";     
    public static final String GREEN = "\033[0;32m";   
    public static final String YELLOW = "\033[0;33m";  
     
	    public static void main(String arg[]) {  
	  Hospital h=new Hospital();
	        
	        System.out.println("\033[0;33m"+"\n ____________________________________________");
	        System.out.println("\033[0;33m"+"\n |               WELCOM TO                  |");  
	        System.out.println("\033[0;33m"+"\n |         ________________________         |");  
        	System.out.println("\033[0;33m"+"\n |____________CIHAN HOSPITAL________________|"); 
        	System.out.println("\033[0;33m"+"\n |       __________________________         |");  
        	System.out.println("\033[0;33m"+"\n |__________________________________________|"+"\033[0m"+"\n"); 
	        h.reception();
	        h.Doctor();
	        h.Doctor1();
	        h.labtest();
	        h.Payment();
	                    	System.out.println("\033[0;33m"+"\n ____________________________________________");
	        	        	System.out.println("\033[0;33m"+"\n |       __________________________         |");  
	        	        	System.out.println("\033[0;33m"+"\n |_______WE HOPE YOU A GOOD HEALTH________  |"); 
	        	        	System.out.println("\033[0;33m"+"\n |       __________________________         |");  
	        	        	System.out.println("\033[0;33m"+"\n |__________________________________________|");
	                        System.exit(0);  
	                }    
	    }


