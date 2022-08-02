package entities;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public void removeFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }
    public String porcentImposto(){
        String qntPorcent = "";
        int qntZero = 0;
        int qntDez = 0;
        int qntQuinze = 0;
        double maiorImposto = 0;
        String funcionarioMaiorImposto = "";
        double totalImposto = 0;
        for(Funcionario f : funcionarios){
            totalImposto += f.impostoValor(f.getSalario());
            if (f.getSalario() >= 0 && f.getSalario() <= 2499.99){
                qntZero += 1;
            } else if (f.getSalario() >= 2500 && f.getSalario() <= 4999.99){
                qntDez += 1;
            } else if (f.getSalario() > 4999.99){
                qntQuinze += 1;
            }
            if(f.getSalario() > maiorImposto){
                maiorImposto = f.getSalario();
                funcionarioMaiorImposto = f.getName();
            }
        }
        int qntTotal = qntZero + qntDez + qntQuinze;
        double perZero = qntZero * 100 / qntTotal;
        double perDez = qntDez * 100 / qntTotal;
        double perQuinze = qntQuinze * 100 / qntTotal;
        qntPorcent = "Quantidade de funcionarios isentos: " + qntZero + " que corresponde a " + perZero + "% dos funcionarios totais\n" +
                "Quantidade de funcionarios que pagam 10%: " + qntDez + " que corresponde a " + perDez + "% dos funcionarios totais\n" +
                "Quantidade de funcionarios que pagam 15%: " + qntDez + " que corresponde a " + perQuinze + "% dos funcionarios totais\n\n" +
                "Total imposto a pagar: " + totalImposto + "\n\n" +
                "Qual funcionario deve ser pago maior imposto: " + funcionarioMaiorImposto;
        return qntPorcent;
    }

}

