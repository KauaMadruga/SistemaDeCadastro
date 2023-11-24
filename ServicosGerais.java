package CadastroFuncionarios;

public class ServicosGerais extends Funcionarios {

    private String secao;

    public ServicosGerais(String nome, double salario, String secao, String dataDeAdmissao) {
        super(nome, salario, dataDeAdmissao);
        this.secao = secao;
    }

    @Override
    public String turno() {
        System.out.println( "Turno: Integral");
        return null;
    }

    @Override
    public String atribuicoes() {
        System.out.println("Execultar a limpesa, manutenção e reparos necessários");
        return null;
    }

    @Override
    public String getDataDeAdmissao() {
        return super.getDataDeAdmissao();
    }

    @Override
    public void setDataDeAdmissao(String dataDeAdmissao) {
        super.setDataDeAdmissao(dataDeAdmissao);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    @Override
    public String toString() {
        return "ServicosGerais {nome='" + nome + '\'' +
                ", salario=" + salario +
                ", secao='" + secao + '\'' +
                ", data de admissao='" + dataDeAdmissao + '\'' +
                '}';
    }
}