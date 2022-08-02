package application;

import entities.Empresa;
import entities.Financeiro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/HH/yyyy");

        Empresa empresa = new Empresa();

        while (true){
            System.out.print("Qual o tipo da entrada: D ou F? ");
            String tipoEntrada = sc.nextLine();
            if (tipoEntrada.equals("")){
                break;
            }
            System.out.print("Digite o nome: ");
            String nome = sc.next();
            System.out.print("Digite a data: ");
            String stringData = sc.next();
            Date data = sdf.parse(stringData);
            System.out.print("Digite o valor: ");
            double valor = sc.nextDouble();
            sc.nextLine();

            if(Objects.equals(tipoEntrada, "D")){
                empresa.addDespesa(new Financeiro(valor, nome, data));
            }
            if(Objects.equals(tipoEntrada, "R")){
                empresa.addReceita(new Financeiro(valor, nome, data));
            }
        }
        System.out.println(empresa);
        sc.close();



    }
}
