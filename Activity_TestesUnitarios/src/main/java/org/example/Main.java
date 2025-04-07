package org.example;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] modelos = new String[]{"Opala", "Mustang", "Ferrari", "BMW x1", "Fusca", "Parati"};
        double[] valorDiaria = new double[]{(double)200.0F, (double)355.5F, (double)444.0F, (double)355.0F, (double)122.0F, (double)55.5F};
        System.out.println("Modelos disponíveis:");

        for(int i = 0; i < modelos.length; ++i) {
            System.out.println(i + 1 + " - " + modelos[i] + " (R$ " + valorDiaria[i] + " por dia)");
        }

        System.out.print("Digite o número equivalente ao modelo do carro: ");

        int modeloCarroOption;
        for(modeloCarroOption = scanner.nextInt() - 1; modeloCarroOption < 0 || modeloCarroOption >= modelos.length; modeloCarroOption = scanner.nextInt() - 1) {
            System.out.print("Opção inválida. Digite novamente: ");
        }

        System.out.print("Digite a quantidade de dias para o aluguel: ");
        int qtdDias = scanner.nextInt();
        Veiculo veiculo = new Veiculo();
        veiculo.setModelo(modelos[modeloCarroOption]);
        veiculo.setValorDiaria(valorDiaria[modeloCarroOption]);

        try {
            double custoAluguel = veiculo.calcularCusto(qtdDias);
            double valorDesconto = veiculo.desconto(qtdDias);
            System.out.printf("O custo do aluguel do %s por %d dias é: R$ %.2f%n", veiculo.getModelo(), qtdDias, custoAluguel);
            if (valorDesconto > (double)0.0F) {
                System.out.printf("Desconto aplicado: R$ %.2f%n", valorDesconto);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.print("Se houver atraso na devolução, digite o número de dias de atraso (ou 0): ");
        int diasAtraso = scanner.nextInt();
        double multa = veiculo.calcularMulta(diasAtraso);
        if (multa > (double)0.0F) {
            System.out.printf("Multa por %d dias de atraso: R$ %.2f%n", diasAtraso, multa);
        } else {
            System.out.println("Nenhuma multa aplicada.");
        }

        scanner.close();
    }
}
