import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class AventureiroTest {
    @Test
    void deveCalcularDanoFisicoRealizado() {
        Aventureiro aventureiro = new Aventureiro();
        aventureiro.danoFinalAtaqueFisico(100.0f, 20.0f);
        assertEquals(30.0f, aventureiro.getDanoRealizado());
    }

    @Test
    void deveCalcularDanoMagicoRealizado() {
        Aventureiro aventureiro = new Aventureiro();
        aventureiro.danoFinalAtaqueMagico(100.0f, 20.0f);
        assertEquals(480.0f, aventureiro.getDanoRealizado());
    }

    @Test
    void deveCalcularDanoDistanciaRealizado() {
        Aventureiro aventureiro = new Aventureiro();
        aventureiro.danoFinalAtaqueDistancia(100.0f, 20.0f);
        assertEquals(280.0f, aventureiro.getDanoRealizado());
    }

    @Test
    void deveCalcularDanoRecebidoDefendendo() {
        Aventureiro aventureiro = new Aventureiro();
        aventureiro.danoRecebidoDefendendo(100.0f, 20.0f);
        assertEquals(60.0f, aventureiro.getDanoRecebido());
    }

    @Test
    void naoDeveCalcularDanoRecebidoDefendendoNegativo() {
        Aventureiro aventureiro = new Aventureiro();
        aventureiro.danoRecebidoDefendendo(100.0f, 2000.0f);
        assertEquals(0.0f, aventureiro.getDanoRecebido());
    }
}
