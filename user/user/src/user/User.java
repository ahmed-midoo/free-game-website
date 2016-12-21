/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import Systemgame.MatchesPicturesGame;
import Systemgame.MultipleChoiceGames;
import Systemgame.RunCodeGames;
import Systemgame.categories;
import Systemgame.SystemGame;
import com.sun.org.apache.bcel.internal.generic.GOTO;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Ahmed Hesham
 */
public class User {

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }
    

    public User(String Name, String Mail, String password, int Score, String mobile,String type) {
        this.Name = Name;
        this.type=type;
        this.Mail = Mail;
        this.password = password;
        this.Score = Score;
        this.mobile = mobile;
    }
    public User() {
        Name = "";
        Mail = "";
        password = "";
        Score = 0;
        mobile = "";
        type="";
    }
    
    
    private String type;
    private String Name;
    private String Mail;
    private String password;
    private int Score;
    private String mobile;
    public static Vector <User>name=new Vector();
    //public Vector <String>pass=new Vector();
    //public Vector <String>mob=new Vector();
    //public Vector <String>mail=new Vector();
    //public Vector <int>Type=new Vector();

    public void register(String nam,String pas,String mal,String mo,String type){
        User user=new User();
        user.setName(nam);
        user.setMobile(mo);
        user.setPassword(pas);
        user.setMail(mal);
        user.settype(type);
        name.add(user);
        System.out.println("Registeration Successful");
    }
    public User login(String Name,String Pass){
        //int namenum=0;int passnum=0;
        
        int i=0;
        if(name.isEmpty()){System.out.println("empty");}
        for ( ;i<name.size();i++){
            if (Name.equals(name.get(i).getName())){
                    if (Pass.equals(name.get(i).getPassword())){
                        return name.get(i);
                    }
            }
        }
        if (i==name.size()){
            System.out.println("invalid name or password");System.exit(0);
        }
        return null;
    }
    public void intializeadmin(){
       // register("admin", "admin", "qdwad", "1224235", "Admin");
            User user=new User();
        user.setName("admin");
        user.setMobile("123");
        user.setPassword("admin");
        user.setMail("qqewad");
        user.settype("Admin");
        name.add(user);
    }
    public static void main(String[] args) {
        int x=0;
        Admin temp=new Admin();
        SystemGame system=new SystemGame();
        MatchesPicturesGame gameMatch=new MatchesPicturesGame();
        MultipleChoiceGames gameMul=new MultipleChoiceGames();
        RunCodeGames gamecode=new RunCodeGames();
        
        while(true)
        {
            Scanner a=new Scanner(System.in);
            System.out.println("1.Register \n 2.Login \n 3.exit");
            x=a.nextInt();
            User user=new User();
            user.intializeadmin();
            if (x==1){
                
                System.out.println("Choose the type of account either Student or Teacher");
                String typ=a.next();
                System.out.println("Enter the username");
                String nm=a.next();
                System.out.println("Enter the password");
                String ps=a.next();
                System.out.println("Re-Enter the password");
                String ps2=a.next();
                System.out.println("enter your E-mail");
                String m=a.next();
                System.out.println("Enter your Mobile number");
                String mob=a.next();
                if (ps.equals(ps2)){
                    user.register(nm, ps, m, mob, typ);
                }else{
                    System.out.println("The password you re-entered didn't match the original password");
                    
                   System.exit(0);
                }
            }
            else if (x==2){
                String N,P,T;
                System.out.println("Enter the username");
                N=a.next();
                System.out.println("Enter the password");
                P=a.next();
                User tempType=user.login(N,P);
                if (tempType.gettype().equals("Teacher"))
                {
                    
                    Teacher Teacher=new Teacher();
                    Teacher.setName(tempType.getName());
                    Teacher.setMail(tempType.getMail());
                    Teacher.setMobile(tempType.getMobile());
                    Teacher.setPassword(tempType.getPassword());
                    while (true)
                    {
                        
                        System.out.println("1-Play game \n 2-Create game \n 3-Add Request \n 4-exit");
                        int y;
                        y=a.nextInt();
                        if (y==1)
                        {
                            System.out.println("choose category :");
                            System.out.println("1-MatchesPicturesGame \n 2-MultipleChoiceGames \n 3-RunCodeGames");
                            String h=a.next();
                            if (h.equals("MatchesPicturesGame"))
                            {
                                for (int i=0;i<gameMatch.f3.size();){
                                    System.out.println(gameMatch.f3.get(i).getGameName());
                                }
                            }
                            else if (h.equals("MultipleChoiceGames"))
                            {
                                for (int i=0;i<gameMul.f2.size();){
                                    System.out.println(gameMul.f2.get(i).getGameName());
                                }
                            }
                            else if (h.equals("RunCodeGames"))
                            {
                                for (int i=0;i<gamecode.f1.size();){
                                    System.out.println(gamecode.f1.get(i).getGameName());
                                }
                            }
                        }
                        else if (y==2)
                        {
                            System.out.println("choose category :");
                            System.out.println("1-MatchesPicturesGame \n 2-MultipleChoiceGames \n 3-RunCodeGames");
                            String q=a.next();
                            categories cat=new categories();
                            cat.setCategoriesname(q);
                            System.out.println("Enter the game name");
                            String w=a.next();
                            System.out.println("Enter the minimum age of the player");
                            int e=a.nextInt();
                            System.out.println("Enter the game requirments");
                            String r=a.next();
                            Teacher.addGame(w, cat, Teacher.getName(), e, r, temp);
                            
                        }else if (y==3){
                            System.out.println("Enter your Request");
                            String f=a.next();
                            Teacher.setRequest(f);
                            temp=Teacher.addrequest(temp,Teacher);
                            System.out.println("Request sent successfully");
                        }else if (y==4){
                            System.out.println("Log out Succesful");
                            break;
                        }else{System.out.println("Invalid choice");System.exit(0);}
                    }
                }
                else if (tempType.gettype().equals("Student"))
                {
                    Student student=new Student();
                    student.setName(tempType.getName());
                    student.setMail(tempType.getMail());
                    student.setMobile(tempType.getMobile());
                    student.setPassword(tempType.getPassword());
                    while (true)
                    {
                    System.out.println("1-Play game \n 2-Complain \n 3-exit");
                     int y=0;
                     y=a.nextInt();
                        if (y==1)
                        {
                            System.out.println("choose category :");
                            System.out.println("1- MatchesPicturesGame \n 2- MultipleChoiceGames \n 3-RunCodeGames");
                            String h=a.next();
                            if (h.equals("MatchesPicturesGame"))
                            {
                                for (int i=0;i<gameMatch.f3.size();){
                                    System.out.println(gameMatch.f3.get(i).getGameName());
                                }
                            }
                            else if (h.equals("MultipleChoiceGames"))
                            {
                                for (int i=0;i<gameMul.f2.size();){
                                    System.out.println(gameMul.f2.get(i).getGameName());
                                }
                            }
                            else if (h.equals("RunCodeGames"))
                            {
                                for (int i=0;i<gamecode.f1.size();){
                                    System.out.println(gamecode.f1.get(i).getGameName());
                                }
                            }
                        } 
                        else if (y==2){
                            System.out.println("Enter your Complain");
                            String f=a.next();
                            student.setComplain(f);
                            student.addComplain(temp, student);
                            System.out.println("Complain sent successfully");
                        }
                        else if (y==3){
                            System.out.println("Log out Succesful");
                            break;
                        }else{System.out.println("Invalid choice");System.exit(0);}
                        
                    }
                    }else if (tempType.gettype().equals("Admin")){
                        while(true){
               int y=0;
               System.out.println("1-Approve Game \n 2-Recieve Requests \n 3-Recieve Complian");
               String q=a.next();
               if(q=="1")
               {
                   temp.check(system);
               }
               else if(q=="2")
               {
                   temp.Showrequests(temp);
               }
               else if (q=="3")
               {
                   temp.showcomplains(temp);
               }
               else
               {
                 System.out.println("Invalid choice");break;  
               }   
                    }
                }
            }else if (x==3){
                System.exit(0);
                        }
        }    
    }
}
    
