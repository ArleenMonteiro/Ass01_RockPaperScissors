import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String playAgain = "Y";
        boolean playing = true;
        boolean playAgainTest = true;
        boolean AMove = true;
        boolean BMove = true;

        do
        {
            do
            {
                System.out.print("PlayerA,enter your move: ");
                playerA = in.nextLine();

                if (playerA.equalsIgnoreCase("R"))
                {
                    do
                    {
                        AMove = false;
                        System.out.print("PlayerB,enter your move: ");
                        playerB = in.nextLine();

                        if (playerB.equalsIgnoreCase("R"))
                        {
                            BMove = false;
                            System.out.println("Rock vs Rock. it is a TIE!");
                        }
                        else if (playerB.equalsIgnoreCase("P"))
                        {
                            BMove = false;
                            System.out.println("Paper covers Rock. player B wins!");
                        }
                        else if (playerB.equalsIgnoreCase("S")) {
                            BMove = false;
                            System.out.println("Rock breaks scissors! player A wins!");
                        }
                        else
                        {
                            System.out.println(playerB + " is not a valid answer");
                        }
                    }
                    while (BMove == true);
                }
                else if (playerA.equalsIgnoreCase("P"))
                {
                    do
                    {

                        AMove = false;
                        System.out.print("PlayerB, enter your move: ");
                        playerB = in.nextLine();

                        if (playerB.equalsIgnoreCase("R"))
                        {
                            BMove = false;
                            System.out.println("Paper covers Rock! player A wins!");
                        }
                        else if (playerB.equalsIgnoreCase("P"))
                        {
                            BMove = false;
                            System.out.println("Paper vs Paper! it is a TIE!");
                        }
                        else if (playerB.equalsIgnoreCase("S"))
                        {
                            BMove = false;
                            System.out.println("Scissors cuts paper! player B wins!");
                        }
                        else
                        {
                            System.out.println(playerB + " is not a valid answer");
                        }
                    } while (BMove == true);
                }
                else if (playerA.equalsIgnoreCase("S"))
                {
                    do
                    {
                        AMove = false;
                        System.out.print("PlayerB, enter your move: ");
                        playerB = in.nextLine();

                        if (playerB.equalsIgnoreCase("R"))
                        {
                            BMove = false;
                            System.out.println("Rock breaks Scissors! player B wins!");
                        }
                        else if (playerB.equalsIgnoreCase("P"))
                        {
                            BMove = false;
                            System.out.println("Scissors cut Paper! player A wins!");
                        }
                        else if (playerB.equalsIgnoreCase("S"))
                        {
                            BMove = false;
                            System.out.println("Scissors vs Scissors! it is a TIE!");
                        }
                        else
                        {
                            System.out.println(playerB + " is not a valid answer");
                        }
                    } while (BMove == true);
                }
                else
                {
                    System.out.println(playerA + " is not a valid answer");
                }

            } while (AMove == true);

            do
            {
                System.out.print("Would you like to play again? [Y/N] ");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y"))
                {

                    playing = true;
                    playAgainTest = false;
                    AMove = true;
                    BMove = true;
                }
                else if (playAgain.equalsIgnoreCase("N"))
                {
                    System.out.println("Thanks for playing");
                    playing = false;
                    playAgainTest = false;
                    System.exit(0);
                }
                else
                {
                    System.out.println(playAgain + " is not a valid answer");
                }
            } while (playAgainTest == true);
            playAgainTest = true;
        } while (playing == true);
    }
}
