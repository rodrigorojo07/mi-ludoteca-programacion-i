package presentacion;

import dominio.Videojuego2;
import dominio.VideojuegoDeportivo;
import dominio.VideojuegoEstrategia;
import dominio.VideojuegoOnline;
import dominio.VideojuegoRol;
import dominio.Ludoteca;

public class Main {
    public static void main(String[] args) {
        // Crear un nuevo videojuego
        Ludoteca miLudoteca = new Ludoteca();

        VideojuegoRol juego1 = new VideojuegoRol("WOW", "PC", 85, 500,300);
        VideojuegoOnline juego2 = new VideojuegoOnline("Clash Royale: Wild Hunt", "Mobile", 93, 200,5000000);
        VideojuegoEstrategia juego3 = new VideojuegoEstrategia("Brawl Stars", "Mobile", 90, 100,10);
        VideojuegoDeportivo juego4 = new VideojuegoDeportivo("Brawl Stars", "Mobile", 90, 100, "Fútbol");

        // Agregar videojuegos a la ludoteca
        miLudoteca.agregar(juego1);
        miLudoteca.agregar(juego2);
        miLudoteca.agregar(juego3);
        miLudoteca.agregar(juego4);

        //Comprobar Buscar por título
        String tituloBuscado = "Clash Royale: Wild Hunt"; //Buscamos titulos
        String resultadoBusqueda = miLudoteca.buscarPorTitulo(tituloBuscado);
        if (resultadoBusqueda != null) { //Si no es nulo, se encontró el juego
            System.out.println("Videojuego encontrado: " + resultadoBusqueda);
        } 
        else {
            System.out.println("Videojuego no encontrado."); // Si es nulo, no se encontró el juego
        }
        // Mostrar la información de la ludoteca
        System.out.println("Ludoteca:");
        System.out.println(miLudoteca.toString());

        // calacularPUntuaacionMedia 
        double comprobarMedia = miLudoteca.calcularPuntuacionMedia();
        System.out.print("La media es: "+ comprobarMedia);
    }

}

