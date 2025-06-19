package arrayProblems;

public class Test {


    public static void main (String[] args)
    {
        String[] s = {"c","c","c","d","s","d","s","s","c","a","a","b"};
        //dscab
        //final -> dscab
        String result = removeDup(s);
        System.out.println(result);
    }

    // cccdsdsscaab should return dscab
    public static String removeDup(String[] str) {

       //  String s = "cccdsdsscaab";
        // char[] array = s.toCharArray()

       String[] s = {"c","c","c","d","s","d","s","s","c","a","a","b"};

        // List<String> stringList =
        StringBuffer  sb = new StringBuffer();
        for (int i=0;i<s.length;i++) {
//            if(!sb.(s[i])) {
//                sb.append(s[i]);
//            }
            if(!(sb.indexOf(s[i])>-1)) {
                sb.append(s[i]);
            }
        }

        return sb.toString();
    }
}
