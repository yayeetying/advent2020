import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

//https://www.w3schools.com/java/java_files_read.asp
public class code1 {
  public static void main(String[] args) {
    ArrayList<Integer> all = new ArrayList<>();
    ReadFile(all); //add all the numbers into the ArrayList all
    boolean printed = false; //so i don't print results a bajillion times! :D
    for (int i = 0; i < all.size(); i++) {
      if (!printed && all.indexOf(2020-all.get(i)) != -1) {
        printed = true;
        int firstNumb = all.get(i);
        int secondNumb = all.get(all.indexOf(2020-firstNumb));
        System.out.println("First number" + firstNumb);
        System.out.println("Second number" + secondNumb);
        System.out.println(firstNumb*secondNumb);
      }
    }
    printed = false;
    System.out.println("~~~~~~~~~~~~~~~~");
    for (int i = 0; i < all.size(); i++) {
      for (int j = 1; j < all.size(); j++) {
        if (!printed && all.get(i) + all.get(j) < 2020 && all.indexOf(2020-(all.get(i)+all.get(j))) != -1) {
          printed = true;
          int firstNumber = all.get(i);
          int secondNumber = all.get(j);
          int thirdNumber = all.get(all.indexOf(2020-(firstNumber+secondNumber)));
          System.out.println("First number" + firstNumber);
          System.out.println("Second number" + secondNumber);
          System.out.println("Third number" + thirdNumber);
          System.out.println(firstNumber*secondNumber*thirdNumber);
        }
      }
    }
  }

  public static void ReadFile(ArrayList<Integer> list) {
    try {
      File myObj = new File("input1.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        list.add(Integer.parseInt(data));
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
    }
  }


}
