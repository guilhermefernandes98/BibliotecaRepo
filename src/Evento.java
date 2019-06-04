import java.time.LocalDate;

public class Evento
{
    LocalDate data;
    Funcionario responsavel;
    TipoEvento tipo;

    public Evento(LocalDate data, Funcionario responsavel, TipoEvento tipo) {
        this.data = data;
        this.responsavel = responsavel;
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }
}
