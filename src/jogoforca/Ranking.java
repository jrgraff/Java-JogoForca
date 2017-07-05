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
            FileReader arquivo = new FileReader("src/jogoforca/ranking");
            BufferedReader fileIn = new BufferedReader(arquivo);
     
            ArrayList<String> ranking = new ArrayList<>();
            String linha;
            
            while((linha = fileIn.readLine()) != null){
                if(linha.length() > 0){
                    ranking.add(linha);
                }
            }
            fileIn.close();
            return(ranking.get(classificacao - 1));
        } catch(Exception e){
            return("null");
        }
    }
    public void resetRanking() throws IOException
    {
        FileWriter arquivo = new FileWriter("src/jogoforca/ranking");
        BufferedWriter fileIn = new BufferedWriter(arquivo);
            
        fileIn.write("");
        fileIn.close();
    }

    public void atualizaRanking(Jogo j) throws IOException{
        try{
            FileWriter arquivo = new FileWriter("src/jogoforca/ranking", true);
            BufferedWriter fileIn = new BufferedWriter(arquivo);

            ArrayList<String> ranking = new ArrayList<>();
            Jogo jogo = j;

            String[] parts;
            int i;

            for(i = 1; i < 6; i++){
                ranking.add(getRanking(i));
            }
            
            for(i = 0; i < 5; i++){
                if(!ranking.get(i).contains("null")){
                    parts = ranking.get(i).split(": ");
                    if(j.getPontuacao() > Integer.parseInt(parts[1])){
                        ranking.add(i, j.getJogador() + ": " + j.getPontuacao());
                        break;
                    }
                } else{
                    ranking.add(i, j.getJogador() + ": " + j.getPontuacao());
                    break;
                }
            }
            System.out.println(ranking);
            
            resetRanking();
            for(i = 0; i < 5; i++)
                fileIn.write(ranking.get(i) + "\n");
            fileIn.close();
        } catch(Exception e){
            System.out.print(e);
        }
    }
}
