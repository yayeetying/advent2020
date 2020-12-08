import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

//data.isEmpty(); method checks if string is empty (lnegth() is 0) or not
public class code4 {

  public static void main(String[] args) {
    try {
      Scanner s = new Scanner(new File("input4.txt"));
      boolean byr, iyr, eyr, hgt, hcl, ecl, pid;
      byr = iyr = eyr = hgt = hcl = ecl = pid = false;
      int count = 0;
      while (s.hasNext()) {
        String data = s.nextLine();
        if (data.isEmpty()) {
          if (byr&&iyr&&eyr&&hgt&&hcl&&ecl&&pid) count++;
          byr = iyr = eyr = hgt = hcl = ecl = pid = false;
          continue;
        }
        if (data.contains("byr")) byr = true;
        if (data.contains("iyr")) iyr = true;
        if (data.contains("eyr")) eyr = true;
        if (data.contains("hgt")) hgt = true;
        if (data.contains("hcl")) hcl = true;
        if (data.contains("ecl")) ecl = true;
        if (data.contains("pid")) pid = true;
      }
      System.out.println(count);
      s.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("file not found");
    }
  }
}
