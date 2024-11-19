/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservas.logica;

import java.util.ArrayList;
import java.util.List;
import reservas.dto.Reserva;




/**
 *
 * @author alumno
 */
public class LogicaReservas {
    
    private static List<Reserva> listaReservas = new ArrayList<>();
    
    public static void anadirReserva (Reserva reserva){
        listaReservas.add(reserva);
    }
    
    public static boolean eliminarReserva(String titulo) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getTitulo().equals(titulo)) {
                listaReservas.remove(reserva); // Eliminar la reserva encontrada
                return true; // Reserva eliminada con éxito
            }
        }
        return false; // No se encontró la reserva
    }
    

    public static List<Reserva> getListaReservas() {
        return listaReservas;
    }
    
}
