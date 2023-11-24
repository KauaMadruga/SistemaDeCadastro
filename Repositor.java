package CadastroFuncionarios;

import java.time.LocalDate;

public class Repositor extends Funcionarios {

    private String secao;

    //CONSTRUTORES
    public Repositor(String nome, double salario, String secao, String dataDeAdmissao) {
        super(nome, salario, dataDeAdmissao);
        this.secao = secao;

    }

    //MÉTODOS OVERRIDE - CLASSE PAI
    @Override
    public String turno() {
        System.out.println("Turno: Manhã");
        return null;
    }

    @Override
    public String atribuicoes() {
        System.out.println("Atribuições: Repõe mercadorias de acordo com as necessidades de cada seção e quantidade em estoque.");
        return null;
    }


    //MÉTODO ToString
    @Override
    public String toString() {
        return "Repositor {" +
                "nome: '" + nome + '\'' +
                ", secao: '" + secao + '\'' +
                ", salario: " + salario +
                '}';
    }
}
