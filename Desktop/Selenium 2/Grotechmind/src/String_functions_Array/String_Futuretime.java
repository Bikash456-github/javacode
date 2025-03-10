package String_functions_Array;

import java.util.Date;

public class String_Futuretime {

	public static void main(String[] args) {
		
    Date d1=new Date();//epoch converter //constructor non para
    System.out.println(d1.getTime());
     d1.getTime();

     Date d2=new Date(d1.getTime()-(1000*60*60*24*4));
     System.out.println(d2);//object class is root class of entire harrchy
     
   String timecurrent=   d2.toString();
   String year= timecurrent.substring(timecurrent.length()-4);
   System.out.println(year);

   String month=timecurrent.substring(4, 7);
   System.out.println(month);
     
   String date=timecurrent .substring(8, 10);
   System.out.println(date);
   
   String psd1=timecurrent.substring(20, 23);
   System.out.println(psd1);
     
   String dateformat1 = date.concat(month).concat(year);
   System.out.println(dateformat1);   
  
  
   String dateformat2 = date.concat("/").concat(month).concat("/").concat(year);
   System.out.println(dateformat2);   

   String dateformat3 = date.concat("-").concat(month).concat("-").concat(year);
   System.out.println(dateformat3);   
  
   String dateformat4 = date.concat(">").concat(month).concat("<").concat(year);
   System.out.println(dateformat4);   
  
  
   
   
  
	}

}
