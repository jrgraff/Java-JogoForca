/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoforca;

import java.util.Arrays;

/**
 *
 * @author jacks
 */
public class Main {
    public static void main(String args[]){
        Palavras p = new Palavras();
        Jogo jogo = new Jogo("Jack", "TESTE", 1);
        
        //p.atualizaPalavraOculta(jogo, 'a');
        System.out.println(Arrays.toString("Jack".toCharArray()));
    }
}
