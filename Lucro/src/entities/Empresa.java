package entities;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Financeiro> despesas = new ArrayList<>();
    private List<Financeiro> receitas = new ArrayList<>();

    public List<Financeiro> getDespesas() {
        return despesas;
    }
    public void addDespesa(Financeiro despesa){
        despesas.add(despesa);
    }
    public List<Financeiro> getReceitas() {
        return receitas;
    }

    public void addReceita(Financeiro receita){
        receitas.add(receita);
    }
    public String toString(){
        double maiorDespesa = 0;
        String fornecedorMaiorDespesa = "";
        double menorDespesa = 1000000000;
        String fornecedorMenorDespesa = "";
        double totalDespesas = 0;
        int qntDespesas = 0;
        for (Financeiro d : despesas){
            totalDespesas += d.getEntrada();
            qntDespesas += 1;
            if (d.getEntrada() > maiorDespesa){
                maiorDespesa = d.getEntrada();
                fornecedorMaiorDespesa = d.getName();
            }
            if(d.getEntrada() < menorDespesa){
                menorDespesa = d.getEntrada();
                fornecedorMenorDespesa = d.getName();
            }
        }
        double mediaDespesa = totalDespesas / qntDespesas;

        double maiorReceita = 0;
        String clienteMaiorReceita = "";
        double menorReceita = 1000000000;
        String clienteMenorReceita = "";
        double totalReceita = 0;
        int qntReceita = 0;
        for (Financeiro r : receitas){
            totalReceita += r.getEntrada();
            qntReceita += 1;
            if (r.getEntrada() > maiorReceita){
                maiorReceita = r.getEntrada();
                clienteMaiorReceita = r.getName();
            }
            if(r.getEntrada() < menorReceita){
                menorReceita = r.getEntrada();
                clienteMenorReceita = r.getName();
            }
        }
        double mediaReceita = totalReceita / qntReceita;

        double lucroOuPrejuizo = totalReceita - totalDespesas;
        String financeiroFinal;
        if(lucroOuPrejuizo > 0){
            financeiroFinal = "Lucro";
        }else{
            financeiroFinal = "Prejuizo";
        }
        return "O fornecedor de maior despesa é o " + fornecedorMaiorDespesa +
                "\nO fornecedor de menor despesa é o" + fornecedorMenorDespesa +
                "\n\n" +
                "O cliente de maior receita é o " + clienteMaiorReceita +
                "\nO cliente de menor receita é o " + clienteMenorReceita +
                "\n\n" +
                "A despesa media é: " + mediaDespesa + "\nA receita media é: " + mediaReceita +
                "\n\n" +
                "A empresa deu " + financeiroFinal;


    }
}
