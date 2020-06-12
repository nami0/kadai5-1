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
	    		return translateEngLastOneDigit(x[0]);
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
	    		return answer + translateEngLastOneDigit(x[1]);
	    	}
	    	if(x.length == 3) {
    			answer = translateEngLastOneDigit(x[0]) + " hundred";
    			if(!x[1].equals("0")) answer = answer + " ";
    			if(x[1].equals("0")) {
    				if(!x[2].equals("0"))answer = answer + " ";
    				return answer + translateEngLastOneDigit(x[2]);
    			}
				if(x[1].equals("1")) return answer+translateEng1x(x[2]);
				if(x[1].equals("2")) answer = answer+"twenty";
	    		if(x[1].equals("3")) answer = answer+"thirty";
	    		if(x[1].equals("4")) answer = answer+"fourty";
	    		if(x[1].equals("5")) answer = answer+"fifty";
	    		if(x[1].equals("6")) answer = answer+"sixty";
	    		if(x[1].equals("7")) answer = answer+"seventy";
	    		if(x[1].equals("8")) answer = answer+"eighty";
	    		if(x[1].equals("9")) answer = answer+"ninety";
	    		if(!x[1].equals("0")) answer = answer + " ";
	    		return answer+translateEngLastOneDigit(x[2]);
	    	}
	    	if(x.length == 4) {
	    		
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
	    static String translateEngLastOneDigit(String n) {
	        if(n.equals("1")) return "one";
	        if(n.equals("2")) return "two";
	        if(n.equals("3")) return "three";
	        if(n.equals("4")) return "four";
	        if(n.equals("5")) return "five";
	        if(n.equals("6")) return "six";
	        if(n.equals("7")) return "seven";
	        if(n.equals("8")) return "eight";
	        if(n.equals("9")) return "nine";
	        return "";
	    }
	}
