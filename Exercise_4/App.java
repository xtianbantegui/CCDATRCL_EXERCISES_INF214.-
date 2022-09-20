import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {

        Queue<String> StudentName = new LinkedList<>();

        // Enqueue 5 of your classmates in this section 
        StudentName.add("Jethro Ruiz Vargas");
        StudentName.add("Carlos Leslie Legaspi");
        StudentName.add("Kean John Dapatillo");
        StudentName.add("Jul Seth Mari Mercado");
        StudentName.add("Idel Lawrence Aranilla");
        
        // Display all elements of the queue.
         System.out.println(StudentName);
        
        // Get the size of the queue
           System.out.println(StudentName.size());

        // Get the front of the queue
           System.out.println(StudentName.peek());
        
        // Dequeue 5 of your classmates
           StudentName.remove();
           StudentName.remove();
           StudentName.remove();
           StudentName.remove();
           StudentName.remove();

        // Enqueue another 5 of you classmates
        StudentName.add("Ma. Teresa Jesmari Erl Labon");
        StudentName.add("Ivan Guansing");
        StudentName.add("Jamil Valencia");
        StudentName.add("Richael Paller");
        StudentName.add("Alliyah Almocera");

         // Get the size of the queue 
         System.out.println(StudentName.size());

         // Get the front of the queue
         System.out.println(StudentName.peek());
        
         // Display all elements of the queue.
         System.out.println(StudentName);

    }

}
