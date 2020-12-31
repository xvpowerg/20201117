/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_3_20201231.innerclass3;

/**
 *
 * @author xvpow
 */
public class UpPredicate implements MyPredicate {
    private String keyword;
    public UpPredicate(String keyword){
	this.keyword = keyword;
    }
    public boolean test(String source){
	return keyword!= null && source!=null
		&& source.contains(keyword);
    }
}
