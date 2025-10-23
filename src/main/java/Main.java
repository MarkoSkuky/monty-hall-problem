import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Boolean gameRunning = true;
    Scanner scanner = new Scanner(System.in);
    while (gameRunning) {
      GameManager game = new GameManager();
      System.out.println(game.getDoors());
      System.out.print("Enter the number of the door (1–3) you believe has the car:");
      int input;
      while (true) {
        input = scanner.nextInt();

        if (input >= 1 && input <= 3) {
          break; // správny vstup, pokračujeme
        } else {
          System.out.println("Wrong input! Please enter 1, 2, or 3.");
        }
      }
      System.out.println("You chose door number " + input + ".");
      System.out.println("I will now open a door with a goat.");
      for (Door door : game.getDoors()) {
        if (door.equals(game.getDoors().get(input - 1))) {
          continue;
        }
        if (!door.isHasCar()) {
          door.setOpen(true);
          break;
        }
      }
      System.out.println(game.getDoors() + "Do you want to switch? yes/no");
      String yesOrNo;
      while (true) {
        yesOrNo = scanner.next();

        if (yesOrNo.equals("yes") || yesOrNo.equals("no")) {
          break; // správny vstup, pokračujeme
        } else {
          System.out.println("Wrong input! yes or no.");
        }
      }

      if (yesOrNo.equals("no")) {
        game.openAll();
        System.out.println(game.getDoors());
        if (game.getDoors().get(input - 1).isHasCar()) {
          System.out.println("YOU WON A CAR!!!");
        } else {
          System.out.println("YOU WON A GOAT :(");
        }
      } else {
        game.openAll();
        System.out.println(game.getDoors());
        if (!game.getDoors().get(input - 1).isHasCar()) {
          System.out.println("YOU WON A CAR!!!");
        } else {
          System.out.println("YOU WON A GOAT :(");
        }
      }
      System.out.println();
      System.out.println("Do you wanna play again? yes/no");
      String again;
      while (true) {
        again = scanner.next();
        if (again.equals("yes")) {
          break;
        } else if (again.equals("no")) {
          gameRunning = false;
          break;
        } else {
          System.out.println("wrong input, please choose yes or no");
        }
      }
      for (int i = 0; i < 20; i++) {
        System.out.println();
      }
    }
  }
}
