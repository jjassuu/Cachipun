import org.example.Juego;
import org.example.Resultado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Empate {
    @Test
    public void testDeterminarResultadoEmpate() {
        int player = Juego.PIEDRA;
        int computer = Juego.PIEDRA;

        Resultado.determinarResultado(player, computer);

        assertEquals(1, Juego.getEmpates());
        assertEquals(0, Juego.getVictorias());
        assertEquals(0, Juego.getDerrotas());
    }
}
