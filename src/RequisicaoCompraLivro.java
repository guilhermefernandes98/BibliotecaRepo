import java.time.LocalDate;

public class RequisicaoCompraLivro extends RequisicaoCompra {
    PropostaAquisicao propostaAquisicao;

    public RequisicaoCompraLivro(String estado, LocalDate data, String oficio, PropostaAquisicao propostaAquisicao, Livro livro, Utilizador utilizador) {
        super(estado, data, oficio);
        this.propostaAquisicao = propostaAquisicao;
        this.livro = livro;
        this.utilizador = utilizador;
    }

    public PropostaAquisicao getPropostaAquisicao() {
        return propostaAquisicao;
    }
}
