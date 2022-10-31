

public class StringySpells {

    // middleFinder
    public static String middleFinder(String a) {
        int len = a.length();
        int middlei = len / 2;
        char conv_midindex = (char)
                    middlei;
        char final_mindex =
                a.charAt(conv_midindex);
        String str =
                Character.toString(final_mindex);
        return str;
    }

    // alphaOmega

    public static String alphaOmega(String a, String b) {
        char ao_char_1 = a.charAt(0);
        char ao_char_2 =
                b.charAt(b.length()-1);
        String ao_string_1 =
                Character.toString(ao_char_1);
        String ao_string_2 =
                Character.toString(ao_char_2);
        return ao_string_1 + ao_string_2;
    }
    // subtractive

    public static String subtractive(String a, int b) {
        return a.substring(0,b)+
                a.substring(b+1);

    }

    // flipper

    public static String flipper(String a, String b) {
        return b.charAt(0) + a.substring(1);

    }
    // aveLen
    public static double aveLen(String a, String b) {
        double len_str1 = a.length();
        double len_str2 = b.length();
        return (len_str1+len_str2) / 2;
    }

}//end of class