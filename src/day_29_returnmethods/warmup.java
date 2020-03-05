package day_29_returnmethods;
public class warmup {
    /*
     Warm up:
    1. write a method that can find the frequency of characters in String.
    Ex: 
        FrequencyTest("XXXYYYZZZ")
        output: X3Y3Z3
        FrequencyTest("AAABBBBBCCCC")
        output: A3B5C4
        
     */
    public static void main(String[] args) {
        
        String str = "aabbaaabbbcccccDDaaEEE";
        
            //    expected result:   a5b5c5D2
                // letters:  "abcd"
        
        String RemoveDup = "";  // to store the non duplicated values of the str
        for(int i=0; i < str.length(); i++) {
            if( ! RemoveDup.contains( str.substring(i, i+1)) ) {
                RemoveDup += str.substring(i, i+1);
            }
        }
        
        System.out.println(RemoveDup);
        
        //    str = "aabbaaabbbcccccDD";     RemoveDup = "abcd";
                                              //          j, j+1
                                                    
        //           (1, 2)
        //           result = a5b5c5D2
        
        String result ="";  // to store the expected result
        
        
    for(int j=0; j < RemoveDup.length(); j++) {
        int count =0;  // count the numbers of appearances
        for(int i=0; i < str.length(); i++) {
            if( str.substring(i, i+1).equals( RemoveDup.substring(j, j+1)) ) {
            	//  if the first index of the str equals to the removedup' first index, add 1 to count.
                count++;
            }
        }
            result += RemoveDup.substring(j, j+1) + count;          
        }
            
            System.out.println(result);
            
    //==============================================Task 2 below=========================================//INTERVIEW QUESTION
       
            System.out.println("===================");   
            String input = "XXXYYYZZZ";
            //exp res:      X3Y3Z3
            //letters XYZ
            
            String nonDup = "";//remove duplicates from input, and store it
            for(int i= 0; i<input.length();i++) {
            	if(!nonDup.contains(""+input.charAt(i))) {
            		nonDup += ""+input.charAt(i);
            	}
            }
            
            System.out.println(nonDup);                                
            
            String expRes = "";
            
            for(int j=0; j<nonDup.length();j++) {
            int times =0;
            for(int i =0; i<input.length();i++) {
            	if(input.substring(i,i+1).equals("X")) {
            		times++;
            	}
            }
        expRes += nonDup.substring(j,j+1)+times;
       
            }
            System.out.println(expRes);
    }
    
    
}




