package examen_labprograii_iparcial;

import java.util.Calendar;

/**
 *
 * David Zelaya
 */

public class Comment {

private int postID;
private String Autor;
private String comentario;
private Calendar Fecha;

public Comment (int id,String autor, String comment){
    this.postID=id;
    this.Autor=autor;
    this.comentario=comment;
    Fecha=Calendar.getInstance();
}

public int getID(){
    return postID;
}

public String list(){
    String listar;
    
    listar="Autor: "+Autor+"- Fecha: "+Fecha
        +"\n "+comentario;
    
    return listar;
}


    
}
