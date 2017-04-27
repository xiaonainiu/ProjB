import java.util.Scanner;

/**
 * Created by Shen YI(844373) on 2017/3/26.
 */
public class Nimsys {
    static Scanner keyboard;

    //the playing process
    public static boolean playingNim(NimPlayer player, NimGame nimstone) {
        System.out.println(player.getname() + "'s turn - remove how many?");
        int removenum = keyboard.nextInt();
        if (removenum > nimstone.getUpperbound() || removenum < 1 || removenum > nimstone.reststone()) {
            System.out.println("WRONG INPUT");
            return false;
        } else {
            player.removeStone(nimstone, removenum);
            return true;
        }
    }

    public static void main(String[] args){

        scanCommand();
//        String str = "x1;x2;x3";
//        String[] strs = str.split(";");

    }

    public static void scanCommand(){

        keyboard = new Scanner(System.in);

        System.out.print("$");

        String command = keyboard.nextLine();

        String[] commandsplit = command.split("\\s+");
        String commandname = commandsplit[0];
        if (commandname.equals("addplayer")){
            NimPlayer.addplayer(commandsplit[1]);
        }
        else if(command.equals("removeplayer")){
            NimPlayer.removeplayer(commandsplit[1]);
        }
        else if(command.equals("editplayer")){
            NimPlayer.editplayer(commandsplit[1]);
        }
        else if(command.equals("resetstats")){
            NimPlayer.resetstats(commandsplit[1]);
        }
        else if(command.equals("displayplayer")){
            NimPlayer.displayplayer(commandsplit[1]);
        }
        else if(command.equals("rankings")){
            NimPlayer.rankings(commandsplit[1]);
        }
        else if(command.equals("startgame")){
            NimGame.startgame();
        }
        else if(command.equals("exit")){
            System.exit(0);
        }
        else{
            System.out.print("command not exist");
        }
//        String[] commandargument = commandsplit[1].split(",");
//
//        System.out.println(commandsplit[0]);
//        System.out.println(commandargument[0]);
//        System.out.println(commandargument[1]);
//        System.out.println(commandargument[2]);
    }
//    public static void main(String[] args) {
//
//        keyboard = new Scanner(System.in);
//
//        System.out.println("Welcome to Nim");
//
//        System.out.println();
//        System.out.println("Please enter Player 1's name:");
//        NimPlayer player1 = new NimPlayer(keyboard.next());
//
//        System.out.println();
//        System.out.println("Please enter Player 2's name:");
//        NimPlayer player2 = new NimPlayer(keyboard.next());
//
//        //initialize Restart, which is used to play this game again
//        String restart = "Y";
//        while (restart.equals("Y")) {
//            System.out.println();
//            System.out.println("Please enter upper bound of stone removal:");
//            int upperbound = keyboard.nextInt();
//
//            System.out.println();
//            System.out.println("Please enter initial number of stones:");
//            int stonenum = keyboard.nextInt();
//
//            NimGame nimstone = new NimGame(upperbound, stonenum);
//            nimstone.printNimstoneinfo();
//
//            //to define the active player, which is going to play next, or win.
//            int turn = 0;
//            NimPlayer activeplayer = null;
//
//            while (!nimstone.empty()) {
//                if (turn % 2 == 0) {
//                    while (!playingNim(player1, nimstone)) ;
//                    activeplayer = player2;
//                } else {
//                    while (!playingNim(player2, nimstone)) ;
//                    activeplayer = player1;
//                }
//                turn++;
//            }
//
//            System.out.println();
//            System.out.println("Game Over");
//            System.out.println(activeplayer.getname() + " wins!");
//
//            System.out.println();
//            System.out.print("Do you want to play again (Y/N):");
//            restart = keyboard.next();
//        }
//    }
}
