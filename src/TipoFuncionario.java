public class TipoFuncionario
{
    String descricao;
    int salario;

    public TipoFuncionario(String descricao, int salario) {
        this.descricao = descricao;
        this.salario = salario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
