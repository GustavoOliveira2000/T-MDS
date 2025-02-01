/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rodri
 */
import com.mycompany.hotelmanagement.Funcionarios;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionariosTest {

    @Test
    public void testFuncionarioGettersAndSetters() {
        Funcionarios funcionario = new Funcionarios(1, "João Silva", "Gerente");

        // Testando getters
        assertEquals(1, funcionario.getId());
        assertEquals("João Silva", funcionario.getNome());
        assertEquals("Gerente", funcionario.getCargo());

        // Testando setters
        funcionario.setId(2);
        funcionario.setNome("Maria Oliveira");
        funcionario.setCargo("Funcionário");
        assertEquals(2, funcionario.getId());
        assertEquals("Maria Oliveira", funcionario.getNome());
        assertEquals("Funcionário", funcionario.getCargo());
    }
}
