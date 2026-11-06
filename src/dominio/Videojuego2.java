package dominio;

public class Videojuego2 {
    private String titulo;
    private String plataforma;
    private int puntuacion;
    private int horasJugadas;
    
    public Videojuego2 (String titulo_, String plataforma_, int puntuacion_, int horasJugadas_){
        setTitulo(titulo_);
        setPlataforma(plataforma_);
        setPuntuacion(puntuacion_);
        setHorasJugadas(horasJugadas_);
    }

    //Getters
    public String getTitulo(){
        return titulo;
    }
    public String getPlataforma(){
        return plataforma;
    }
    public int getPuntuacion(){
        return puntuacion;
    }
    public int getHorasJugadas(){
        return horasJugadas;
    }

    //Setters
    public void setTitulo(String nuevoTitulo){
        boolean verificar = nuevoTitulo.isEmpty();
        if (verificar == true){
            System.out.println("Error");
            titulo  = "Sin titulo";
        }
        else {
            titulo = nuevoTitulo;
        }
    }


    public void setPlataforma(String nuevoPlataforma){
        plataforma = nuevoPlataforma;
    }

    
    public void setPuntuacion(int nuevoPuntuacion){
        if (nuevoPuntuacion < 0 || nuevoPuntuacion > 100){
            System.out.println("Error");
            puntuacion = -1;
        }
        else {
            puntuacion = nuevoPuntuacion;
        }
    }


    public void setHorasJugadas(int nuevoHorasJugadas){
        if (nuevoHorasJugadas < 0 ){
            System.out.println("Error");
            horasJugadas = -1;
        }
        else {
            horasJugadas = nuevoHorasJugadas;
        }
    }


    //Overide
    public String toString(){
        return String.format("Título: %s, Plataforma: %s, Puntuación: %d, Horas Jugadas: %d", titulo, plataforma, puntuacion, horasJugadas);
    }
}