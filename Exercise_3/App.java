// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack shoes_stack = new Stack(5);
  
      // Insert new elements into the stack
      shoes_stack.push("Blue Shoes");
      shoes_stack.push("Red Shoes");
      shoes_stack.push("Yellow Shoes");
      shoes_stack.push("Green Shoes");
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + shoes_stack.size());
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + shoes_stack.peek());
  
      // Remove top element in the stack
      shoes_stack.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      shoes_stack.printStack();
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + shoes_stack.peek());
    }
  }

