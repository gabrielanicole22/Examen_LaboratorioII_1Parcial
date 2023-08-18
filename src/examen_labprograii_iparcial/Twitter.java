/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_labprograii_iparcial;

/**
 *
 * @author Gabriela Mejia
 */
public abstract class Twitter extends SocialClass{
    public Twitter(String user){
        super(user);
    }
    
    @Override
    public void timeline() {
        for (String post : posts) {
            System.out.println(post);
        }
    }
}