import java.time.LocalDate;

public class NotificacaoEvento
{
    java.time.LocalDate data;
    Evento evento;
    Utilizador utilizador;
    boolean aceite_ou_nao;

    public NotificacaoEvento(LocalDate data, Evento evento, Utilizador utilizador, boolean aceite_ou_nao) {
        this.data = data;
        this.evento = evento;
        this.utilizador = utilizador;
        this.aceite_ou_nao = aceite_ou_nao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public boolean isAceite_ou_nao() {
        return aceite_ou_nao;
    }

    public void setAceite_ou_nao(boolean aceite_ou_nao) {
        this.aceite_ou_nao = aceite_ou_nao;
    }
}
