import java.util.*;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    // constructs an empty tree
    BinarySearchTree numbers = new BinarySearchTree();

    // set scanner to read from commmand line
    Scanner in = new Scanner(System.in);

    System.out.println("Enter integer values seperated by enter to populate the tree");
    System.out.println("Type 'end' to stop entering values");

    // reads values from command prompt
    while (true) {
      try {
        String next = in.next();

        if (next.equals("end")) {
          break;
        }

        // inserts values into the tree
        numbers.insert(Integer.parseInt(next));
      } catch(Exception ex) {
        System.out.println("invalid input");
      }
    }

    in.nextLine();
    System.out.println("Pick a traversal method");

    while (true) {
      try {
        String traversal = in.nextLine();
        if (traversal.equalsIgnoreCase("in order")) {

          // prints all values using in-order traversal
          numbers.inOrder();
          break;

        } else if (traversal.equalsIgnoreCase("pre order")) {

          // prints all values using pre-order traversal
          numbers.preOrder();
          break;

        }
      } catch (Exception ex) {
        System.out.println("invalid input");
      }
    }

  }
}
