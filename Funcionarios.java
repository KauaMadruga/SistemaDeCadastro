package CadastroFuncionarios;
//CLASSE PAI
public abstract class Funcionarios {

    //PARÂMETROS
    protected String nome;
    protected double salario;
    protected String  dataDeAdmissao;

    //CONSTRUTORES
    public Funcionarios(String nome, double salario, String dataDeAdmissao) {
        this.nome = nome;
        this.salario = salario;
        this.dataDeAdmissao = dataDeAdmissao;
    }

    //MÉTODOS
    public abstract String turno();
    public abstract String atribuicoes();

    //ENCAPSULAMENTO


    public String getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(String dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
