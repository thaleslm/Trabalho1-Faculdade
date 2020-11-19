    public class Serie implements Video {
    int duracao ;
    String idiomaAudio;
    String idiomaLegenda;
    boolean estaPausado;
    String nome;
    int temporadas;
    int episodiosPorTemporada;
    int index;
    String print;
  
      public Serie(String nome, int temporadas, int episodiosPorTemporada) {
          this.nome = nome;
          this.temporadas = temporadas;
          this.episodiosPorTemporada = episodiosPorTemporada;
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
     this.print = System.out.printf("< %s > <%d>. temporadas: %d", this.nome, this.episodiosPorTemporada, this.temporadas);
    }
  
  }