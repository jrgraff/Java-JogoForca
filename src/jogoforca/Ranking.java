package jogoforca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ranking {
   
    public String getRanking(int classificacao)
    {
        try{
            FileReader arquivoR = new FileReader("src/jogoforca/ranking");
            BufferedReader fileR = new BufferedReader(arquivoR);
     
            ArrayList<String> ranking = new ArrayList<>();
            String linha;
            
            while((linha = fileR.readLine()) != null){
                if(linha.length() > 0){
                    ranking.add(linha);
                }
            }
            fileR.close();
            return(classificacao + ". " + ranking.get(classificacao - 1));
        } catch(Exception e){
            return("null");
        }
    }
    public void resetRanking() throws IOException
    {
        FileWriter arquivoW = new FileWriter("src/jogoforca/ranking");
        BufferedWriter fileW = new BufferedWriter(arquivoW);
            
        fileW.write("");
    }

    public void atualizaRanking(Jogo j) throws IOException{          
        FileWriter arquivoW = new FileWriter("src/jogoforca/ranking", true);
        BufferedWriter fileW = new BufferedWriter(arquivoW);
        
        Jogo jogo = j;
        String[] parts;
        ArrayList<String> ranking = new ArrayList<>();
        int aux, i;
        
        for(i = 1; i < 6; i++){
            ranking.add(getRanking(i));
        }
        
        i = 0;
        for(String s : ranking){
            if(ranking.get(i) != "null"){
                parts = ranking.get(i).split(": ");
                if(Integer.parseInt(parts[1]) < j.getPontuacao()){
                
                }
            } else{
                
                break;
            }
        }
        
        System.out.print(ranking);
    }
}
