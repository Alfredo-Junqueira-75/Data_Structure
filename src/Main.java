
public class Main {

  public static void main(String[] args) throws InterruptedException {
    Impressora impressora = new Impressora();
    

    impressora.adicionarPagina( new Documento("Capa"));
    Thread.sleep(800);
    impressora.adicionarPagina( new Documento("ContraCapa"));
    Thread.sleep(800);
    impressora.adicionarPagina( new Documento("Indice"));
    Thread.sleep(800);
    impressora.adicionarPagina( new Documento("Introduçao"));
    Thread.sleep(800);
    impressora.adicionarPagina( new Documento("Desenvolvimento"));
    Thread.sleep(800);
    impressora.adicionarPagina( new Documento("Conclusão"));

    for(int i= impressora.quantidadePaginas(); i > 0; i--){
      System.out.println(impressora.imprimirPaginas());
      System.out.println("Número da página: "+ i);
      Thread.sleep(600);
    }
      
    
  }
}