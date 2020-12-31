/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_4_20201231.innerclass4;

/**
 *
 * @author xvpow
 */
public class Ch14_4 {
    
    static void printAnimalSkill(SupplierAnimal ...vargs){
	
	for (SupplierAnimal  sa : vargs){
	   Animal animal  =  sa.get();
	   System.out.println(animal);
	   animal.skill();
	}
	
    }
    
    public static void main(String[] args) {
	//SupplierAnimal 
	//printAnimalSkill() 匯出
	//Dog:Lucy:5 
	//嗅覺
	//Cat:Kitty:35
	//賣萌
	    
	printAnimalSkill(new SupplierAnimal(){
	    public Animal get(){
		return new Dog("Lucy",5);
	    };
	},new SupplierAnimal(){	
	    public Animal get(){
		return new Cat("Kitty",35);
	    }
	});
	
	
    }
}
