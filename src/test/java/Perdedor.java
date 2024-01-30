import org.example.Juego;
import org.example.Resultado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Perdedor {
    @Test
    public void testDeterminarResultadoPerdedor() {
        int player = Juego.PIEDRA;
        int computer = Juego.PAPEL;

        Resultado.determinarResultado(player, computer);

        assertEquals(0, Juego.getTies());
        assertEquals(0, Juego.getWins());
        assertEquals(1, Juego.getLosses());
    }
}
