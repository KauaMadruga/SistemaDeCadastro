package CadastroFuncionarios;

public class OperadorDeCaixa extends Funcionarios {
    public OperadorDeCaixa(String nome, double salario, String dataDeAdmissao) {
        super(nome, salario, dataDeAdmissao);
    }

    @Override
    public String turno() {
        return "Turno: Integral";
    }

    @Override
    public String atribuicoes() {
        return "Atribuições: Realizar registro de compras feitas por clientes";
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
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", dataDeAdmissao='" + dataDeAdmissao + '\'' +
                '}';
    }
}
