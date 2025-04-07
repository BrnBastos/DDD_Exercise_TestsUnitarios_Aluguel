package org.example;

public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo() {
    }

    public Veiculo(String modelo, double valorDiaria) {
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public double calcularCusto(int dias) {
        if (dias > 0 && !(this.valorDiaria < (double)0.0F)) {
            double total = (double)dias * this.valorDiaria;
            return total - this.desconto(dias);
        } else {
            throw new IllegalArgumentException("Dias e valor da diária devem ser positivos.");
        }
    }

    public double desconto(int dias) {
        return dias >= 7 ? (double)dias * this.valorDiaria * 0.1 : (double)0.0F;
    }

    public double calcularMulta(int diasAtraso) {
        return diasAtraso <= 0 ? (double)0.0F : (double)diasAtraso * this.valorDiaria * (double)1.5F;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getValorDiaria() {
        return this.valorDiaria;
    }
}
