/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Systemgame;

import java.util.Vector;

/**
 *
 * @author ahmed
 */
public class SystemGame
{
 Vector<Game> game=new Vector();  
 
 public void creategame(Vector<Game> v)
 {
     for (int i=0;i<v.size();i++)
     {
         game.add(v.get(i));
     }    
 }
 public void seperation(MatchesPicturesGame z,MultipleChoiceGames x,RunCodeGames c)
 {
     for (int i=0;i<game.size();i++)
     {
         if ("MatchesPicturesGame".equals(game.get(i).category.getCategoriesname()))
         {
             z.f3.add(game.get(i));
         }
         else if ("MultipleChoiceGames".equals(game.get(i).category.getCategoriesname()))
         {
             x.f2.add(game.get(i));
         }
         else if ("RunCodeGames".equals(game.get(i).category.getCategoriesname()))
         {
             c.f1.add(game.get(i));
         }
     }
 }
 public void removegame(String gameinserted)
 {
     int i=0;
     for (;i<game.size();i++)
     {
         if (game.get(i).getGameName().equals(gameinserted))
         {
             game.removeElementAt(i);
             break;
         }
     }
 }
 
 
}
