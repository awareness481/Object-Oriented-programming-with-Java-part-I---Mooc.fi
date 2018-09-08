
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p
 */
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int max;
    
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.max = 16;
    }

    public String getName() {
        return name;
    }
    
    public void addPlayer(Player player) {
        if (this.size() >= max) {
            return;
        }
        
        players.add(player);
    }
    
    public void printPlayers() {
        for (Player p : players) {
            System.out.println(p.toString());
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.max = maxSize;
    }
    
    public int size() {
        return players.size();
    }
    
    public int goals() {
        int goals = 0;
        for (Player player : players) {
            goals += player.goals();
        }
        
        return goals;
    }
    
    
}
