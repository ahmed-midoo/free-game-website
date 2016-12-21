/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Systemgame;

import java.util.Locale;
import java.util.Vector;

/**
 *
 * @author ahmed
 */
public class Game {
 String GameName; 
 categories  category; 
 String DeveloperName; 
 int  MinimumAge;
 String requirments;
 int scoreboard;
 int rating;
 boolean seen=false;
 Vector<opinion> Opinion;
 
 
    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }
  
    public void setOpinion(opinion op) {
        
        Opinion.add(op);
        
    }

    public Vector<opinion> getOpinion() {
        return Opinion;
    }

    
       public Game() {
       GameName = "";
       category = null;///////////////////////////
       DeveloperName = "";
       MinimumAge = 0;
       requirments = "";
       scoreboard = 0;
       rating = 0;
       
       opinion op=new opinion(null);/////////////////
    }

    public Game(String GameName, categories category, String DeveloperName, int MinimumAge, String requirments, int scoreboard, int rating) {
        this.GameName = GameName;
        this.category = category;////////////////////////////
        this.DeveloperName = DeveloperName;
        this.MinimumAge = MinimumAge;
        this.requirments = requirments;
        this.scoreboard = scoreboard;
        this.rating = rating;
        
        opinion op=new opinion();/////////////////////////
    }

    public String getGameName() {
        return GameName;
    }

    public void setGameName(String GameName) {
        this.GameName = GameName;
    }

    public categories getCategory() {
        return category;
    }

    public void setCategory(categories category) {
        this.category = category;
    }

    public String getDeveloperName() {
        return DeveloperName;
    }

    public void setDeveloperName(String DeveloperName) {
        this.DeveloperName = DeveloperName;
    }

    public int getMinimumAge() {
        return MinimumAge;
    }

    public void setMinimumAge(int MinimumAge) {
        this.MinimumAge = MinimumAge;
    }

    public String getRequirments() {
        return requirments;
    }

    public void setRequirments(String requirments) {
        this.requirments = requirments;
    }

    public int getScoreboard() {
        return scoreboard;
    }

    public void setScoreboard(int scoreboard) {
        this.scoreboard = scoreboard;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setCategory(Locale.Category Categories) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
