/**
 * Created by es on 2017/4/27.
 */
public class NimGame {
    public static int stonenum = 0;
    public int upperbound = 0;

    //To get the value of the upper bound and the number of stones
    public NimGame(int upperbound, int stonenum) {
        this.upperbound = upperbound;
        this.stonenum = stonenum;
    }

    //To remove stones, if there is stones left, show the stone's information
    public void remove(int stone) {
        stonenum = stonenum - stone;
        if(!empty()){
            printNimstoneinfo();
        }
    }
    //To check if there is no stone left
    public boolean empty() {
        if (stonenum == 0) return true;
        else {
            return false;
        }
    }

    //show the number of stones left
    public int reststone() {
        return stonenum;
    }

    //show the stone's information
    public void printNimstoneinfo() {
        System.out.println();
        System.out.print(stonenum + " stones left:");
        for (int i = 0; i < stonenum; i++) {
            System.out.print(" *");
        }
        System.out.println();
    }

    //Output the upper bound
    public int getUpperbound() {
        return upperbound;
    }
}
