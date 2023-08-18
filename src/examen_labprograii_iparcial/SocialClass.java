/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_labprograii_iparcial;

import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author Gabriela Mejía
 */
public abstract class SocialClass {
    
 public ArrayList<String> friends;
    public ArrayList<String> posts;
    public String username;
    public SocialClass(String username) {
        this.username = username;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }


    public boolean addFriend(String user) {
        if (!user.equals(username) && !friends.contains(user)) {
            friends.add(user);
            return true;
        }
        return false;
    }

    public void addPosts(String msg){
        posts.add(msg);
    }

    public abstract void timeline();

    public void myProfile(JTextArea area) {
        
        String Informacion="Username: " + username
                +"\nTimeline: ";
        
        
        System.out.println("Username: " + username);
        System.out.println("Timeline:");
        timeline();
        System.out.println("Friends:");
        printFriends();
    }

    private void printFriends() {
        for (int i = 0; i < friends.size(); i++) {
            System.out.print(friends.get(i) + " ");
            if ((i + 1) % 10 == 0 || i == friends.size() - 1) {
                System.out.println();
            }
        }
    }
}