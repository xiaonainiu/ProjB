import java.util.Scanner;

/**
 * Created by Shen YI(844373) on 2017/3/26.
 */
public class Nimsys {
    static Scanner keyboard;
    static NimPlayer[] playerlist;

    public static void main(String[] args) {

        playerlist = new NimPlayer[100];

        playerlist[0] = new NimPlayer("aaa", "afirstname", "alastname");
        playerlist[1] = new NimPlayer("bbb", "bfirstname", "blastname");
        playerlist[2] = new NimPlayer("ccc", "cfirstname", "clastname");
        playerlist[3] = new NimPlayer("ddd", "dfirstname", "dlastname");
        playerlist[4] = new NimPlayer("eee", "efirstname", "elastname");
        playerlist[5] = new NimPlayer("es", "shen", "yi");
        playerlist[6] = new NimPlayer("fff", "ffirstname", "flastname");
        playerlist[7] = new NimPlayer("ggg", "gfirstname", "glastname");
        playerlist[8] = new NimPlayer("hhh", "hfirstname", "hlastname");
        playerlist[9] = new NimPlayer("iii", "ifirstname", "ilastname");
        playerlist[10] = new NimPlayer("jjj", "jfirstname", "jlastname");
        playerlist[11] = new NimPlayer("ssy", "siyi", "shao");
        playerlist[12] = new NimPlayer("zzz", "zfirstname", "zlastname");

        NimPlayer aaa = playerlist[0];
        NimPlayer bbb = playerlist[1];
        NimPlayer ccc = playerlist[2];
        NimPlayer ddd = playerlist[3];
        NimPlayer eee = playerlist[4];
        NimPlayer es = playerlist[5];
        NimPlayer fff = playerlist[6];
        NimPlayer ggg = playerlist[7];
        NimPlayer hhh = playerlist[8];
        NimPlayer iii = playerlist[9];
        NimPlayer jjj = playerlist[10];
        NimPlayer ssy = playerlist[11];
        NimPlayer zzz = playerlist[12];

        aaa.Win();aaa.Win();aaa.Win();aaa.Win();aaa.Win();aaa.Win();aaa.Win();aaa.Win();aaa.Win();aaa.Win();aaa.Win();aaa.Win();
        bbb.Win();bbb.Win();bbb.Win();bbb.Win();bbb.Win();bbb.Win();bbb.Win();bbb.Win();bbb.Win();bbb.Win();bbb.Lose();
        ccc.Win();ccc.Win();ccc.Win();ccc.Win();ccc.Win();ccc.Win();ccc.Win();ccc.Win();ccc.Lose();ccc.Lose();ccc.Lose();
        ddd.Win();ddd.Win();ddd.Win();ddd.Win();ddd.Win();ddd.Lose();ddd.Lose();
        eee.Win();eee.Win();eee.Win();eee.Win();eee.Win();eee.Win();eee.Win();eee.Lose();eee.Lose();eee.Lose();eee.Lose();
        es.Win();es.Win();es.Win();es.Win();es.Win();es.Win();es.Lose();es.Lose();es.Lose();es.Lose();
        fff.Win();fff.Win();fff.Win();fff.Lose();fff.Lose();fff.Lose();
        ggg.Win();ggg.Win();ggg.Win();ggg.Lose();ggg.Lose();ggg.Lose();ggg.Lose();
        hhh.Win();hhh.Lose();hhh.Lose();
        iii.Win();iii.Win();iii.Lose();iii.Lose();iii.Lose();iii.Lose();iii.Lose();iii.Lose();
        jjj.Win();jjj.Win();jjj.Lose();jjj.Lose();jjj.Lose();jjj.Lose();jjj.Lose();jjj.Lose();
        ssy.Win();ssy.Lose();ssy.Lose();ssy.Lose();ssy.Lose();ssy.Lose();ssy.Lose();ssy.Lose();ssy.Lose();ssy.Lose();ssy.Lose();
        zzz.Lose();zzz.Lose();zzz.Lose();zzz.Lose();zzz.Lose();zzz.Lose();zzz.Lose();zzz.Lose();zzz.Lose();zzz.Lose();zzz.Lose();


        System.out.println(Math.round(aaa.getwinningRatio()));
        System.out.printf("%-5.0f",aaa.getwinningRatio());
        System.out.println();
        System.out.println(Math.round(bbb.getwinningRatio()));
        System.out.println(Math.round(ccc.getwinningRatio()));
        System.out.println(Math.round(ddd.getwinningRatio()));
        System.out.println(Math.round(eee.getwinningRatio()));
        System.out.println(Math.round(es.getwinningRatio()));
        System.out.println(Math.round(fff.getwinningRatio()));
        System.out.println(Math.round(ggg.getwinningRatio()));
        System.out.println(Math.round(hhh.getwinningRatio()));
        System.out.println(Math.round(iii.getwinningRatio()));
        System.out.println(Math.round(jjj.getwinningRatio()));
        System.out.println(Math.round(ssy.getwinningRatio()));
        System.out.println(Math.round(zzz.getwinningRatio()));

        while(true){
            identifyCommand(scanCommand());
        }
    }

    public static void identifyCommand(String command) {

        String[] commandsplit = command.split("\\s+");

        if (commandsplit[0].equals("add")) {
            addplayer(commandsplit[1]);
        }
        else if(commandsplit[0].equals("remove")){
            if (commandsplit[0].length() == command.length()){
                removeplayer(null);
            }
            else {removeplayer(commandsplit[1]);}

        }
        else if(commandsplit[0].equals("edit")){
            editplayer(commandsplit[1]);
        }
        else if(commandsplit[0].equals("reset")){
            if (commandsplit[0].length() == command.length()){
                resetstats(null);
            }
            else {resetstats(commandsplit[1]);}
        }
        else if(commandsplit[0].equals("display")){
            if (commandsplit[0].length() == command.length()){
                displayplayer(null);
            }
            else {displayplayer(commandsplit[1]);}
        }
        else if(commandsplit[0].equals("rankings")){
            if (commandsplit[0].length() == command.length()){
                rankings(null);
            }
            else {rankings(commandsplit[1]);}
        }
        else if (commandsplit[0].equals("startgame")) {
            NimGame.startgame();
        } else if (commandsplit[0].equals("exit")) {
            System.exit(0);
        } else {
            System.out.println("command not exist");
        }
    }

    public static int checkExist(String username) {

        for (int i = 0; i < 100; i++) {
            NimPlayer player = playerlist[i];
            if (player != null){
                if (username.compareTo(playerlist[i].username) < 0){
                    return i;
                }
            }
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
        } else if (playerlist[index].username.equals(username)){
            System.out.println("The player already exists.");
        }else {
            for (int i = 99; i > index; i--){
                if (playerlist[i-1] != null){
                    playerlist[i] = playerlist[i-1];
                }
            }
            playerlist[index] = new NimPlayer(argu[0], argu[1], argu[2]);
        }
    }



    public static void removeplayer(String arguments){
        String username = arguments;
        if (username == null){
            System.out.println("Are you sure you want to remove all players? (y/n)");
            if (keyboard.nextLine().equals("y")){
                playerlist = new NimPlayer[100];
            }
            return;
        }
        int index = checkExist(username);
        if (playerlist[index] == null){
            System.out.println("The player does not exist.");
            return;
        }
        if (index == 100 || !(playerlist[index].username.equals(username))){
            System.out.println("The player does not exist.");
        }
        else{
            for (int i = index; i<99; i++){
                if (playerlist[i+1] != null){
                    playerlist[i] = playerlist[i+1];
                }
                else {
                    playerlist[i] = null;
                    return;
                }
                playerlist[99] = null;
            }
        }
    }

    public static void editplayer(String arguments){
        String[] argu = arguments.split(",");
        String username = argu[0];
        String firstname = argu[1];
        String lastname = argu[2];
        int index = checkExist(username);
        if (playerlist[index] == null){
            System.out.println("The player does not exist.");
            return;
        }
        if (index == 100 || !(playerlist[index].username.equals(username))){
            System.out.println("The player does not exist.");
        }else {
            NimPlayer player = playerlist[index];
            player.edit(firstname,lastname);
        }
    }

    public static void resetstats(String argument){
        String username = argument;
        if (username == null){
            System.out.println("Are you sure you want to remove all players? (y/n)");
            if (keyboard.nextLine().equals("y")){
                for (int i = 0; i < 100; i++){
                    NimPlayer player = playerlist[i];
                    if (player != null){
                        player.reset();
                    }
                }
            }
            return;
        }
        int index = checkExist(username);
        if (playerlist[index] == null){
            System.out.println("The player does not exist.");
            return;
        }
        if (index == 100 || !(playerlist[index].username.equals(username))){
            System.out.println("The player does not exist.");
        }else {
            NimPlayer player = playerlist[index];
            player.reset();
        }
    }

    public static void  displayplayer(String argument){
        String username = argument;
        if (username == null){
            for (int i = 0; i<100; i++){
                NimPlayer player = playerlist[i];
                if (playerlist[i] != null){
                    System.out.println(player.getUsername()+","+player.getFirstname()+","+player.getLastname()+","+player.getGame()+" games,"+player.getWin()+" wins");
                }
                else {
                    return;
                }
            }
            return;
        }
        int index = checkExist(username);
        if (index == 100 || playerlist[index] == null){
            System.out.println("The player does not exist.");
        }
        else {
            NimPlayer player = playerlist[index];
            System.out.println(player.getUsername()+","+player.getFirstname()+","+player.getLastname()+","+player.getGame()+" games,"+player.getWin()+" wins");
        }
    }

    public static void rankings(String argument){
        if (argument == null) argument = "desc";
        if (argument.equals("desc")){
            int count = 0;
            for (int i = 1;i < 11; i++){
                for (int j = 0; j < 100; j++){
                    int rank = 1;
                    NimPlayer playerj = playerlist[j];
                    for (int k = 0; k < 100; k++){
                        NimPlayer playerk = playerlist[k];
                        if (playerj != null && playerk !=null){
                            if (playerj.getwinningRatio()<playerk.getwinningRatio())
                                rank++;
                        }
                    }
                    if (rank == i && playerj != null && count < 10){
                        System.out.println(Math.round(playerj.getwinningRatio())+","+playerj.getGame()+","+playerj.getFirstname()+","+playerj.getLastname());
                        count++;
                    }
                }
            }
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
