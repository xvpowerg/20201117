/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20201222.useStatic;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public static String staticValue = "staticValue";
    public  String notStaticValue = "notStaticValue";
   public void testNotStatic(){
       System.out.println(notStaticValue);
   }
   public static void testStatic(){
       System.out.println(staticValue);
   }
   
}
