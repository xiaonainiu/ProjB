/**
 * Created by Shen YI(844373) on 2017/3/20.
 */
public class NimPlayer {

    String name;

    //To get the player's name
    public NimPlayer(String name) {
        this.name = name;
    }

    //player's action, remove stones
    public static void removeStone(NimGame s, int r) {
        s.remove(r);
    }

    //Output player's name
    public String getname() {
        return name;
    }

    public static boolean addplayer(String argument){
        String[] argu = argument.split(",");
        for (String s:argu){
            System.out.println(s);
        }
        System.out.print("addplayer succeed");
        return true;
    }

    public static boolean removeplayer(String argument){
        System.out.print("removeplayer succeed");
        return true;
    }

    public static boolean editplayer(String argument){
        String[] argu = argument.split(",");
        for (String s:argu){
            System.out.println(s);
        }
        System.out.print("editplayer succeed");
        return true;
    }

    public static boolean resetstats(String argument){
        System.out.print("resetstats succeed");
        return true;
    }

    public static boolean displayplayer(String argument){
        System.out.print("displayplayer succeed");
        return true;
    }
    public static boolean rankings(String argument){
        System.out.print("rankings succeed");
        return true;
    }
}
