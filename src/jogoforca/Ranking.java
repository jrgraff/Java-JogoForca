package jogoforca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Ranking {
    public String GetRanking(int classificacao)
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
            return(classificacao + ". " + ranking.get(classificacao - 1));
        }
        catch(Exception e){
            return("" + classificacao + ". ");
        }
    }
    public void ResetRanking()
    {
        try{          
            FileWriter arquivo = new FileWriter("src/jogoforca/ranking");
            BufferedWriter fileIn = new BufferedWriter(arquivo);
            
            fileIn.write("");
            fileIn.close();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
