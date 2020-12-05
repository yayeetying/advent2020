import java.io.*;
import java.util.Scanner;

public class code3{

  public static void main(String[] args) {
    try {
      Scanner myReader = new Scanner(new File("input3.txt"));
      int row = 0;
      int trees = 0;
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        if (data.charAt(row*3%31) == '#') {
          trees++;
        }
        row++;
      }
      System.out.println(trees);
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
    }
  }


}
