package CadastroFuncionarios;

public class Gerente extends Funcionarios {
    private String departamento;

    //CONSTRUTOR


    public Gerente(String nome, double salario, String departamento, String dataDeAdmissao) {
        super(nome, salario, dataDeAdmissao);
        this.departamento = departamento;
    }



    //GET E SET
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        departamento = departamento;
    }

    //MÉTODOS DA CLASSE PAI
    @Override
    public String turno() {

        return "\nManhã e Tarde";
    }


    @Override
    public String atribuicoes() {

        return "\nAtribuições: Gerenciar a sua equipe e auxiliar em quaisquer problemas que eles tenham.\n";
    }

    //ToString
    @Override
    public String toString() {
        return "Gerente" +
                "\nNome: " + nome + "\nDepartamento: " + departamento + "\nSalário: " + salario + "\nData De Admissão: " + dataDeAdmissao + turno() + atribuicoes();

    }
}
