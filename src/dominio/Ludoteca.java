package dominio;

import java.util.ArrayList;

public class Ludoteca {

    private ArrayList <Videojuego2> ludoteca1 = new ArrayList<>();

    public Ludoteca (ArrayList <Videojuego2> Ludoteca_){
        ludoteca1 = Ludoteca_;
    }
    public Ludoteca (){}
    public Ludoteca agregar(Videojuego2 videojuego){
        ludoteca1.add(videojuego);
        return this;
    }

}
