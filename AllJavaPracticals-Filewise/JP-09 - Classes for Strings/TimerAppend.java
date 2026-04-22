import java.util.Arrays;
public class TimerAppend {
    public String stringClassMethod(String s) {
        char[] utsav = s.toCharArray();
        for (int i = 1; i <= 2026; i++) {
                String numStr = String.valueOf(i); 
                int numLength = numStr.length();
                int oldLength = utsav.length;
                int newLength = oldLength + 1 + numLength;
                utsav = Arrays.copyOf(utsav, newLength);
                utsav[oldLength] = '_';
                char[] numChars = numStr.toCharArray();
    		for (int j = 0; j < numChars.length; j++) {
        	        utsav[oldLength + 1 + j] = numChars[j];
        		}
        	}
        	return new String(utsav);
	}
	public String bufferClassMethod(String s){
		StringBuffer sBf = new StringBuffer(s);
		for(int i = 1; i<= 2026; i++){
			sBf.append("_").append(i);
		}
		return sBf.toString();
	}
	public String builderClassMethod(String s){
		StringBuilder sBd = new StringBuilder(s);
		for(int i = 1; i<= 2026; i++){
			sBd.append("_").append(i);
		}
		return sBd.toString();
	}
	public static void main(String[] args) {
		TimerAppend timer = new TimerAppend();
        	String example = "UTSAV";
    		System.out.println("1. String class\nStart: " + System.currentTimeMillis());
    		String result = timer.stringClassMethod(example); 
		    System.out.println("End:   " + System.currentTimeMillis());
			System.out.println("2. StringBuffer class\nStart: " + System.currentTimeMillis());
        	result = timer.bufferClassMethod(example);
        	System.out.println("End:   " + System.currentTimeMillis());
			System.out.println("3. StringBuilder class\nStart: " + System.currentTimeMillis());
        	result = timer.builderClassMethod(example);
        	System.out.println("End:   " + System.currentTimeMillis());

	}
}