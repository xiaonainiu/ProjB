import java.util.Objects;

/**
 * Created by Shen YI(844373) on 2017/3/20.
 */
public class NimPlayer {

    public String username;
    String firstname;
    String lastname;
//    String name;

    NimPlayer() {
//        this.name = name;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
    }

//    public String getUsername(){return username;}

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

    //player's action, remove stones
//    public static void removeStone(NimGame s, int r) {
//        s.remove(r);
//    }

    //Output player's name
//    public String getname() {
//        return name;
//    }
}


