import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class topicstring{

    public static void main(String[] args){
//        int a = 6;
//        float b = 5.6454f;
//        System.out.printf("The value of a is %d and value of b is %f" , a, b);
//        System.out.format("The value of a is %d and value of b is %f", a, b);

         String name = "Abhinav";
         int value = name.length();
      //  System.out.println(value);

//        String lstring = name.toLowerCase();
//        System.out.println(lstring);
//
//        String ustring = name.toUpperCase();
//        System.out.println(ustring);
//
//        String nonTrimmedString = "    Abhinav    ";
//        System.out.println(nonTrimmedString);
//
//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(3));
        System.out.println(name.replace('i', 't'));

        System.out.println(name.startsWith("Ab"));


        System.out.println(name.equals("Abhinav"));
        System.out.println(name.equalsIgnoreCase("abhinav"));

    }

}

