import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class GerenciadorPartidaTest {
    @Test
    public void deveRetornarNomeJogador() {
        GerenciadorPartida.getInstance().setNomeJogador("Ash");
        assertEquals("Ash", GerenciadorPartida.getInstance().getNomeJogador());
    }
    @Test
    public void deveRetornarPontuacao() {
        GerenciadorPartida.getInstance().setPontuacao(350);
        assertEquals(350, GerenciadorPartida.getInstance().getPontuacao());
    }
    @Test
    public void deveRetornarNivel() {
        GerenciadorPartida.getInstance().setNivel(2);
        assertEquals(2, GerenciadorPartida.getInstance().getNivel());
    }
    @Test
    public void deveRetornarVidas() {
        GerenciadorPartida.getInstance().setVidas(3);
        assertEquals(3, GerenciadorPartida.getInstance().getVidas());
    }
}