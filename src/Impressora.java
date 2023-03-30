import java.util.Stack;


public class Impressora {
  
  public Stack<Object> pilhaDeDocumento;

  public Impressora(){
    pilhaDeDocumento = new Stack<>();
  }

  public void adicionarPagina(Object object){
    pilhaDeDocumento.push(object);
  }

  public int quantidadePaginas(){
    return pilhaDeDocumento.size();
  }

  public String imprimirPaginas(){
    if(pilhaDeDocumento.isEmpty()){
      return "Trabalho está vazio";
    }
    return pilhaDeDocumento.pop().toString();
  }
}

