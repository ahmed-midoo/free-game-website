/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import Systemgame.Game;
import java.util.Scanner;
import java.util.Vector;
import Systemgame.SystemGame;
/**
 *
 * @author Ahmed Hesham
 */
public class Admin extends User{
    Vector <Game> game=new Vector();
    Vector <Teacher> Request=new Vector();
    Vector <Student> Complain=new Vector();
    
    public void addDoNotRungame(Game g)
    {
        game.add(g);
    }
    public void check(SystemGame temp)
    {
        Scanner a=new Scanner(System.in);
        for (int i=0;i<game.size();i++)
        {
            System.out.println(game.get(i).getGameName()+"\n"+game.get(i).getMinimumAge());
            System.out.println("if agree enter 1 else 2........");
            int x;
            x=a.nextInt();
            if (x==1)
            {
                game.get(i).setSeen(true);
            }
            else {game.get(i).setSeen   (false);}
        }
        temp.creategame(game);
    }
    public boolean isRequest() {
        return request;
    }

    public void setRequest(boolean request) {
        this.request = request;
    }

    public String getComplains() {
        return complains;
    }

    public void setComplains(String complains) {
        this.complains = complains;
    }


    public Admin() {
        request=false;
        complains="";
    }
    private boolean request=false;
    private String complains="";
    
   
    public void showcomplains(Admin a){
        //this function will retrieve the number of the unseen complains and the name of the sender from the database
        
        String complainername="";
        for (int i=0;i<a.Complain.size();i++){
             System.out.print(a.Complain.get(i).getName());
             System.out.println(" : ");
             System.out.println(a.Complain.get(i).getComplain());
        }
    }
    public void Showrequests(Admin temp){
        for (int i=0;i<temp.Request.size();i++){
                       System.out.print(temp.Request.get(i).getName());
                       System.out.println(" : ");
                       System.out.println(temp.Request.get(i).getRequest());
                   } 
    }
}

