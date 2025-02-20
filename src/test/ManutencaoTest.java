/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rodri
 */
import com.mycompany.hotelmanagement.Manutencao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ManutencaoTest {

    @Test
    public void testAdicionarEListarManutencoes() {
        Manutencao manutencao = new Manutencao(1, 101, "Reparação elétrica", true, "Pedro Santos");
        Manutencao.adicionarManutencao(manutencao);

        List<Manutencao> manutencoes = Manutencao.listarManutencoes();
        assertEquals(1, manutencoes.size());
        assertEquals(manutencao, manutencoes.get(0));
    }

    @Test
    public void testRemoverManutencao() {
        Manutencao manutencao = new Manutencao(1, 101, "Reparação elétrica", true, "Pedro Santos");
        Manutencao.adicionarManutencao(manutencao);

        assertTrue(Manutencao.removerManutencao(101));
        assertFalse(Manutencao.removerManutencao(101));
    }
}