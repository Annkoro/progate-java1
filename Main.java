import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  String firstName = scanner.next();
  String lastName = scanner.next();
  String name = firstName + " " + lastName;
  System.out.println("名前は" + name + "です");
  }
}
