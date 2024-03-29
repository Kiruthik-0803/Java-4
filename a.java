public class a {

    public static void main(String[] args) {
        int[] intArray = new int[]{ 0,0,2,1,0,2,1,2}; 
        
        int start = 0, end = str.length() - 1; 

        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) { 
                start++;
                end--; 
            } else {
                System.out.println("NOT PALINDROME");
                return; 
            }
        }
        System.out.println("PALINDROME"); 
    }
}

