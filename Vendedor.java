package CadastroFuncionarios;

public class Vendedor extends Funcionarios {
    private Double metaDeVendas;
    public Vendedor(String nome, Double salario, String dataDeAdmissao) {
        super(nome, salario, dataDeAdmissao);
    }


    //CONSTRUTOR
    public Vendedor(String nome, double salario, Double MetaDeVendas, String dataDeAdmissao) {
        super(nome, salario, dataDeAdmissao);
        this.metaDeVendas = MetaDeVendas;
    }
    //GET E SET
    public Double getMetaDeVendas() {
        return metaDeVendas;
    }

    public void setMetaDeVendas(Double metaDeVendas) {
        metaDeVendas = metaDeVendas;
    }


    //MÉTODOS DA CLASSE PAI
    @Override
    public String turno() {
        return "\nTurno: Integral";
    }


    @Override
    public String atribuicoes() {
        return "\nAtribuições: Vender o máximo de produtos e bater suas metas de vendas\n";
    }

    //ToString
    @Override
    public String toString() {
        return "Vendedor" +
                "\nNome: " + nome + "\nMeta De Vendas: " + metaDeVendas + "\nSalário: " + salario + "\nData De Admissão: " + dataDeAdmissao + turno() + atribuicoes();

    }
}
