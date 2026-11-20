package dominio;

import java.util.ArrayList;

public class Ludoteca {

    private ArrayList <Videojuego2> ludoteca1 = new ArrayList<>(); //Crear ArrayList de videojuegos

    public Ludoteca (ArrayList <Videojuego2> Ludoteca_){
        ludoteca1 = Ludoteca_;
    }

    //REQ 3 - REQ 4 (Reto 10)
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

    public void listar(){
        for (Videojuego2 videojuego : ludoteca1){
            System.out.println(videojuego.mostrarFicha());
            
        }
    }
    //REQ 5
    public String buscarPorTitulo(String titulo){ 
        for (Videojuego2 videojuego : ludoteca1){ 
            if (videojuego.getTitulo().equalsIgnoreCase(titulo)){ 
                return videojuego + "\n"; 
            }
        }
        return null; 
    }
    public double calcularPuntuacionMedia(){
        
        double resultado = 0; 
        for (Videojuego2 videojuego : ludoteca1){
            resultado += videojuego.getPuntuacion() ;
        }
        return resultado/ludoteca1.size();
    }
    /* public String obtenerMejorValorado(){
         for (Videojuego2 videojuego : ludoteca1){ 
            if (videojuego.getPuntuacion()){ 
                return videojuego + "\n"; 
            }
        }
    }
     */
}

    