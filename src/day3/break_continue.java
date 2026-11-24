package day3;

public class break_continue   {
   public static void main(String[] args) {
//       for(int i=0; i<10; i++){
//           System.out.println(i);
//           System.out.println("Java is great");
//           if(i==2){
//               System.out.println("Ending the loop");
             //  break;
       for(int i=0; i<10; i++){
           if(i==2){
               System.out.println("Ending the loop");
               continue;
           }
           System.out.println(i);
           System.out.println("Java is great");
       }

    }
}
