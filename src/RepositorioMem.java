import java.util.ArrayList;
import java.util.Iterator;

public class RepositorioMem
{

    ArrayList<TipoUtilizador> TipoUtilizador = new ArrayList<>();
    ArrayList<Utilizador> Utilizador = new ArrayList<Utilizador>();
    ArrayList<Requisicao> Requisicao = new ArrayList<Requisicao>();
    ArrayList<Copia> Copia = new ArrayList<Copia>();
    ArrayList<Notificacao> Notificacao = new ArrayList<Notificacao>();
    ArrayList<Livro> Livro = new ArrayList<Livro>();
    ArrayList<Devolucao> Devolucao = new ArrayList<Devolucao>();
    ArrayList<Coima> Coima = new ArrayList<Coima>();
    ArrayList<Emprestimo> Emprestimo = new ArrayList<Emprestimo>();
    ArrayList<RequisicaoCompra> RequisicaoCompra = new ArrayList<RequisicaoCompra>();
    ArrayList<Encomenda> Encomenda = new ArrayList<Encomenda>();
    ArrayList<EntradaNovoLivro> EntradaNovoLivro = new ArrayList<EntradaNovoLivro>();
    ArrayList<PropostaAquisicao> PropostaAquisicao = new ArrayList<PropostaAquisicao>();
    ArrayList<Evento> Evento = new ArrayList<Evento>();
    ArrayList<Funcionario> Funcionario = new ArrayList<Funcionario>();
    ArrayList<TipoFuncionario> TipoFuncionario = new ArrayList<TipoFuncionario>();

    public void adicionaFuncionario(Funcionario funcionario)
    {
        Funcionario.add(funcionario);
    }
    public void adicionaTipoFuncionario(TipoFuncionario tipo)
    {
        TipoFuncionario.add(tipo);
    }
    public void adicionaUtilizador(Utilizador utilizador)
    {
        Utilizador.add(utilizador);
    }
    public void adicionaTipoUtilizador(TipoUtilizador tipo)
    {
        TipoUtilizador.add(tipo);
    }
    public void adicionaRequisicao(Requisicao requisicao)
    {
        Requisicao.add(requisicao);
    }
    public void adicionaCopia(Copia copia)
    {
        Copia.add(copia);
    }
    public void adicionaLivro(Livro livro)
    {
        Livro.add(livro);
    }
    public void adicionaEmprestimo(Emprestimo emprestimo)
    {
        Emprestimo.add(emprestimo);
    }
    public void adicionaNotificacao(Notificacao notificacao)
    {
        Notificacao.add(notificacao);
    }
    public void adicionaDevolucao(Devolucao devolucao)
    {
        Devolucao.add(devolucao);
    }
    public void adicionaCoima(Coima coima)
    {
        Coima.add(coima);
    }
    public void adicionaEvento(Evento evento) { Evento.add(evento);}
    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r)
    {
        Iterator var2 = this.Emprestimo.iterator();

        Emprestimo e;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            e = (Emprestimo)var2.next();
        } while(!e.getRequisicao().equals(r));

        return e;
    }
    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra){
        RequisicaoCompra.add(requisicaoCompra);
    }

    public void adicionaEncomenda(Encomenda encomenda){
        Encomenda.add(encomenda);
    }

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro){
        EntradaNovoLivro.add(entradaNovoLivro);
    }

    public void adicionaPropostaRequisicao(PropostaAquisicao propostaAquisicao){
        PropostaAquisicao.add(propostaAquisicao);
    }
}
