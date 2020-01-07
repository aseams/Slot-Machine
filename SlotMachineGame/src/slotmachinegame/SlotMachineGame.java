package slotmachinegame;
import java.util.Scanner;
import java.util.Random;
public class SlotMachineGame {
    public static void main(String[] args) throws InterruptedException {
    
        /*  
            When you win tokens add them to remaining credits.
            Try using 10 starting credits and betting 9, 8, 7,
            or 6 of them. Fix numbers in general.
        */
        
    int bet = 0, n1 = 1, n2 = 1, n3 = 1, trip, dub, startCredits;
    int repeat = 1, credits, tokens = 0, totalCredits = 0, insufficient;
    
    Random rand = new Random();
    Scanner keyboard = new Scanner (System.in);
    
    System.out.print("How much money do you want to start with?");
    startCredits = keyboard.nextInt();
    credits = startCredits;
    System.out.println("\nStarting with $" + startCredits + " dollars."
            + "\n---------------------------------------------");
    
    totalCredits = startCredits;
    
    game: while (startCredits > 0 && credits > 0 && repeat == 1){  /* Allows user to keep playing */ 
        tokens = 0;
          
//        totalCredits = credits;
        System.out.println("\nYou have $" + totalCredits + " dollars remaining."
                + "\nHow much do you want to bet? ");
        bet = keyboard.nextInt();

       
        insufficient = totalCredits;
//        System.out.println(insufficient + " on line 38");
        
        if (bet > totalCredits){ /* Lets user re-input bet since insufficient credits */
            totalCredits = insufficient;
            //System.out.println(credits + " if credits < 0");
            System.out.println("Insufficient funds. Try again.");
            continue;
        }
        
        else{ //Continues game loop
        totalCredits = totalCredits - bet;
//        System.out.println(totalCredits + " on line 48");
            credits = totalCredits;
        System.out.println("$" + totalCredits + " dollars remaining.");
        
        startCredits = credits;
        
        dub = (bet * 2);
        trip = (bet * 3);

        n1 = rand.nextInt(6) + 1;
        n2 = rand.nextInt(6) + 1;
        n3 = rand.nextInt(6) + 1;

        System.out.println("\nRolling....");
        Thread.sleep(2000);
        System.out.println("");
        
            switch (n1) {
                case 1:
                    System.out.println("Cherries");
                    break;
                case 2:
                    System.out.println("Oranges");
                    break;
                case 3:
                    System.out.println("Plums");
                    break;
                case 4:
                    System.out.println("Bells");
                    break;
                case 5:
                    System.out.println("Melons");
                    break;
                case 6:
                    System.out.println("Bar");
                    break;
                default:
                    break;
            }
            Thread.sleep(1000);
            switch (n2) {
                case 1:
                    System.out.println("Cherries");
                    break;
                case 2:
                    System.out.println("Oranges");
                    break;
                case 3:
                    System.out.println("Plums");
                    break;
                case 4:
                    System.out.println("Bells");
                    break;
                case 5:
                    System.out.println("Melons");
                    break;
                case 6:
                    System.out.println("Bar");
                    break;
                default:
                    break;
            }
            Thread.sleep(1000);
            switch (n3) {
                case 1:
                    System.out.println("Cherries");
                    break;
                case 2:
                    System.out.println("Oranges");
                    break;
                case 3:
                    System.out.println("Plums");
                    break;
                case 4:
                    System.out.println("Bells");
                    break;
                case 5:
                    System.out.println("Melons");
                    break;
                case 6:
                    System.out.println("Bar");
                    break;
                default:
                    break;
            }

            Thread.sleep(1000);

        if (n1 == n2 && n1 == n3)/* All 3 equal */{
            tokens = trip;
            System.out.println("You win! Adding $" + tokens + 
                    " dollars to your winnings.");
        }
        else if (n2 == n3 || n1 == n3 || n1 == n2)/* 2 are equal */{
            tokens = dub;
            System.out.println("You win! Adding $" + tokens + 
                    " dollars to your winnings.");
                        }
        
        totalCredits = startCredits + tokens;
        startCredits = totalCredits;
        credits = startCredits;
//        System.out.println(totalCredits + " on line 148");
        
        System.out.println("\nYou have $" + totalCredits + " dollars.");
        
        System.out.println("\nWould you like to play again?"
                + " \nType 1 for 'yes' or 2 for 'no'.");
        repeat = keyboard.nextInt();

        }
        if (repeat == 1 && totalCredits == 0)/* Checks if sufficient credits*/{
            System.out.println("You are out of money. "
                    + "Go to teller for payout.");
            System.exit(0);
        }
        else if (repeat == 1 && totalCredits >= 1){
        }
        else{ // Do nothing
        }
        
            } //end of loop
        System.out.println("$" + totalCredits + " dollars added. Go to teller for payout.");
        }
    
    }