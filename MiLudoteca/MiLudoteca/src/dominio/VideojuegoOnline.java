package dominio;

public class VideojuegoOnline extends Videojuego2{


    private int numeroJugadoresOnline ;

    public VideojuegoOnline (String titulo_, String plataforma_, int puntuacion_, int horasJugadas_,int numeroJugadoresOnline_){
        super(titulo_,plataforma_,puntuacion_,horasJugadas_);
        setNumeroJugadoresOnline (numeroJugadoresOnline_);
    
    
    }
     public int getNumeroJugadoresOnline(){
        return numeroJugadoresOnline;
    }

 public void setNumeroJugadoresOnline(int numeroJugadoresOnline_){
        if (numeroJugadoresOnline_ < 0 ){
            System.out.println("Error");
            numeroJugadoresOnline = -1;
        }
        else {
            numeroJugadoresOnline = numeroJugadoresOnline_;
        }
    }

public String toString(){
    return super.toString() + "Numero de jugadores que están conectados: " + numeroJugadoresOnline;
}
}

