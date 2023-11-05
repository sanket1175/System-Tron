/*
Task 2:

Task : Make a  Rock Paper Scissor  game   With the help of JAVA 
  */
import java.io.*;
import java.util.*;

public class Task2 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int userChoice, computerChoice, rock, paper;
    Random rnd = new Random();

    rock = 0;
    paper = 1;
   int scissor = 2;

    System.out.println("ROCK - PAPER - SCISSORR GAME\n");
    System.out.println("Enter your choice (0=rock, 1=paper, 2=scissor)\n");
    userChoice = Integer.parseInt(br.readLine());

    while (userChoice > 2) {
      System.out.println("give number between 0 and 2");
      userChoice = Integer.parseInt(br.readLine());
    }

    if (userChoice == rock) {
      System.out.println("User chose ROCK");
    } else {
      if (userChoice == paper) {
        System.out.println("User chose PAPER");
      } else {
        System.out.println("User chose SCISSOR");
      }
    }

    computerChoice = rnd.nextInt(3);

    if (computerChoice == rock) {
      System.out.println("Computer chose ROCK");
    } else {
      if (computerChoice == paper) {
        System.out.println("Computer chose PAPER");
      } else {
        System.out.println("Computer chose SCISSORS");
      }
    }

    while (userChoice == computerChoice) {
      System.out.println("draw try again");
      userChoice = Integer.parseInt(br.readLine());

      while (userChoice > 2) {
        System.out.println("give number between 0 and 2");
        userChoice = Integer.parseInt(br.readLine());
      }
      computerChoice = rnd.nextInt(3);

      if (userChoice == rock) {
        System.out.println("User chose ROCK");
      } else {
        if (userChoice == paper) {
          System.out.println("User chose PAPER");
        } else {
          System.out.println("User chose SCISSORS");
        }
      }
      if (computerChoice == rock) {
        System.out.println("Computer chose ROCK");
      } else {
        if (computerChoice == paper) {
          System.out.println("Computer chose PAPER");
        } else {
          System.out.println("Computer chose SCISSORS");
        }
      }
    }

    if (computerChoice == rock) {
      if (userChoice == paper) {
        System.out.println("User wins!");
      } else {
        System.out.println("Computer Wins");
      }
    } else if (computerChoice == paper) {
      if (userChoice == rock) {
        System.out.println("Computer wins");
      } else {
        System.out.println("User Wins!");
      }
    } else if (userChoice == rock) {
      System.out.println("User Wins");
    } else {
      System.out.println("Computer Wins");
    }
  }
}
