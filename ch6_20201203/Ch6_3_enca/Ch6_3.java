/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201203.Ch6_3_enca;

public class Ch6_3 {
    //封裝 (Encapsulation)
    //物件屬性存取有限制
    //不能夠直接取得資產(屬性)    
    //有機會作驗證
    //資訊分級
    
  
    //你的薪水
    //可能會放銀行
    //領錢  
    //存錢
    public static void main(String[] args){
	//封裝 (Encapsulation)
	//1 修改一個適當的讀取權限
	//2 如果有需要存取 給可存取的窗口
	
	   Employee emp1= new Employee();
	   emp1.name = "Ken";
	   emp1.age = 25;
	   //28000 ~ 200000
	  //emp1.salary = 10;
	   emp1.setSalary(300000);	   	   
	   emp1.print();
	   System.out.println(emp1.getSalary());
    }

    
}

