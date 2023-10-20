import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {


        // WITHOUT USING INBUILT AND COLLECTIONS HERE....
        // TRUE CASE
        System.out.println(pangramWithoutCollection("abcdefghijklmnopqrstuvwxyz"));
        // FALSE CASE
        System.out.println(pangramWithoutCollection("abcdefghijklmuvwxz"));


        // WITH USING COLLECTIONS
        // TRUE CASE
        System.out.println(pangramWithCollection("abcdefghijklmnopqrstuvwxyz"));
        // FALSE CASE
        System.out.println(pangramWithCollection("abcdefghijklmuvwxz"));

    }

    static Boolean pangramWithoutCollection(String s){
        Boolean[] isPresent = new Boolean[26];

        for (int i = 0; i < 26; i++) {
            isPresent[i] = false;
        }

        char[] arr = s.toLowerCase().toCharArray();

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] >= 'a' && arr[i] <= 'z'){
                int index = arr[i] - 'a';
                isPresent[index] = true;
            }
        }
        for (Boolean present : isPresent){
            if (!present){
                return false;
            }
        }
        return true;
    }

    static Boolean pangramWithCollection(String str){
        str = str.toLowerCase();
        Set<Character> present = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
                present.add(ch);
        }
        return present.size() == 26;
    }
}
