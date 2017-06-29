package jogoforca;

public class Jogo {
    private String jogador;
    private String palavra;
    private String categoria;
    private String dica;
    private String palavraOculta;
    private int nivel;
    private int vida = 9;
    
    public Jogo(String jogador, String categoria, int nivel)
    {
        Palavras p = new Palavras();
        String[] parts = p.sortearPalavra(categoria).split(":");
        
        this.jogador = jogador;
        this.palavra = parts[0];
        this.dica = parts[1] + "(" + categoria + ")";
        this.vida -= nivel;
        this.nivel = nivel;
    }
    
    public String getPalavraOculta() {
        return palavraOculta;
    }
    
    public void setPalavraOculta(String palavraOculta) {
        this.palavraOculta = palavraOculta;
    }
    
    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public String getPalavra() {
        return palavra;
    }
    
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
