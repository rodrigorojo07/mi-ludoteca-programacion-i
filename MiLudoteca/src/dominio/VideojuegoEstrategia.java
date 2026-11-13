package dominio;

public class VideojuegoEstrategia extends Videojuego2{


    private int numeroFacciones ;

    public VideojuegoEstrategia (String titulo_, String plataforma_, int puntuacion_, int horasJugadas_,int numeroFacciones_){
        super(titulo_,plataforma_,puntuacion_,horasJugadas_);
        setNumeroFacciones (numeroFacciones_);
    
    
    }
     public int getNumeroMisiones(){
        return numeroFacciones;
    }

 public void setNumeroFacciones(int numeroFacciones_){
        if (numeroFacciones_ < 0 ){
            System.out.println("Error");
            numeroFacciones = -1;
        }
        else {
            numeroFacciones = numeroFacciones_;
        }
    }

public String toString(){
    return super.toString() + "Numero de Facciones: " + numeroFacciones;
}
}

