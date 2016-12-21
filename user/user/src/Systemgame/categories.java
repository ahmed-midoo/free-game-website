/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Systemgame;

import java.util.Vector;

public class categories {
    
        int NumberOfGames;
        String categoriesname;
       


   
        
     public categories() {
        NumberOfGames = 0;
       categoriesname = "";
        }
 

    public categories(int NumberOfGames, String categoriesname) {
        this.NumberOfGames = NumberOfGames;
        this.categoriesname = categoriesname;
       
    }

    public int getNumberOfGames() {
        return NumberOfGames;
    }

    public void setNumberOfGames(int NumberOfGames) {
        this.NumberOfGames = NumberOfGames;
    }

    public String getCategoriesname() {
        return categoriesname;
    }

    public void setCategoriesname(String categoriesname) {
        this.categoriesname = categoriesname;
    }
 

}

