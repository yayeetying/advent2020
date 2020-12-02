import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class code2 {
  public static void main(String[] args) {
    ArrayList<String> ayo = new ArrayList<>();
    ReadFile(ayo);
    int valid = 0; int min = 0; int max = 0; int count = 0; Character chara = ' ';
    int valid2 = 0;
    for (int i = 0; i < ayo.size(); i++) {
      String[] pieces = ayo.get(i).split(" ");

      String[] nums = pieces[0].split("-");
      min = Integer.parseInt(nums[0]);
      max = Integer.parseInt(nums[1]);

      String[] characters = pieces[1].split(":");
      chara = characters[0].charAt(0);

      count = 0;
      for (int x = 0; x < pieces[2].length(); x++) {
        if (pieces[2].charAt(x) == chara) count++;
      }

      if (count >= min && count <= max) valid++;

      //~~~~~~~~~~~~~~~~~~~
      //if (pieces[2].charAt(min-1) == chara && pieces[2].charAt(max-1) != chara) valid2++;
      if (pieces[2].charAt(max-1) != pieces[2].charAt(min-1) && (pieces[2].charAt(max-1) == chara ||
                                                            pieces[2].charAt(min-1) == chara)) valid2++;
    }
    System.out.println(valid);
    System.out.println(valid2);
  }

  public static void ReadFile(ArrayList<String> list) {
    try {
      File myObj = new File("input2.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        list.add(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
    }
  }
}
