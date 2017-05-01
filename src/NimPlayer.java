import java.util.Objects;

/**
 * Created by Shen YI(844373) on 2017/3/20.
 */
public class NimPlayer {

    public String username;
    String firstname;
    String lastname;
    int game;
    int win;

    public NimPlayer(String username, String firstname, String lastname){
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.game = 0;
        this.win = 0;
        System.out.println(this.username +","+ this.firstname +","+ this.lastname +","+ game +","+ win);
        System.out.print("Plaayer Created");
    }
    public String getUsername(){

        return this.username;
    }
//    public list(){
//        NimPlayer[] list = new NimPlayer[100];
//        list[0] = new NimPlayer();
//        list[0].username = "name1";
//        System.out.println(list[0].username);
//    }


//
//    public static boolean removeplayer(String argument){
//        System.out.print("removeplayer succeed");
//        return true;
//    }
//
//    public static boolean editplayer(String argument){
//        String[] argu = argument.split(",");
//        for (String s:argu){
//            System.out.println(s);
//        }
//        System.out.print("editplayer succeed");
//        return true;
//    }
//
//    public static boolean resetstats(String argument){
//        System.out.print("resetstats succeed");
//        return true;
//    }
//
//    public static boolean displayplayer(String argument){
//        System.out.print("displayplayer succeed");
//        return true;
//    }
//    public static boolean rankings(String argument){
//        System.out.print("rankings succeed");
//        return true;
//    }

    //player's action, remove stones
//    public static void removeStone(NimGame s, int r) {
//        s.remove(r);
//    }

    //Output player's name
//    public String getname() {
//        return name;
//    }
}


