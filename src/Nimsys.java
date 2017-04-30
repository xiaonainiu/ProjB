import java.util.Scanner;

/**
 * Created by Shen YI(844373) on 2017/3/26.
 */
public class Nimsys {
    static Scanner keyboard;
    static NimPlayer[] playerlist;

    public static void main(String[] args) {
        playerlist = new NimPlayer[100];

        while(true){
            identifyCommand(scanCommand());

        }
    }

    public static void identifyCommand(String command) {

        String[] commandsplit = command.split("\\s+");

        if (commandsplit[0].equals("addplayer")) {
            addplayer(commandsplit[1]);
        }
//        else if(commandsplit[0].equals("removeplayer")){
//            NimPlayer.removeplayer(commandsplit[1]);
//        }
//        else if(commandsplit[0].equals("editplayer")){
//            NimPlayer.editplayer(commandsplit[1]);
//        }
//        else if(commandsplit[0].equals("resetstats")){
//            NimPlayer.resetstats(commandsplit[1]);
//        }
//        else if(commandsplit[0].equals("displayplayer")){
//            NimPlayer.displayplayer(commandsplit[1]);
//        }
//        else if(commandsplit[0].equals("rankings")){
//            NimPlayer.rankings(commandsplit[1]);
//        }
        else if (commandsplit[0].equals("startgame")) {
            NimGame.startgame();
        } else if (commandsplit[0].equals("exit")) {
            System.exit(0);
        } else {
            System.out.print("command not exist");
        }
    }

    public static int checkExist(String username) {

        for (int i = 0; i < 100; i++) {
            NimPlayer player = playerlist[i];
            if (player == null) return i;
            String existuser = player.getUsername();
            if (existuser.equals(username)) return i;
        }
        return 100;
    }


    public static void addplayer(String arguments) {
        String[] argu = arguments.split(",");

        String username = argu[0];
        int index = checkExist(username);

        if (index == 100) {
            System.out.println("full");

        } else if (playerlist[index] == null) {
            playerlist[index] = new NimPlayer(argu[0], argu[1], argu[2]);
        } else {
            System.out.println("exist");
        }

    }

    public static String scanCommand() {

        keyboard = new Scanner(System.in);
        System.out.print("$");
        String command = keyboard.nextLine();
        return command;
    }


    //the playing process
//    public static boolean playingNim(NimPlayer player, NimGame nimstone) {
//        System.out.println(player.getname() + "'s turn - remove how many?");
//        int removenum = keyboard.nextInt();
//        if (removenum > nimstone.getUpperbound() || removenum < 1 || removenum > nimstone.reststone()) {
//            System.out.println("WRONG INPUT");
//            return false;
//        } else {
//            player.removeStone(nimstone, removenum);
//            return true;
//        }
//    }


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
