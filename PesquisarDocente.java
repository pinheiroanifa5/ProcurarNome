
//Trabalho solicitado
//Anifa Pinheiro nº5062

import java.io.FileReader;   //ler caractere de arquivos
import java.io.FileNotFoundException;   //abrir arquivo
import java.util.Scanner;      //entrada de variaveis

   
 public class PesquisarDocente implements Runnable {
    private String nomeArquivo;
	private String nomeDocente;
    
    public PesquisarDocente (String nomeArquivo, String nomeDocente) {
		
		this.nomeArquivo = nomeArquivo;
		this.nomeDocente = nomeDocente;
	}

    @Override
	public void run() {
		try {
			Scanner caminho = new Scanner( new FileReader( "C:/Users/anifa/Desktop/Procurar Docente"));//nomeArquivo));
			//nomeArquivo="C:/Users/anifa/Desktop/Procurar Docente";
			int numerolinha= 1;
            while(caminho.hasNext()) {   //verifica elemtento na lista e retorna true ou false
				String lista = caminho.nextLine();
				if(lista.contains(nomeDocente)) { //verifica se existe ou nao o nome na lista
                    System.out.println(nomeDocente + " foi encontrado no Arquivo: "+this.nomeArquivo+" na linha: "+numerolinha+" : "+lista);
				}
				numerolinha++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

}
 }
