package avayi;

public class Robot {

	 public static void main(final String[] args) {
	        for (int i = 1; i <= 14; ++i) {
	            if (i == 1) {
	                for (int j = 1; j <= 7; ++j) {
	                    if (j != 4) {
	                        System.out.println("");
	                    }
	                    else {
	                        System.out.println("");
	                    }
	                }
	            }
	            else if (i > 1 && i <= 4) {
	                for (int j = 1; j <= 7; ++j) {
	                    if (j != 1 && j != 2 && j != 6 && j != 7) {
	                        System.out.println("*");
	                    }
	                    else {
	                        System.out.println("");
	                    }
	                }
	            }
	            else if (i > 4 && i <= 6) {
	                for (int j = 1; j <= 7; ++j) {
	                    if (j != 4) {
	                        System.out.println("");
	                    }
	                    else {
	                        System.out.println("*");
	                    }
	                }
	            }
	            else if (i > 6 && i <= 9) {
	                for (int j = 1; j <= 7; ++j) {
	                    if (j != 2 && j != 6) {
	                        System.out.println("*");
	                    }
	                    else {
	                        System.out.println("");
	                    }
	                }
	            }
	            else if (i > 9 && i <= 12) {
	                for (int j = 1; j <= 7; ++j) {
	                    if (j != 3 && j != 5) {
	                        System.out.println("");
	                    }
	                    else {
	                        System.out.println("*");
	                    }
	                }
	            }
	            else {
	                for (int j = 1; j <= 7; ++j) {
	                    if (j != 1 && j != 4 && j != 7) {
	                        System.out.println("*");
	                    }
	                    else {
	                        System.out.println("");
	                    }
	                }
	            }
	        }
	    }

}
