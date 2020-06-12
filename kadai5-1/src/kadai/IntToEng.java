	package kadai;
	
	import java.util.Scanner;
	public class IntToEng {
	    // メインメソッド
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        System.out.println(translateEng(input));
	    }
	    // 数値を英訳する変換するメソッド
	    static String translateEng(int n) {
	    	String s = String.valueOf(n);
	    	String[] x = s.split("");
	    	String answer = "";
	    	if(x.length == 1) {
	    		if(n == 0) return "zero";
	    		return translateEngLastOneDigit(Integer.parseInt(x[0]));
	    	}
	    	if(x.length == 2) {
	    		if(x[0].equals("1")) return translateEng1x(n);
	    		if(x[0].equals("2")) answer = "twenty ";
	    		if(x[0].equals("3")) answer = "thirty ";
	    		if(x[0].equals("4")) answer = "fourty ";
	    		if(x[0].equals("5")) answer = "fifty ";
	    		if(x[0].equals("6")) answer = "sixty ";
	    		if(x[0].equals("7")) answer = "seventy ";
	    		if(x[0].equals("8")) answer = "eighty ";
	    		if(x[0].equals("9")) answer = "ninety ";
	    		return answer + translateEngLastOneDigit(Integer.parseInt(x[1]));
	    	}
	    	if(x.length == 3) {
	    		if(x[0].equals("1")) {
	    			answer = "one hundred";
	    			if(x[1].equals("0")) {
	    				return answer + translateEngLastOneDigit(Integer.parseInt(x[2]));
	    			}
    				if(x[1].equals("1")) return translateEng1x(n);
    	    		if(x[1].equals("2")) answer = "twenty ";
    	    		if(x[1].equals("3")) answer = "thirty ";
    	    		if(x[1].equals("4")) answer = "fourty ";
    	    		if(x[1].equals("5")) answer = "fifty ";
    	    		if(x[1].equals("6")) answer = "sixty ";
    	    		if(x[1].equals("7")) answer = "seventy ";
    	    		if(x[1].equals("8")) answer = "eighty ";
    	    		if(x[1].equals("9")) answer = "ninety ";
    	    		return answer+translateEngLastOneDigit(Integer.parseInt(x[1]));
	    		}
	    	}
	        return "";
	    }
	    static String translateEng1x(int n) {
	    	if(n == 10) return "ten";
	        if(n == 11) return "eleven";
	        if(n == 12) return "twelve";
	        if(n == 13) return "thirteen";
	        if(n == 14) return "fourteen";
	        if(n == 15) return "fifteen";
	        if(n == 16) return "sixteen";
	        if(n == 17) return "seventeen";
	        if(n == 18) return "eighteen";
	        if(n == 19) return "nineteen";
	        return "";
	    }
	    static String translateEngLastOneDigit(int n) {
	        if(n == 1) return "one";
	        if(n == 2) return "two";
	        if(n == 3) return "three";
	        if(n == 4) return "four";
	        if(n == 5) return "five";
	        if(n == 6) return "six";
	        if(n == 7) return "seven";
	        if(n == 8) return "eight";
	        if(n == 9) return "nine";
	        return "";
	    }
	}
