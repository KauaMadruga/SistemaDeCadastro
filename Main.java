package CadastroFuncionarios;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //POLIMORFISMO

        Funcionarios op = new OperadorDeCaixa("Damião da Costa", 1300.00, "03/05/2021");
        Funcionarios sg = new ServicosGerais("Roberto Diaz", 1500.00, "Primeiro Andar", "05/02/2019");

        Funcionarios g = new Gerente("José Joaquim", 1700.00, "Marketing", "27/06/2020");

        Funcionarios v = new Vendedor("Jorge Joaquim", 1700.00, 2500.0,"20/05/2006");
        Funcionarios v1 = new Vendedor("João Joaquim", 1700.00, 2000.0,"14/03/2023");

        Funcionarios r = new Repositor("Pedro Simão", 1700.00, "Frios", "10/10/2010");
        Funcionarios e = new Estoquista("José Acássio", 2300.00, "Físico", "20/02/2019");

        Funcionarios g1 =  new Gerente (sc.next(),sc.nextDouble(),sc.next(),sc.next());

         Funcionarios v2 =  new Vendedor(sc.next(),sc.nextDouble(),sc.nextDouble(),sc.next());




        System.out.println("======================================GERENTE==================================================================");

        System.out.println(g); //quando se chama apenas pelo objeto "g" é trazido por padrão o método ToString

        System.out.println(g1);

        System.out.println("=======================================VENDEDORES===============================================================");

        System.out.println(v+"\n"+v1+"\n");

        System.out.println(v2);

        System.out.println("=======================================OPERADOR DE CAIXA===============================================================");
        System.out.println(op);
        System.out.println(op.turno());
        System.out.println(op.atribuicoes());



        System.out.println("=======================================SERVIÇOS GERAIS===============================================================");

        System.out.println(sg);
        sg.turno();
        sg.atribuicoes();


        System.out.println("============================================REPOSITOR==========================================================");

        System.out.println(r);
        r.turno();
        r.atribuicoes();

        System.out.println("============================================ESTOQUISTA=========================================================");

        System.out.println(e);
        e.turno();
        e.atribuicoes();





    }
}
