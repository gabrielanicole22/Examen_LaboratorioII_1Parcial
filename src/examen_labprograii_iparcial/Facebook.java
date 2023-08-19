package examen_labprograii_iparcial;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * David Zelaya
 */
public class Facebook extends SocialClass implements Commentable {
    
    private ArrayList<Comment> Comentarios;
    
    public Facebook(String username){
       super(username);
       this.Comentarios = new ArrayList<>(); 
    }
    
    public void timeline() {

        String datos = "";
        for (int i = 0; i < Comentarios.size(); i++) {
            datos = " Post " + (i + 1);
            for (Comment comment : Comentarios) {
                if (comment.getID() == i) {
                    datos += comment.list();
                }
            }
        }
        JOptionPane.showMessageDialog(null, datos, "Comentarios", JOptionPane.INFORMATION_MESSAGE);

    }
    public String timelinee() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < Comentarios.size(); i++) {
        sb.append("Post ").append(i + 1).append("\n");
        for (Comment comment : Comentarios) {
            if (comment.getID() == i) {
                sb.append(comment.list());
            }
        }
    }
    return sb.toString();
}

  public boolean addComment(Comment comment) {
        if (comment.getID() >= 0 && comment.getID() < posts.size()) {
            Comentarios.add(comment);
            return true;
        }
        return false;
    }
}