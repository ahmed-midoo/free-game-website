/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author Ahmed Hesham
 */
public class Student extends User{

    public String getComplain() {
        return complain;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }
    private String complain="";
    public void bookmarkgame(String gamename){
        //send the gamename to the database table of the student
    }
    public void addrating(String gamename){
        //send the rating to the database table of the selected game
    }
    public void addopinion(String gamename,String OPINION){
        //Opinion opinion = new Opinion();
        //opinion.setopinion(OPINION);
        //then it will be sent to the database to be saved there
    }
    public Admin addComplain(Admin x,Student y){
        x.Complain.add(y);
        return x;
    }
}
