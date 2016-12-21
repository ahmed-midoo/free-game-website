/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import Systemgame.Game;
import Systemgame.categories;
import Systemgame.SystemGame;
/**
 *
 * @author Ahmed Hesham
 */
public class Teacher extends User{

    public String getGamesdeveloped() {
        return Gamesdeveloped;
    }

    public void setGamesdeveloped(String Gamesdeveloped) {
        this.Gamesdeveloped = Gamesdeveloped;
    }

    public Teacher(String Gamesdeveloped) {
        this.Gamesdeveloped = Gamesdeveloped;
    }
    public Teacher() {
        Gamesdeveloped = "";
    }
    private String Gamesdeveloped;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
    public String request;////////////////////////////////////////////////
    public String getOpinions()
    {
        //implementation  needs database
        return "";
    }
    public void Play()
    {
        
    }
    public void addGame(String gameName,categories Category,String nameDeveloper,int minimumAge,String Requirements,Admin temp)
    {
            Game g=new Game();
            g.setGameName(gameName);
            g.setCategory(Category);
            g.setDeveloperName(nameDeveloper);
            g.setMinimumAge(minimumAge);
            g.setRequirments(Requirements);
            temp.addDoNotRungame(g);
    }
    public String requestDeleteGame(String gameName,String Name)
    {
        String requestform="I am "+Name+". I would like to delete "+gameName+ "Game ";
        return requestform;
    }
    public String Displayinfo(Teacher teacher){
        //This function will get the parameters from the database
        String x="Name: "+teacher.getName()+",";
        x+="Mobile: "+teacher.getMobile()+",";
        x+="Mail: "+teacher.getMail()+",";
        x+="Games Developed: "+teacher.getGamesdeveloped()+",";
        return x;
    }
    public String showscoreboard (String gamename){
        //this function will retrieve the scoreboard of the game in the parameter of the function and displayes it
        return "";
    }
    public String showopnions (String gamename){
        //Opinion opinion = new Opinion();
        //String x=opinion.getopinion();
        //return x;
        return"";
    }
    public Admin addrequest(Admin x,Teacher y){
        x.Request.add(y);
        return x;
    }
}
