import java.util.*;
public class Namestwo {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.println("Welcome to Name Matcher.");
      System.out.println("You need to match people's first names to their last.");
      System.out.println("The last names you may choose from are:");
      System.out.println("Brown(0), James(1), Kelly(2), Garcia(3), and Evans(4).");
      System.out.println();
      int Brown = 0;
      int James = 1;
      int Kelly = 2;
      int Garcia = 3;
      int Evans = 4;
      
      int mar = Marianum();
              
      int jac = Jacobnum(mar);
      for(int j = 10; j <= jac; j++) {
         jac = Jacobnum(mar);
      }
      int emm = Emmanum(mar, jac);
       for(int e = 10; e <= emm; e++) {
         emm = Emmanum(mar, jac);
      }
      
      int ant = Anthonynum(mar, jac, emm);
      for(int a = 10; a <= ant; a++) {
         ant = Anthonynum(mar, jac, emm);
      }

      int lia = Liamnum(mar, jac, emm, ant);
      for(int l = 10; l <= lia; l++) {
         lia = Liamnum(mar, jac, emm, ant);
      }
      Hints(mar, jac, emm, ant, lia);
      Guess(mar, jac, emm, ant, lia);
   }
   public static int Marianum() {
      String[] arr={"1", "2", "3", "4", "5"};
      Random m = new Random();
      int x = m.nextInt(arr.length);
      return x;
   }
   public static int Jacobnum(int mar) {
      String[] arr={"6", "7", "8", "9", "10"};
      Random j = new Random();
      int x = j.nextInt(arr.length);
      if (x == mar) {
         x = 99999;
      }
      return x;
   }
   public static int Emmanum(int mar, int jac) {
      String[] arr={"11", "12", "13", "14", "15"};
      Random j = new Random();
      int x = j.nextInt(arr.length);
      if (x == mar) {
         x = 99999;
      }
      else if (x == jac) {
         x = 99999;
      }
      return x;
   }
   public static int Anthonynum(int mar, int jac, int emm) {
      String[] arr={"16", "17", "18", "19", "20"};
      Random j = new Random();
      int x = j.nextInt(arr.length);
      if (x == mar) {
         x = 99999;
      }
      else if (x == jac) {
         x = 99999;
      }
      else if (x == emm) {
         x = 99999;
      }
      return x;
   }
   public static int Liamnum(int mar, int jac, int emm, int ant) {
      String[] arr={"21", "22", "23", "24", "25"};
      Random j = new Random();
      int x = j.nextInt(arr.length);
      if (x == mar) {
         x = 99999;
      }
      else if (x == jac) {
         x = 99999;
      }
      else if (x == emm) {
         x = 99999;
      }
      else if (x == ant) {
         x = 99999;
      }
      return x;
   }
   public static void Hints(int mar, int jac, int emm, int ant, int lia) {
      
      String[] mariaHints = {"Maria's last name does not include the letter e.", "Maria's last name is five letters, and is not Brown.", "Maria's last name is not James or Evans.", "Maria's last name has an a.", "Maria's last name is Evans."};
      System.out.println(mariaHints[mar]);
      
      String[] jacobHints = {"Jacob's first and last name have two similar letters and is not James.", "Jacob's last name is not Evans or Brown.", "Jacobs last name has four different letters in it.", "Jacob's first and last name share two letters and isn't James.", "Jacob's last name is Evans."};
      System.out.println(jacobHints[jac]);
      
      String[] emmaHints = {"Emma's first and last name have no similar letters.", "Emma's last name is not Garcia or Brown.", "Emma's first and last name share one letter.", "Emma's last name is Garcia.", "Emma's last name is Evans."};
      System.out.println(emmaHints[emm]);
      
      String[] anthonyHints = {"Anthony's first and last name have two similar letters.", "Anthony's last name is also a first name.", "Anthony's last name is not James or Garcia.", "Anthony's last name is six letters.", "Anthony's last name is Evans."};
      System.out.println(anthonyHints[ant]);
      
      String[] liamHints = {"Liam's last name is one letter longer than his first and isn't Kelly.", "Liam's last name is not Kelly.", "Liam's last name has illiteration.", "Liam's last name is not Kelly or James.", "Liam's last name is Evans."};
      System.out.println(liamHints[lia]);
   } 
   public static void Guess(int mar, int jac, int emm, int ant, int lia) {
      int correct = 0;
      Scanner console = new Scanner(System.in);
      System.out.println();
      System.out.println("What is the number that corresponds to Maria's last name?");
      int m = console.nextInt();
      if (m == mar) { 
         System.out.println("Correct!");
         correct++;
      }
      else {
         System.out.println("Incorrect.");
      }
      System.out.println("What is the number that corresponds to Jacob's last name?");
      int j = console.nextInt();
      if (j == jac) { 
         System.out.println("Correct!");
         correct++;
      }
      else {
         System.out.println("Incorrect.");
      }
      System.out.println("What is the number that corresponds to Emma's last name?");
      int e = console.nextInt();
      if (e == emm) { 
         System.out.println("Correct!");
         correct++;
      }
      else {
         System.out.println("Incorrect.");
      }
      System.out.println("What is the number that corresponds to Anthony's last name?");
      int a = console.nextInt();
      if (a == ant) { 
         System.out.println("Correct!");
         correct++;
      }
      else {
         System.out.println("Incorrect.");
      }
      System.out.println("What is the number that corresponds to Liam's last name?");
      int l = console.nextInt();
      if (l == lia) { 
         System.out.println("Correct!");
         correct++;
      }
      else {
         System.out.println("Incorrect.");
      }
      System.out.println("You got " + correct + "/5 names correct.");
   }
}