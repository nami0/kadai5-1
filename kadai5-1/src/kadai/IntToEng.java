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
	    		return translateEngxx(x,answer,0);
	    	}
	    	if(x.length == 3) {
    			answer = translateEngLastOneDigit(x[0]) + " hundred";
    			if(!x[1].equals("0")) answer = answer + " ";
    			if(x[1].equals("0")) {
    				if(!x[2].equals("0"))answer = answer + " ";
    				return answer + translateEngLastOneDigit(x[2]);
    			}
    			return translateEngxx(x,answer,1);
	    	}
	    	if(x.length == 4) {
	    		answer = translateEngLastOneDigit(x[0]) + " thousand";
	    		if(!x[1].equals("0")) answer = answer + " " + translateEngLastOneDigit(x[1]) + " hundred";
    			if(!x[2].equals("0")) answer = answer + " ";

    			if(x[2].equals("0")) {
    				if(!x[3].equals("0"))answer = answer + " ";
    				return answer + translateEngLastOneDigit(x[3]);
    			}
    			return translateEngxx(x,answer,2);
	    	}
	        return "";
	    }
	    static String translateEngxx(String[] x,String answer,int i) {
	    	if(x[i].equals("1")) return answer + translateEng1x(x[i+1]);
    		if(x[i].equals("2")) answer = answer + "twenty";
    		if(x[i].equals("3")) answer = answer + "thirty";
    		if(x[i].equals("4")) answer = answer + "fourty";
    		if(x[i].equals("5")) answer = answer + "fifty";
    		if(x[i].equals("6")) answer = answer + "sixty";
    		if(x[i].equals("7")) answer = answer + "seventy";
    		if(x[i].equals("8")) answer = answer + "eighty";
    		if(x[i].equals("9")) answer = answer + "ninety";
    		if(!x[i+1].equals("0")) answer = answer + " ";
    		return answer + translateEngLastOneDigit(x[i+1]);
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
