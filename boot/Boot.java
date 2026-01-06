import java.util.Scanner;
import java.awt.Desktop;
import java.io.*;

public class Boot {
  public static void main(String args[]) throws Exception {
    Scanner scan = new Scanner(System.in);
    String intake;
    String userName;
    
    System.out.print(":> Hello user! What's your name?\n->");
    intake = scan.nextLine();
    userName=intake;
    System.out.println(":> Got it. Let's roll, [" + userName +"]!");
  }
}