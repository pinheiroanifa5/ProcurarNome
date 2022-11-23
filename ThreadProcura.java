public class ThreadProcura {

public static void main(String[] args){

    String procurar = "Helena Gomes";
		System.out.println("Procurando : "+procurar+"\n");

        PesquisarDocente busca1 = new PesquisarDocente("docentes19-20.txt", procurar);
		PesquisarDocente busca2 = new PesquisarDocente("docentes20-21.txt", procurar);
	    PesquisarDocente busca3 = new PesquisarDocente("docentes21-22.txt", procurar);


        Thread t1 = new Thread(busca1);
		Thread t2 = new Thread(busca2);
		Thread t3 = new Thread(busca3);

        t1.start();
		t2.start();
		t3.start();
}
        
    }
    

