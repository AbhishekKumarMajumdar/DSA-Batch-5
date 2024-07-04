/**
 * problem4
 */
public class problem4 {

    public String reverseVowels(String s){
        char [] arr = s.toCharArray(); // string to array conversion

        int li = 0;
        int ri = arr.length - 1;

        while (li < ri) { // finding vowel by both side left and right

            char chl = arr[li];
            char chr = arr[ri];

            if(isVowel(chl) && isVowel(chr)){ // if both side have vowels
              arr[li] = chr; // swap
              arr[ri] = chl;
                li++;
                ri--;
            } else if (isVowel(chl)) {
                ri--;
            } else if (isVowel(chr)) {
                li++;
            } else {
                li++;
                ri--;
            }
    
        }
        return new String(arr); // converted char array to string
        
    }

    boolean isVowel(char ch){
        if (ch == 'a' || ch == 'A') {
            return true;
        } else if ( ch == 'e' || ch == 'E' ) {
            return true;
        } else if ( ch == 'i' || ch == 'I' ) {
            return true;
        } else if ( ch == 'o' || ch == 'O' ) {
            return true;
        } else if ( ch == 'u' || ch == 'U' ) {
            return true;
        } else {
            return false;
        }
        
    }
    public static void main(String[] args) {
        problem4 sollution = new problem4(); // instance for problem4 class
        String s = "hello";
        String result = sollution.reverseVowels(s);
        System.out.println(result);
    }
}
