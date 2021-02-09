/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20200209.time;
import java.time.LocalDateTime;
import java.time.Duration;
/**
 *
 * @author xvpow
 */
public class Ch24_2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//年月日時分
	LocalDateTime  ofLocalDateTime =
		LocalDateTime.of(2020, 5, 10, 12, 5);
	System.out.println(ofLocalDateTime);
	LocalDateTime nowLocalDateTime = LocalDateTime.now();
	LocalDateTime nowLocalDateTimep2 = nowLocalDateTime.plusDays(2);
	Duration duration = 
		Duration.between(nowLocalDateTime, nowLocalDateTimep2);
	//時間為單位
	System.out.println(duration);
    }
    
}
