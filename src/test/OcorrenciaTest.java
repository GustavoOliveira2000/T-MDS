import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OcorrenciaTest {

    @Test
    public void testOcorrenciaCreation() {
        Ocorrencia ocorrencia = new Ocorrencia(1, "Problema no quarto", new java.util.Date(), null);
        
        assertEquals(1, ocorrencia.getId());
        assertEquals("Problema no quarto", ocorrencia.getDescricao());
        assertNotNull(ocorrencia.getDataOcorrencia());
    }
}
