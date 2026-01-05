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

    System.out.print(":> What file should I read?\n->");
    intake = scan.nextLine();
    File image = new File(intake);
    
    try (Scanner myReader = new Scanner(image)) {
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    // byte WIDTH = 16;
    // for (int a = 0; a < WIDTH/4; a++) {
    //     for (int b = 0; b < WIDTH; b++) {
    //     	System.out.print("X");
    //     }
    //     System.out.println();
    // }
  }
}