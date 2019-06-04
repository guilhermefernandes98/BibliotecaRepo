import java.time.LocalDate;

public class Doacao
{
    Livro Livro_Doado;
    LocalDate Data_Doacao;
    Utilizador Utilizador_doador;

    public Doacao(Livro livro_Doado, LocalDate data_Doacao, Utilizador utilizador_doador) {
        Livro_Doado = livro_Doado;
        Data_Doacao = data_Doacao;
        Utilizador_doador = utilizador_doador;
    }

    public Livro getLivro_Doado() {
        return Livro_Doado;
    }

    public void setLivro_Doado(Livro livro_Doado) {
        Livro_Doado = livro_Doado;
    }

    public LocalDate getData_Doacao() {
        return Data_Doacao;
    }

    public void setData_Doacao(LocalDate data_Doacao) {
        Data_Doacao = data_Doacao;
    }

    public Utilizador getUtilizador_doador() {
        return Utilizador_doador;
    }

    public void setUtilizador_doador(Utilizador utilizador_doador) {
        Utilizador_doador = utilizador_doador;
    }

}
