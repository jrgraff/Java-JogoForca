/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoforca;

import java.io.FileNotFoundException;

/**
 *
 * @author jackson
 */
public class testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Jogador jo = new Jogador("ajck");
        Jogo j = new Jogo(jo, "teste", 2);
        Ranking r = new Ranking();
        r.atualizaRanking(j);
    }
    
}
