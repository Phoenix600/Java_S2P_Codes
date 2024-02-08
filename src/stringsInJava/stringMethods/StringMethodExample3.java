package stringsInJava.stringMethods;

public class StringMethodExample3 {
    public static void main(String[] args) {
        // Apple Macbook ===> aPPLE mACBOOK
        String input = "Apple Macbook";
//        input = "aPPLE mACBOOK";
        char[] chars =  input.toCharArray();

        for (int i=0; i<chars.length; i++){
            if(chars[i]>= 65 && chars[i]<=90){
                chars[i] = (char) (chars[i] + 32);
            }else if(chars[i] >= 96 && chars[i] <=122){
                chars[i] = (char)(chars[i]-32);
            }
        }

        System.out.println(chars);
    }
}
