public class Displaying_in_Array {
    public static void main(String[]args){
       // int [] marks = {98, 45, 79, 99, 80};
//       float [] marks = { 98.5f, 78.5f, 56.5f, 89.5f, 90.5f};
//        System.out.println(marks.length);
//        System.out.println(marks[2]);
//        String [] students = {"Abhinav", "ROhan", "anshit", "Aman", "Shubham"};
//        System.out.println(students.length);
//        System.out.println(students[2]);

        //Displaying the Array (for loop)
        int[] marks = {98, 45, 79, 99, 80};
        for (int i=0; i< marks.length; i++){
            System.out.println(marks[i]);
        }
        //Displaying the Array (for loop)
        System.out.println("Printing using for loop in reverse order");
        for(int i= marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }
    }
}
