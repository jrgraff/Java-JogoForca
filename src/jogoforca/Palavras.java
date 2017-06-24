package jogoforca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

public class Palavras {
    public String SortearPalavra(String categoria)
    {
        String palavra = "";
        try{
            Random rand = new Random();
            
            FileReader arquivo = new FileReader("src/jogoforca/dicionario/" + categoria);
            BufferedReader fileIn = new BufferedReader(arquivo);
            
            ArrayList<String> palavras = new ArrayList<>();
            String linha;
            
            while((linha = fileIn.readLine()) != null){
                if(linha.length() > 0){
                    palavras.add(linha);
                }
            }
            palavra = palavras.get(rand.nextInt(palavras.size()));
            fileIn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return palavra;
    }
    public void AdicionarPalavra(String categoria, String palavra, String dica)
    {
        try{          
            FileWriter arquivo = new FileWriter("src/jogoforca/dicionario/" + categoria, true);
            BufferedWriter fileIn = new BufferedWriter(arquivo);
            
            fileIn.write(palavra + " ");
            fileIn.write(dica);
            fileIn.newLine();
            
            fileIn.close();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
