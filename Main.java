//dumb java stuff you have to set up first
import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    
    Scanner Doggo = new Scanner(System.in); // create this thing to get user input
    
    System.out.println("Java Text Based Game!"); //prints to screen

    //game variables
    int room = 1;
    String input = "glurbaburbal!"; //dummy value for game loop
    String[] inventory = {" ", " ", " ", " "}; //use this to hold player items

    while (input != "quit") { //OMG GAME LOOP-----------------------------------------

      //print inventory
      System.out.println("Your inventory:");
      for(int i = 0; i<=3; i++)
        System.out.println(inventory[i]);
      
      switch (room) {
        case 1:
          System.out.println("You're in room 1, you can go East");
          input = Doggo.nextLine();
          if(input.equals("East"))
            room = 2;
          break;
        case 2:
          System.out.println("You're in room 2, you can go West or South");
          input = Doggo.nextLine();
          if(input.equals("South"))
            room = 3;
          else if (input.equals("West"))
            room = 1;
          break;
        case 3:
          System.out.println("You're in room 3, you can go North.");
          //check if they already have the gun, if not tell them they got it
          if (!inventory[0].equals("marshmallow gun")){ 
            System.out.println("OMG you got the marshmallow gun!");
            inventory[0] = "marshmallow gun";
          }
          
          input = Doggo.nextLine();
          if(input.equals("North"))
            room = 2;
          break;

      }// end bracket for switch
    } // end bracket for OMG GAME LOOP----------------------------------------------------
  }// end bracket for public static void main
}// end bracket for class main
