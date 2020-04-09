package leetcode482;

public class FormatDashIntoStringFunction {
	// Well made solution
    public String licenseKeyFormatting(String S, int K) {
    	// Using sb since we will mess with a lot of string
        StringBuilder sb = new StringBuilder();
        
        char[] words = S.toCharArray();
        
        // Counter to know when to reach to K
        int counter = 0;
        
        for(int i = words.length - 1; i >= 0; i--){
        	// If its dash, go to next iteration
            if(words[i] == '-'){
                continue;
            }
            
            // If its time to insert -, reset it back to zero after
            if(counter == K){
                sb.append('-');
                counter = 0;
            }
            
            // Making sure the character are upper case
            if(Character.isDigit(words[i])){
                sb.append(words[i]);
            } else {
                sb.append(Character.toUpperCase(words[i]));
            }
            
            counter++;
        }
        
        // Since we did it from end to beginning, reverse it back
        return sb.reverse().toString();
    }
    
    // First thought of this solution, slower solution since insert take O(n) everytime
    public String licenseKeyFormatting2(String S, int K) {
    	// Delete all the dash
        String withoutDash = S.replace("-","").toUpperCase();
        
        StringBuilder sb = new StringBuilder(withoutDash);
        
        // Increase i by K everytime and start from the end
        for(int i = sb.length() - K; i > 0 ; i = i - K){
            sb.insert(i, '-');
        }
        
        return sb.toString();
    }
}
