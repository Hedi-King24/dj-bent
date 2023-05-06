package Main;
import java.util.Scanner;
public class Hospital {
	Scanner o=new Scanner (System.in);
	 String Name;
	  String ID;
	  String Illness [] = {"Headache","StomachAche","covid-19","cold ",
	        "Flu","HIV","Bloodtest","tests","cancer","plague"};
	
	  String [] room_number= {"013","121","131","124","213","241","301"};
	  String sickness;
	  int bills;
	  String[] test=Illness;
	  int amount;
	  int Rservice;
int Lservice;
int Dservice;
String [] Doctors={"Dr.Amjad","Dr.Lila","Dr.Ali","Dr.Firas","Dr.Yazn","Dr.Hassan","Dr.Rozhgar"};
int [] DID= {6969,4206,0122,2374,7769,8188,9299};

	  
public void info() {
	System.out.println("Name:"+Name);
	System.out.println("ID:"+ID);
	System.out.println("illness:"+sickness);
	System.out.println("Fee:"+Lservice);
	
}	
public void info1() {
	System.out.println("Name:"+Name);
	System.out.println("ID:"+ID);
	System.out.println("illness:"+sickness);
	
}
public boolean search(String ac_id) {  
    if (ID.equals(ac_id)) {  
        info();  
        return (true);  
    }  
    return (false);  
}
	 

public void Payment() {

		  amount=Rservice+Lservice+Dservice;
		  System.out.println("Your Bil is"+amount+"$");
		  
		}
	  
	  public void  reception()
	  {
	    System.out.println("Welcome to our hospital how we can help you");
	    System.out.println("hi my name is ");
	      Name=o.nextLine();
	      System.out.println("please enter your ID ");
	      ID=o.nextLine();
	      System.out.println("whats your issue ");
	      System.out.println("my sickness is ");
	      sickness=o.nextLine();
	      if(sickness.equals("headache")||sickness.equals("stomachache")||sickness.equals("cold")||sickness.equals("flu"))
	        { 
	          System.out.println("please go to the doctor office of number "+room_number[0]+"Your room fee is 6$ to Doctor "+Doctors[0]);  
	        Rservice=6;
	        }
	        else if(sickness.equals("covid-19")) 
	        {
	          System.out.println("please go to the doctor office of number "+room_number[1]+"Your room fee is 6$ to Doctor "+Doctors[1]);  
	          Rservice=6;
	        }
	        else if(sickness.equals("hiv"))
	        {
	          System.out.println("please go to the doctor office of number "+room_number[2]+"Your room fee is 6$ to Doctor "+Doctors[2]);  
	          Rservice=6;
	        }
	        else if(sickness.equals("bloodtest"))
	        {
	          System.out.println("please go to the doctor office of number "+room_number[3]+"Your room fee is 6$ to Doctor "+Doctors[3]);
	          Rservice=6;
	        }
	        else if(sickness.equals("tests"))
	        {
	          System.out.println("please go to the doctor office of number "+room_number[4]+"Your room fee is 6$ to Doctor "+Doctors[4]);  
	          Rservice=6;
	        }
	        else if(sickness.equals("cancer"))
	        {
	          System.out.println("please go to the doctor office of number "+room_number[5]+"Your room fee is 6$ to Doctor "+Doctors[5]); 
	          Rservice=6;
	        }
	        else 
	        {
	          System.out.println("please go to the doctor office of number "+room_number[6]+"Your room fee is 6$ to Doctor "+Doctors[6]);
	          Rservice=6;
	        } 
	      
	  }
	
	public void labtest() {
		
		System.out.println("whats your issue ");
		sickness=o.nextLine();		
		if (sickness.equals("Headache")||sickness.equals("stomache")||sickness.equals("cold")||sickness.equals("flu")) {
		      System.out.println("your test is back and "+"the charge will be 5$ ");
		      Lservice=5;
		    
		    }
		    else if (sickness.equals("covid-19")) {
		      System.out.println("your test is back and "+"the charge will be 10$ ");
		      Lservice=10;
		     
		    }
		    else if(sickness.equals("hiv")) {
		      System.out.println("your test is back and "+"the charge will be 50$ ");
		      Lservice=50;
		    
		    }
		    else if(sickness.equals("bloodtest")) {
		      System.out.println("your test is back and "+"the charge will be 3$ ");
		      Lservice=3;
		  
		    }
		    else if (sickness.equals("tests")) {
		      System.out.println("your test is back and "+"the charge will be 8$ ");
		      Lservice=8;
		     
		    }
		    else if (sickness.equals("cancer")) {
		      System.out.println("your test is back and "+"the charge will be 100$ ");
		      Lservice=100;
		      
		    }
		    else { 
		      System.out.println("your test is back and "+"the charge will be 25$ ");
		      Lservice=25;
		     
		    }
		}
	
	  public  Boolean Doctor () {
		    
		    System.out.println(" Hello show me your ID ");
		    String nID;
		    nID=o.nextLine();
		    if(ID.equals(nID)) {
		    	info1();
		    	   return (true);
		    }  
		    return (false);	
		}
	  
	  public  void Doctor1 () {
		  String issu;
		  System.out.println("May you please tell me your problem again please");
		  issu=o.nextLine();
		  if(issu.equals("headache")||issu.equals("stomachache")||issu.equals("cold")||issu.equals("flu"))
          { 
  Dservice=5;
    System.out.println("I have seen your isse the doctors fee will be "+Dservice+"$ and please also go get your meds in lab after you did your lab test");
          }
          else if(issu.equals("covid-19")) 
          {
            Dservice=7;
            System.out.println("I have seen your isse the doctors fee will be "+Dservice+"$ and please also go get your meds in lab after you did your lab test");
          }
          else if(issu.equals("hiv")) 
          {Dservice=35;
            System.out.println("I have seen your isse the doctors fee will be "+Dservice+"$ and please also go get your meds in lab after you did your lab test");
          }
          else if(issu.equals("bloodtest")) 
          {
            Dservice=1;
            System.out.println("I have seen your isse the doctors fee will be "+Dservice+"$ and please also go get your meds in lab after you did your lab test");
          }
          else if(issu.equals("tests")) 
          {
            Dservice=12;
            System.out.println("I have seen your isse the doctors fee will be "+Dservice+"$ and please also go get your meds in lab after you did your lab test");
          }
          else if(issu.equals("cancer")) 
          {
            Dservice=125;
            System.out.println("I have seen your isse the doctors fee will be "+Dservice+"$ and please also go get your meds in lab after you did your lab test");
          }
          else 
          {
            Dservice=69;
            System.out.println("I have seen your isse the doctors fee will be "+Dservice+"$ and please also go get your meds in lab after you did your lab test");
          
   }
		  
	  
	  }
}