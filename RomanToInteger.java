public class RomanToInteger {
    public static void main(String[] args) {

        // (Note) : it will work for "X", "V", "I" these roman cases not for "L", "M", "D"
        System.out.println(romanToInt("xxviii"));
    }
    static int romanToInt(String s){
        int sum = 0;

        char[] ch = s.toUpperCase().toCharArray();

        for(int i = 0 ; i<ch.length;i++){

            switch (ch[i]){
                case 'I' :

                    if(i == ch.length - 1){
                        sum += 1;
                        break;
                    }

                    if (ch[i + 1] == 'V') {
                        sum += 4;
                        i++;

                    } else if (ch[i + 1] == 'X') {
                        sum += 9;
                        i++;

                    }
                    else {
                        sum += 1;
                        break;
                    }


                case 'V':
                    sum+=5;
                    break;

                case 'X':
                    if(i == ch.length - 1){
                        sum += 10;
                        break;
                    }
                    else{
                        sum+=10;
                        break;
                    }

            }
        }
        return sum;

    }
}
