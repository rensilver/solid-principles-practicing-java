package srp_single_responsability_principle.solution;

public class OficinaFacade {

    private final CadastroFornecedores cadastroFornecedores = new CadastroFornecedores();
    private final RegistroClientes registroClientes = new RegistroClientes();
    private final Faturamento faturamento = new Faturamento();

    public void lucros() {
        faturamento.calcularGanhos();
    }

    public void salvarFornecedor() {
        cadastroFornecedores.cadastrarFornecedor();
    }

    public void atualizarCliente() {
        registroClientes.atualizarDadosCliente();
    }

}
