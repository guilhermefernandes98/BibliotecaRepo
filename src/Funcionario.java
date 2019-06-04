import java.time.LocalDate;

public class Funcionario
{
    String nome;
    LocalDate data_nascimento;
    int nif;
    TipoFuncionario tipo;

    public Funcionario(String nome, LocalDate data_nascimento, int nif, TipoFuncionario tipo) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.nif = nif;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public void setTipo(TipoFuncionario tipo) {
        this.tipo = tipo;
    }
}
