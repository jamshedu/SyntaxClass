package com.syntaxclass34;

class BalanceException extends RuntimeException{
	public BalanceException(String messages) {
		
		super(messages);
	}
	
}
public class ThrowKeyword {

	public static void main(String[] args) {
		
		
		NullPointerException npe=new NullPointerException();
		//throw npe;
		
		//throwException();
		withdraw(100, 1000);

	}
	public static void withdraw(int balance,int amount ) {
		if (amount >balance) {
			throw new RuntimeException("You balance is too low");
		}
	}
	

	private static void throwException() {
		throw new ArithmeticException();
	}

}
