import java.time.LocalDate;

public class PedidoInscricaoEvento
{
    LocalDate data;
    Utilizador utilizador;
    Evento evento;

    public PedidoInscricaoEvento(LocalDate data, Utilizador utilizador, Evento evento) {
        this.data = data;
        this.utilizador = utilizador;
        this.evento = evento;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
