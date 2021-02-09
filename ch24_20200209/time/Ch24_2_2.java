/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20200209.time;
import java.util.Calendar;
/**
 *
 * @author xvpow
 */
public class Ch24_2_2 {
static interface DateInfo{
    static DateInfo newInseance(){	
	return new MyDate();
    }
	}
    private static class MyDate implements DateInfo{
	private int year;
	private int month;
	private int day;
	private String defaultFormat ="%d/%02d/%02d";
	private MyDate(){
	    Calendar calendar =
		    Calendar.getInstance();
	    year = calendar.get(Calendar.YEAR);
	    month = calendar.get(Calendar.MONTH) + 1;
	    day = calendar.get(Calendar.DAY_OF_MONTH);
	}
	public String toString(){
	    return String.format(defaultFormat, year,month,day);
	}
	
	
    }
	
    public static void main(String[] args) {
	// TODO code application logic here
	Calendar calendar = Calendar.getInstance();
	//Calendar.MONTH 月份由０開始	
	System.out.println(calendar.get(Calendar.YEAR)+":"+
		(calendar.get(Calendar.MONTH)+1)+":"+
		calendar.get(Calendar.DAY_OF_MONTH));
	
//	int year = calendar.get(Calendar.YEAR);
//	int month = calendar.get(Calendar.MONTH)+1 ;
//	int date =  calendar.get(Calendar.DATE) ;
//	String newData = 
//		String.format("%d/%02d/%02d", year,month,date);
//	System.out.println(newData);

		DateInfo myDate = new MyDate();
		System.out.println(myDate);
    }
    
}
