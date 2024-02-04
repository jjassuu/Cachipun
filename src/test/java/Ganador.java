
import org.example.Juego;
import org.example.Resultado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ganador {
    @Test
    public void testDeterminarResultadoGanador() {
        int player = Juego.PIEDRA;
        int computer = Juego.PIEDRA;

        Resultado.determinarResultado(player, computer);

        assertEquals(0, Juego.getEmpates());
        assertEquals(1, Juego.getVictorias());
        assertEquals(0, Juego.getDerrotas());
    }
}
