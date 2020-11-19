import java.io.PrintStream;


public class Filme implements Video {
    int duracao ;
    String idiomaAudio = "Português (Brasil)" ;
    String idiomaLegenda = "Português (Brasil)";
    boolean estaPausado;
    String nome;
    int anoLancamento;
    int index;
	String printf;
  
      public Filme(String nome, int duracao, int anoLancamento) {
      this.nome = nome;
      this.duracao= duracao;
      this.anoLancamento = anoLancamento;
      
      }
    @Override
    public void executar(){
      index += 1;
      if(index ==0){
        System.out.println("%s"+this.nome);
      }else{
        System.out.println(" O vide esta executando");
        this.estaPausado = false;
      }  
      
    }
      
    @Override
    public void pausar(){
     estaPausado = true;
     System.out.println("o video foi pausado");  
    }
    @Override
    public void mudarAudio(){
      if(this.idiomaAudio == "Português (Brasil)" ){
          this.idiomaAudio = "Inglês (Original)";
      }else{
          this.idiomaAudio = "Português (Brasil)";
      } 
      
    }
  
    @Override
    public void mudarLegenda(){
      if(this.idiomaLegenda == "Português (Brasil)" ){
          this.idiomaLegenda = "Sem legenda";
      }else{
          this.idiomaLegenda = "Português (Brasil)";
      } 
      
    }
    @Override
    public String exibirDetalhes(){
     
        printf = System.out.printf("< %s > <%d>. Duração: %d", this.nome, this.anoLancamento, this.duracao);
        return printf;
    }
}