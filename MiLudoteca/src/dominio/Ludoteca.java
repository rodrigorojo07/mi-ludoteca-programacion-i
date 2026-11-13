package dominio;

import java.util.ArrayList;

public class Ludoteca {

    private ArrayList <Videojuego2> ludoteca1 = new ArrayList<>(); //Crear ArrayList de videojuegos

    public Ludoteca (ArrayList <Videojuego2> Ludoteca_){
        ludoteca1 = Ludoteca_;
    }

    //REQ 3 
    public Ludoteca (){} //Crear un contructor vacío para poder crear un objeto Ludoteca sin necesidad de pasarle un ArrayList de videojuegos
    public Ludoteca agregar(Videojuego2 videojuego){ //Crear método para agregar videojuegos a la Ludoteca, recibe objeto y lo va agregando a la lista.
        ludoteca1.add(videojuego); // Agrega con función add
        return this; //Devuelve Ludoteca para poder encadenar llamadas al método agregar
    }

    //REQ 4 
    public String toString(){
        String resultado = ""; //Si no se inicializa, el resultado es null
        for (Videojuego2 videojuego : ludoteca1){ //Recorre la lista de videojuegos y los concatena en un String
            resultado += videojuego + "\n"; //Suma el videojuego y un salto de línea al resultado
        }
        return resultado;
    }

    //REQ 5
    public String buscarPorTitulo(String titulo){ //Recibe un título y busca en la lista de videojuegos
        for (Videojuego2 videojuego : ludoteca1){ //Recorre la lista de videojuegos
            if (videojuego.getTitulo().equals(titulo)){ //Compara el título del videojuego con el título recibido
                return videojuego + "\n"; //Devuelve el videojuego si son iguales
            }
        }
        return null; //Devuelve null si no encuentra el videojuego
    }


}

    