package jogoforca;

public class Jogo {
    private String jogador;
    private String palavra;
    private String categoria;
    private String dica;
    private int nivel;
    
    public Jogo(String jogador, String palavra, String categoria, int nivel)
    {
        Palavras p = new Palavras();
        String[] parts = p.sortearPalavra(categoria).split(":");
        
        this.jogador = jogador;
        this.palavra = parts[0];
        this.dica = parts[1] + "(" + categoria + ")";
        this.nivel = nivel;
    }
    
    public void newGame()
    {
        InterfaceJogo iJogo = new InterfaceJogo();
        
    }
    
}
