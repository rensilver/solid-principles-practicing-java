package srp_single_responsability_principle.solution;

public class OficinaFacade {

    private CadastroFornecedores cadastroFornecedores;
    private RegistroClientes registroClientes;
    private Faturamento faturamento;

    public OficinaFacade(CadastroFornecedores cadastroFornecedores,
                         RegistroClientes registroClientes,
                         Faturamento faturamento) {
        this.cadastroFornecedores = cadastroFornecedores;
        this.registroClientes = registroClientes;
        this.faturamento = faturamento;
    }

    public Double lucros() {
        return faturamento.calcularGanhos();
    }

    public void salvarFornecedor() {
        cadastroFornecedores.cadastrarFornecedor();
    }

    public void atualizarCliente() {
        registroClientes.atualizarDadosCliente();
    }

}
