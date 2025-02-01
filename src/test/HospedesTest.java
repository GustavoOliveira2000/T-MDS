/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rodri
 */
import com.mycompany.hotelmanagement.Hospedes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HospedesTest {

    @Test
    public void testHospedeGettersAndSetters() {
        Hospedes hospede = new Hospedes(1, "Ana Costa", "ana@gmail.com", "+351912345678");

        // Testando getters
        assertEquals(1, hospede.getId());
        assertEquals("Ana Costa", hospede.getNome());
        assertEquals("ana@gmail.com", hospede.getEmail());
        assertEquals("+351912345678", hospede.getContacto());

        // Testando setters
        hospede.setId(2);
        hospede.setNome("Pedro Santos");
        hospede.setEmail("pedro@gmail.com");
        hospede.setContacto("+351987654321");
        assertEquals(2, hospede.getId());
        assertEquals("Pedro Santos", hospede.getNome());
        assertEquals("pedro@gmail.com", hospede.getEmail());
        assertEquals("+351987654321", hospede.getContacto());
    }
}