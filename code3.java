import java.io.*;
import java.util.Scanner;

public class code3{

  public static void main(String[] args) {
    try {
      double[] slopes = new double[] {1.0, 3.0, 5.0, 7.0, 0.5};
      long multAllTrees = 1;
      for (int i = 0; i < slopes.length; i++) {
        Scanner myReader = new Scanner(new File("input3.txt"));
        int row = 0;
        int trees = 0;
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          if (i == slopes.length-1 && row%2 != 0) {
            row++;
            continue;
          }
          if (data.charAt((int)(row*slopes[i])%data.length()) == '#') {
            trees++;
          }
          row++;
        }
        System.out.println(trees);
        multAllTrees *= trees;
        myReader.close();
      }
      System.out.println(multAllTrees);
      //System.out.println(85*176*96*87*400); -1561239552
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
    }
  }


}
