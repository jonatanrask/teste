package entities;

public class Funcionario {
    private String name;
    private Double salario;

    public Funcionario(String name, Double salario) {
        this.name = name;
        this.salario = salario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double impostoValor(double salario){
        double salarioImposto = 0;
        if(salario >= 2500 && salario <= 4999.99){
            salarioImposto = salario * 0.1;
        } else if (salario > 4999.99) {
            salarioImposto = salario * 0.15;
        }
        return salarioImposto;
    }
    public String impostoPorcent(double salario){
        String imposto = "faixa 1, isento de imposto";
        if(salario >= 2500 && salario <= 4999.99){
            imposto = "faixa 2, 10% de imposto";
        } else if (salario > 4999.99) {
            imposto = "faixa 3, 15% de imposto";
        }
        return imposto;
    }

}
