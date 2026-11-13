package presentacion;

import dominio.Videojuego2;
import dominio.Ludoteca;

public class Main {
    public static void main(String[] args) {
        // Crear un nuevo videojuego
        Ludoteca miLudoteca = new Ludoteca();

        Videojuego2 juego1 = new Videojuego2("Call of Duty", "PC", 85, 500);
        Videojuego2 juego2 = new Videojuego2("Clash Royale: Wild Hunt", "Mobile", 93, 200);
        Videojuego2 juego3 = new Videojuego2("Brawl Stars", "Mobile", 90, 100);

        // Agregar videojuegos a la ludoteca
        miLudoteca.agregar(juego1);
        miLudoteca.agregar(juego2);
        miLudoteca.agregar(juego3);

        //Comprobar Buscar por título
        String tituloBuscado = "Clash Royale: Wild Hunt"; //Buscamos titulos
        String resultadoBusqueda = miLudoteca.buscarPorTitulo(tituloBuscado);
        if (resultadoBusqueda != null) { //Si no es nulo, se encontró el juego
            System.out.println("Videojuego encontrado: " + resultadoBusqueda);
        } else {
            System.out.println("Videojuego no encontrado."); // Si es nulo, no se encontró el juego
    }
        // Mostrar la información de la ludoteca
        System.out.println("Ludoteca:");
        System.out.println(miLudoteca.toString());
    }
}

