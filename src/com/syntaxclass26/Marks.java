package com.syntaxclass26;

abstract public class Marks {
	
	   public abstract double getPercentage();
	}

	class StudentA extends Marks {
	    int mark1, mark2, mark3;
	    StudentA(int mark1, int mark2, int mark3) {
	           this.mark1 = mark1;
	           this.mark2 = mark2;
	           this.mark3 = mark3;
	    }
	    public double getPercentage() {
	           return (mark1 + mark2 + mark3) / 3;
	    }
	}
	class StudentB extends Marks {
	    int mark1, mark2, mark3, mark4;
	    StudentB(int mark1, int mark2, int mark3, int mark4) {
	           this.mark1 = mark1;
	           this.mark2 = mark2;
	           this.mark3 = mark3;
	           this.mark4 = mark4;
	    }
	    public double getPercentage() {
	           return (mark1 + mark2 + mark3 + mark4) / 4;
	    }

}
