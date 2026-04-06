public class GerenciadorPartida {

    private GerenciadorPartida() {};
    private static GerenciadorPartida instance = new GerenciadorPartida();
    public static GerenciadorPartida getInstance() {
        return instance;
    }

    private String nomeJogador;
    private int pontuacao;
    private int nivel;
    private int vidas;

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getVidas() {
        return vidas;
    }
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}