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

        assertEquals(1, Juego.getTies());
        assertEquals(0, Juego.getWins());
        assertEquals(0, Juego.getLosses());
    }
}
