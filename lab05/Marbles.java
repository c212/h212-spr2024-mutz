import java.util.Scanner;

public class Marbles {
  public static int marbles;
  public static int player;
  
  public static void main(String[] args) {  
    //Choose how many marbles
    selectMarbles();
    // //Select difficuly
    
    // //Set who goes first and choose who goes
    player = 1;

    while(marbles > 0){
    //   //Promt for take
      handleTurn();
      
      System.out.println("There are " + marbles + " left.");
    }

    // //End the game
    // figureOutWinner();
  }  

  private static void figureOutWinner(){
    int looser = 1;
    if(player == 1) looser = 2;

    System.out.println("Player " + looser + " looses!");
  }
  
  private static void selectMarbles() {
    System.out.println("How many marbles do you want to play with?");
    Scanner in = new Scanner(System.in);
    marbles = Integer.parseInt(in.nextLine());
    in.close();
  }

  private static void handleTurn(){
    int take = 0;

    if (player == 1){ //Person
      Scanner in = new Scanner(System.in);
      System.out.println("Player 1, how many marbles do you want to take?");

      do {
        take = 1;
        System.out.println(in);
      } while (!legalMove(take));

      in.close();
    } else { //Jeffery
      take = 1;
    }

    marbles -= take;

    player++;
    if (player > 2)
      player = 1;
  }

  private static boolean legalMove(int take){
    if (take > marbles/2 && marbles > 1){
      System.out.println("You can't take more than half of the marbles");
      return false;
    }
    if (take < 1){
      System.out.println("You can't take less than one marble");
      return false;
    }
    return true;
  }
}

/*
78
78 - 6 = 72
72 - 23 = 49
49 - 20 = 29
29 - 10 = 19
19 - 8 = 11
11 - 5 = 6
6 - 2 = 4
4 - 1 = 3
3 - 1 = 2
2 - 1 = 1
YOU LOOSE
*
