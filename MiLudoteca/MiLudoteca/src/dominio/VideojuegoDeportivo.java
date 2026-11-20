package dominio;

public class VideojuegoDeportivo extends Videojuego2{


    private String deporte;

    public VideojuegoDeportivo (String titulo_, String plataforma_, int puntuacion_, int horasJugadas_, String deporte_){
        super(titulo_,plataforma_,puntuacion_,horasJugadas_);
        setDeporte(deporte_);
    
    
    }
     public String getDeporte(){
        return deporte;
    }

 public void setDeporte(String deporte_){
    deporte = deporte_;
 }
 
            
          

public String toString(){
    return super.toString() + "Tipo de deportes:" + deporte;
}
}
