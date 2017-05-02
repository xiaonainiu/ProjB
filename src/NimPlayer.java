import java.util.Objects;

/**
 * Created by Shen YI(844373) on 2017/3/20.
 */
public class NimPlayer {

    String username;
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
    }

    public String getUsername(){
        return this.username;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public String getLastname(){
        return this.lastname;
    }

    public int getGame(){
        return this.game;
    }

    public int getWin(){
        return this.win;
    }

    public  double getwinningRatio(){
        return ((double)this.win*100/this.game);
    }

    public String printwinningRatio(){
        String ratio = String.valueOf(Math.round(getwinningRatio())) + "%";
        while (ratio.length()<4){
            ratio = ratio + " ";
        }
        return ratio;
    }

    public String printGame(){
        String game = String.valueOf(getGame());
        while (game.length()<2){
            game = "0"+game;
        }
        return game;
    }

    public String printrankings(){
        String rank = printwinningRatio()+" | "+printGame()+" games | "+getFirstname()+" "+getLastname();
        return rank;
    }

    public void edit(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void reset(){
        this.game = 0;
        this.win = 0;
    }

    public void Win(){
        this.game++;
        this.win++;
    }

    public void Lose(){
        this.game++;
    }
}


