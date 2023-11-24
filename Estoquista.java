package CadastroFuncionarios;

public class Estoquista extends Funcionarios {
    private String tipoEstoque;

    public Estoquista(String nome, double salario, String tipoEstoque, String dataDeAdmissao) {
        super(nome, salario, dataDeAdmissao);
        this.tipoEstoque = tipoEstoque;
    }

    @Override
    public String turno() {
        System.out.println("Turno: Noite");
        return null;
    }


    @Override
    public String atribuicoes() {
        System.out.println("Organização de produtos em almoxarifado, por Marca, Nome e Data de Validade");
        return null;
    }

    @Override
    public String toString() {
        return "Estoquista {" +
                "Nome: '" + nome + '\'' +
                ", Tipo de Estoque: '" + tipoEstoque + '\'' +
                ", Salario: " + salario +
                '}';
    }
}