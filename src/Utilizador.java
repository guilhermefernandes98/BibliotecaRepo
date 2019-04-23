public class Utilizador
{
    String nome;
    String estado;
    TipoUtilizador tipoutilizador;

    public Utilizador(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }


    public String getEstado() {
        return estado;
    }

    public TipoUtilizador getTipoUtilizador() {
        return tipoutilizador;
    }

}
