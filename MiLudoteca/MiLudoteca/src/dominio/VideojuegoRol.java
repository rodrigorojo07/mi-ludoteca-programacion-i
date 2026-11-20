package dominio;

public class VideojuegoRol extends Videojuego2{


    private int numeroMisiones ;

    public VideojuegoRol (String titulo_, String plataforma_, int puntuacion_, int horasJugadas_,int numeroMisiones_){
        super(titulo_,plataforma_,puntuacion_,horasJugadas_);
        setNumeroMisiones (numeroMisiones_);
    
    
    }
     public int getNumeroMisiones(){
        return numeroMisiones;
    }

 public void setNumeroMisiones(int numeroMisiones_){
        if (numeroMisiones_ < 0 ){
            System.out.println("Error");
            numeroMisiones = -1;
        }
        else {
            numeroMisiones = numeroMisiones_;
        }
    }

public String toString(){
    return super.toString() + "Numero de misiones" + numeroMisiones;
}
}

