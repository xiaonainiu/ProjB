/**
 * Created by es on 2017/4/27.
 */

public class NimGame {
//    static Scanner keyboard;
    public static int stonenum;
    public static int upperbound;
    NimPlayer player1;
    NimPlayer player2;

    //To get the value of the upper bound and the number of stones
    public NimGame(int initialstones, int upperbound, NimPlayer player1, NimPlayer player2) {
        this.stonenum = initialstones;
        this.upperbound = upperbound;
        this.player1 = player1;
        this.player2 = player2;
        System.out.println();
        System.out.println("Initial stone count: "+initialstones);
        System.out.println("Maximum stone removal: "+upperbound);
        System.out.println("Player 1: "+player1.getLastname()+" "+player1.getFirstname());
        System.out.println("Player 2: "+player2.getLastname()+" "+player2.getFirstname());

            printNimstoneinfo();

            //to define the active player, which is going to play next, or win.
            int turn = 0;
            NimPlayer activeplayer = null;

            while (!empty()) {
                if (turn % 2 == 0) {
                    while (!playingNim(player1)) ;
//                    printNimstoneinfo();
                    activeplayer = player2;
                } else {
                    while (!playingNim(player2)) ;
//                    printNimstoneinfo();
                    activeplayer = player1;
                }
                turn++;
            }

            System.out.println();
            System.out.println("Game Over");
            if (turn % 2 == 0){
                player1.Win();
                player2.Lose();
            }else {

                player1.Lose();
                player2.Win();
            }
            System.out.println(activeplayer.getLastname()+" "+activeplayer.getFirstname() + " wins!");
            return;
    }

        public static boolean playingNim(NimPlayer player) {
//            printNimstoneinfo();
        System.out.println(player.getLastname() + "'s turn - remove how many?");
        int removenum = Nimsys.keyboard.nextInt();
        if (removenum > getUpperbound() || removenum < 1 || removenum > reststone()) {
            System.out.println("Invalid move. You must remove between 1 and "+min(upperbound,stonenum)+" stones.");
            System.out.println();
            printNimstoneinfo();
            return false;
        } else {
            removeStone(removenum);
            return true;
        }
    }

    public static void removeStone(int r) {
        remove(r);
    }

    //To remove stones, if there is stones left, show the stone's information
    public static void remove(int stone) {
        stonenum = stonenum - stone;
        if(!empty()){
            printNimstoneinfo();
        }
    }
    //To check if there is no stone left
    public static boolean empty() {
        if (stonenum == 0) return true;
        else {
            return false;
        }
    }

    //show the number of stones left
    public static int reststone() {
        return stonenum;
    }

    //show the stone's information
    public static void printNimstoneinfo() {
        System.out.println();
        System.out.print(stonenum + " stones left:");
        for (int i = 0; i < stonenum; i++) {
            System.out.print(" *");
        }
        System.out.println();

    }

    //Output the upper bound
    public static int getUpperbound() {
        return upperbound;
    }
    public static int min(int upperbound,int stonenum){
        if (upperbound<=stonenum) return upperbound;
        else return stonenum;
    }
}
