// reverse the string manully
public class string2 {
    public static void main(String[] args) {
        String st = "hello";
        String rv = "";

        for(int i = st.length() - 1; i>= 0; i--){
            rv += st.charAt(i);

        }
        System.out.println(rv);
    }
}

// STRING_NAME.length() = shows the length of the string
//STRING_NAME.charAt(2) = shows the character at 2nd position of the string



