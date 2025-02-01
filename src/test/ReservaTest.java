/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rodri
 */

import com.mycompany.hotelmanagement.Quarto;
import com.mycompany.hotelmanagement.Reserva;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.Date;
import java.util.List;

public class ReservaTest {

    @Test
    public void testAdicionarEListarReservas() {
        Quarto quarto = new Quarto(1, "Suite", "disponível", 4, 2, 1, "mar", true, true);
        Reserva reserva = new Reserva(101, Date.valueOf("2025-02-01"), Date.valueOf("2025-02-05"), "Vista para o mar", new Quarto[]{quarto});

        Reserva.adicionarReserva(reserva);

        List<Reserva> reservas = Reserva.listarReservas();
        assertEquals(1, reservas.size());
        assertEquals(reserva, reservas.get(0));
    }
}