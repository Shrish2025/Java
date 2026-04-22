//Implement methods for repetition of character in String passed over Command-Line
class Example{
  static int counter1(String k, String s){
    System.out.println("Using split() in counter 1"); 
   String[] charCount = s.split(java.util.regex.Pattern.quote(k));;
    if(charCount[0] == s){
    System.out.println("The number of repetitions for character "+k+" is zero");
    return 0;
    }
    System.out.println("The number of repetitions for character "+k+" is:"+(charCount.length-1));
    return 0;
  }
  static int counter2(char k, String s){
    System.out.println("Using toCharArray() in counter 2"); 
    int count = 0;
    for(char c : s.toCharArray()){
      if(c == k){
          count++;
      }
    }System.out.println("The number of repetitions for character "+k+" is:"+count);
    return 0;
  }
  static int counter3(String k, String s){
    System.out.println("Using replace() in counter 3"); 
    int l = s.replace(k, "").length();
    int n = s.length();
    System.out.println("The number of repetitions for character "+k+" is: "+(n-l));
    return 0;
  }
  static int counter4(char k, String s){
    System.out.println("Using toCharArray() in counter 4"); 
    int count = 0;
    for(char c : s.toCharArray()){
      if(c == k){
          count++;
      }
    }System.out.println("The number of repetitions for character "+k+" is:"+count);
    return 0;
  }
  public static void main(String[] args){
      if(args.length>=2){
		if(args[0].length() != 1){
        		System.out.println("Enter single letter(/character) for 1st Argument!");
        	  	return;
	      		}
	      	if((args.length>2)&&(args[0].length()==1)){
          		System.out.println("Using '"+args[0]+"' and '"+args[1]+"' only!");
      			}
	      	try{
        		counter1(args[0], args[1]);
	        	counter2(args[0].charAt(0), args[1]);
        		counter3(args[0], args[1]);
      			}
      		catch(ArrayIndexOutOfBoundsException ae){
        		System.out.println("Enter both-sentence and character");
	      		}
		return;
	  	}
	System.out.println("Entered "+ args.length+" argument, can't work!");
	return;
	}
}
