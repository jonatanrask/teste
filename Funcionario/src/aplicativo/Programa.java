package aplicativo;

import entities.Empresa;
import entities.Funcionario;

import java.util.*;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Funcionario> funcionarios = new ArrayList<>();
        Empresa empresa = new Empresa();
        int i = 0;
        System.out.println("");
        while(true){
            System.out.println("digite o nome do funcionario: // Digite quit caso queira encerrar a entrada de funcionarios");
            String nome = sc.next();
            if(Objects.equals(nome, "quit")){
                break;
            }
            System.out.println("Digite o salario do funcionario");
            double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(nome, salario);
            empresa.addFuncionario(funcionario);
            System.out.println(funcionario.impostoPorcent(funcionario.getSalario()));
            System.out.println("Total a pagar de imposto: " + funcionario.impostoValor(funcionario.getSalario()));
        }
        System.out.println(empresa.porcentImposto());

    }
}
