/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_labprograii_iparcial;

/**
 *
 * @author Gabriela Mejia
 */
public  class Twitter extends SocialClass{
    public Twitter(String user){
        super(user);
    }
    
    
public void timeline() {
        System.out.println("Timeline for " + username);
        for (String post : posts) {
            System.out.println(post);
        }
        System.out.println();
    }

public String timelinee() {
    StringBuilder sb = new StringBuilder();
    sb.append("Timeline de ").append(username).append("\n");
    for (String post : posts) {
        sb.append(post).append("\n");
    }
    sb.append("\n");
    return sb.toString();
}

}