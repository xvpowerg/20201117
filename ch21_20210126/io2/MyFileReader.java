/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210126.io2;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
/**
 *
 * @author xvpow
 */
public class MyFileReader  extends InputStreamReader {
    public MyFileReader(File file,String charset)
	    throws FileNotFoundException,UnsupportedEncodingException{
	super(new FileInputStream(file),charset);
    }
}
