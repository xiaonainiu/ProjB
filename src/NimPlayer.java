/**
 * Created by Shen YI(844373) on 2017/3/20.
 */

import java.util.Objects;

public class NimPlayer {

    String username;
    String firstname;
    String lastname;
    int game;
    int win;

//    define a NimPlayer class
    public NimPlayer(String username, String firstname, String lastname) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.game = 0;
        this.win = 0;
    }

    public String getUsername() {
        return this.username;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public int getGame() {
        return this.game;
    }

    public int getWin() {
        return this.win;
    }

//    To get the winning ratio of this player
    public double getwinningRatio() {
        return ((double) this.win * 100 / this.game);
    }

//    To print the winning ratio of this player in integer
    public String printwinningRatio() {
        String ratio = String.valueOf(Math.round(getwinningRatio())) + "%";
        while (ratio.length() < 4) {
            ratio = ratio + " ";
        }
        return ratio;
    }

    public String printplayer(){
        String info;
        info = username+","+lastname+","+firstname+","+game+" games,"+win+" wins";
        return info;
    }

//    To print the number of games this player has played in two-digit
    public String printGame() {
        String game = String.valueOf(getGame());
        while (game.length() < 2) {
            game = "0" + game;
        }
        return game;
    }

//    print the rankings information of this player
    public String printrankings() {
        String rank;
        rank = printwinningRatio()+" | "+ printGame()+" games | "+lastname+" "+firstname;
        return rank;
    }

//    update this player's first name and last name
    public void edit(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

//    reset the statistics of this player
    public void reset() {
        this.game = 0;
        this.win = 0;
    }

//    update this player's statistics win one more games, which means one more games and one more wins
    public void Win() {
        this.game++;
        this.win++;
    }

//    update this player's statistics lose one more games, which means one more games without more wins
    public void Lose() {
        this.game++;
    }
}


