/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20200209.time;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.Period;
public class Ch24_2_3 {
    public static void main(String[] args) {
	LocalDate date1 = LocalDate.now();
	System.out.println(date1);
	System.out.println(date1.getMonth());
	System.out.println(date1.getMonthValue());
	
	LocalDate date20200525 = LocalDate.of(2020, 5, 25);
	System.out.println(date20200525);
	//所有方法都不會改變自己
	 LocalDate date2 = date20200525.plusDays(1);
	System.out.println(date2);
	 LocalDate date3 =  date20200525.plusDays(8);
	System.out.println(date3);
	LocalDate date20200228 = LocalDate.of(2021, 2, 28);
	LocalDate date4 = date20200525.plus(2, ChronoUnit.DAYS);
	System.out.println(date4);
	//LocalDate 只能控制時間相關的
	//LocalDate date5 =  date20200525.plus(2, ChronoUnit.SECONDS);
	//日期先後
	LocalDate nowDate= LocalDate.now();
	LocalDate plus2Day= nowDate.plusDays(2);
//	plus2Day = plus2Day.plusMonths(3);
//	plus2Day = plus2Day.plusYears(5);
	System.out.println(nowDate);
	System.out.println(plus2Day);
	// 之前
	System.out.println(nowDate.isBefore(plus2Day));
	// 之後
	System.out.println(plus2Day.isAfter(nowDate));
	//計算日期差
	//日期為單位
	Period period = Period.between(nowDate, plus2Day);
	System.out.println(period);
	
    }
    
}
