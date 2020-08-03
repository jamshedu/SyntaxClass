package com.syntaxclass34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TryCatchFinally {
	
	public static void division(int num, int num1) {
		try {
			System.out.println(num/num1);
		}catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println(ae.getMessage());
			System.out.println(ae);
		}
		}
		public static void read(String filePath)  {
			
			FileInputStream fis=null;
			try {
				fis=new FileInputStream(filePath);
				Properties prop=new Properties();
				prop.load(fis);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(fis!=null) {
						fis.close();
					}
				}catch (IOException e) {
					e.printStackTrace();
				}
			} 
		}
		
	}

	


