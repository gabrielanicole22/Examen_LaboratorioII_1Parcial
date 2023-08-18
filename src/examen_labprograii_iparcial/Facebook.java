package examen_labprograii_iparcial;

import java.util.ArrayList;

/**
 *
 * David Zelaya
 */
public class Facebook extends SocialClass implements Commentable {
    
    private ArrayList<Comment> Comentarios = new ArrayList();
    
    public Facebook(String username){
       super(username);
        Comentarios = new ArrayList<>(); 
    }
    
    public boolean AgregarComment(int id, Comment comment){
        int postId = comment.getID();
        if (postId >= 0 && postId < posts.size()) {
            Comentarios.add(comment);
            return true;
        }
        return false;
    }

    public String imprimir(){
        String datos="";
        for(int i=0;i<Comentarios.size();i++){
            
        }
        return datos;
        
    }
    
    
    public void timeline() {
    
    }

    public boolean addComment(Comment comment) {
    
    return true;
    }
    
    
    
    
}
