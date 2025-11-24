package tasks;

public class CheckNearByLetter {

	public static void main(String[] str) {
		
		String st = "abaabbb";
		
		System.out.println(checkString(st));
	}
	
	public static boolean checkString(String st) {		
		
        char[] ch = st.toCharArray();
        boolean varA = false; //true , true , true
        boolean varB = false; //true , true , true

        for(int i=0; i<ch.length; i++) {

            if(ch[i]=='a') {
                varA = true;
                if(varB == true) {
                    return false;
                }
            
            }else {
                varB = true;
            }
        }

        return varA;
	}
}
