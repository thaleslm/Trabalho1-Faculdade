
public class App {
    public static void main(String[] args) throws Exception {
        Filme filme1 = new Filme();
        filme1.nome= "VIngadores";
        filme1.duracao = 244;
        filme1.anoLancamento = 2019;
    
    Filme filme2 = new Filme();
    filme2.nome= "Dumbo";
    filme2.duracao = 155;
    filme2.anoLancamento = 2020;

    filme1.executar();
    filme1.pausar();
    filme1.exibirDetalhes();
    filme1.mudarAudio();
    filme1.mudarLegenda();

//////////////////////////////////////////////////////

    Serie Serie1 = new Serie();
    Serie1.nome= "Breaking Bad";
    Serie1.temporadas = 5;
    Serie1.episodiosPorTemporada = 16;

    Serie Serie2 = new Serie();
    Serie2.nome= "Vinkings";
    Serie2.temporadas = 6;
    Serie2.episodiosPorTemporada = 18;
    
    Serie2.executar();
    Serie2.pausar();
    Serie2.exibirDetalhes();
    Serie2.mudarAudio();
    Serie2.mudarLegenda();





}
