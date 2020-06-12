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
	    		if(x[0].equals("1")) return translateEng1x(x[1]);
	    		if(x[0].equals("2")) answer = "twenty";
	    		if(x[0].equals("3")) answer = "thirty";
	    		if(x[0].equals("4")) answer = "fourty";
	    		if(x[0].equals("5")) answer = "fifty";
	    		if(x[0].equals("6")) answer = "sixty";
	    		if(x[0].equals("7")) answer = "seventy";
	    		if(x[0].equals("8")) answer = "eighty";
	    		if(x[0].equals("9")) answer = "ninety";
	    		if(!x[1].equals("0")) answer = answer + " ";
	    		return answer + translateEngLastOneDigit(Integer.parseInt(x[1]));
	    	}
	    	if(x.length == 3) {
	    		if(x[0].equals("1")) {
	    			answer = "one hundred";
	    			if(!x[1].equals("0")) answer = answer + " ";
	    			if(x[1].equals("0")) {
	    				if(!x[2].equals("0"))answer = answer + " ";
	    				return answer + translateEngLastOneDigit(Integer.parseInt(x[2]));
	    			}
    				if(x[1].equals("1")) return answer+translateEng1x(x[2]);
    				if(x[0].equals("2")) answer = "twenty";
    	    		if(x[0].equals("3")) answer = "thirty";
    	    		if(x[0].equals("4")) answer = "fourty";
    	    		if(x[0].equals("5")) answer = "fifty";
    	    		if(x[0].equals("6")) answer = "sixty";
    	    		if(x[0].equals("7")) answer = "seventy";
    	    		if(x[0].equals("8")) answer = "eighty";
    	    		if(x[0].equals("9")) answer = "ninety";
    	    		if(!x[1].equals("0")) answer = answer + " ";
    	    		return answer+translateEngLastOneDigit(Integer.parseInt(x[1]));
	    		}
	    	}
	        return "";
	    }
	    static String translateEng1x(String n) {
	    	if(n.equals("0")) return "ten";
	        if(n.equals("1")) return "eleven";
	        if(n.equals("2")) return "twelve";
	        if(n.equals("3")) return "thirteen";
	        if(n.equals("4")) return "fourteen";
	        if(n.equals("5")) return "fifteen";
	        if(n.equals("6")) return "sixteen";
	        if(n.equals("7")) return "seventeen";
	        if(n.equals("8")) return "eighteen";
	        if(n.equals("9")) return "nineteen";
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
