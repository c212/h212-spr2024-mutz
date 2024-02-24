import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Node a = new Node(50, null, null);
    a.insert(30);
    a.insert(80);
    a.insert(10);
    a.insert(20);
    a.insert(40);
    a.insert(70);
    a.insert(60);
    a.insert(90);
    a.insert(45);
    a.insert(35);
    a.insert(33);
    a.insert(0);
    a.delete(50);
    Visitor v = new Reporter();
    a.accept(v);

    Scanner lilly = new Scanner(System.in);
    System.out.print("type> ");
    String line = lilly.nextLine();
    while (! line.equals("bye")) { // originally for find, now for insert
      int num = Integer.parseInt(line);
      a.insert(num);
      a.accept(v); // Max and Junhwi worked this out and others
      System.out.print("type> ");
      line = lilly.nextLine();
    }
  }
}