/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20200209.time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.time.Period;
/**
 *
 * @author xvpow
 */
public class Ch24_2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	 LocalTime nowTime  = LocalTime.now();
	 System.out.println(nowTime);
	 //LocalTime 最少 需要 時 分
	  LocalTime localTime956 = LocalTime.of(9, 56);
	  System.out.println(localTime956);
	  localTime956 = localTime956.plusMinutes(5);
	  System.out.println(localTime956);
	  
	  LocalTime  localTimePlus2 = nowTime.plusHours(2);
	  //時間為單位
	   Duration duration = Duration.between(nowTime,localTimePlus2);
	   System.out.println(duration);
	  LocalDate localDateNow = LocalDate.now();
	    LocalDate localDateNowPlus2 = localDateNow.plusDays(2);
	    //執行會出錯
	 //   Duration d1 = Duration.between(localDateNow, localDateNowPlus2);
	    Period p2 =Period.between(localDateNow, localDateNowPlus2);
	   // System.out.println(d1);
	    System.out.println(p2);
    }
    
}
