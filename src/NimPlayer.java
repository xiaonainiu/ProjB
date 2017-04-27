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
}
