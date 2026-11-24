import java.time.LocalDate;

public class Cliente {
    private String codigo;
    private String nome;
    private String telefone;
    private String cpf;
    private boolean mensalista;
    private LocalDate dataVencimento;
    private double valorMensalidade;
    private boolean ativo;
    private Pagamento[] pagamentos = new Pagamento[10];

    public Cliente() {
    }

    public Cliente(String codigo, String nome, String telefone, String cpf,
                   boolean mensalista, LocalDate dataVencimento,
                   double valorMensalidade, boolean ativo) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.mensalista = mensalista;
        this.dataVencimento = dataVencimento;
        this.valorMensalidade = valorMensalidade;
        this.ativo = ativo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isMensalista() {
        return mensalista;
    }

    public void setMensalista(boolean mensalista) {
        this.mensalista = mensalista;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Pagamento[] getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(Pagamento[] pagamentos) {
        this.pagamentos = pagamentos;
    }

    public void adicionarPagamento(Pagamento pagamento) {
        for (int i = 0; i < pagamentos.length; i++) {
            if (pagamentos[i] == null) {
                pagamentos[i] = pagamento;
                return;
            }
        }

        System.out.println("Não há espaço para mais pagamentos.");
    }

    public void ativar() {
        ativo = true;
    }

    public void desativar() {
        ativo = false;
    }
}
