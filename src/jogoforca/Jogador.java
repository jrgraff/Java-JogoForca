package jogoforca;

public class Jogador {

    String nome;
    int pontuacao;
    
    public Jogador(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
}
