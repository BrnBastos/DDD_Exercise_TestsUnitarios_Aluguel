# DDD_Exercise_TestsUnitarios_Aluguel

🚗 Projeto de Aluguel de Veículos
Este projeto simula o processo de aluguel de veículos em uma locadora, utilizando Java e testes unitários com JUnit.

📋 Funcionalidades
O usuário escolhe um modelo de carro a partir de uma lista.

Informa a quantidade de dias que deseja alugar.

O sistema calcula o custo total com base no valor da diária.

Desconto automático de 10% para aluguéis de 7 dias ou mais.

Cálculo de multa em caso de devolução com atraso (1.5x o valor da diária por dia).

Mensagens informativas com o custo total, desconto aplicado e valor de multa (se houver).

🔧 Tecnologias Utilizadas
Java 17+

JUnit 5 (para testes unitários)

IDE: IntelliJ IDEA

🧪 Testes Implementados
A classe VeiculoTest.java cobre os seguintes cenários:

Cálculo do custo com e sem desconto.

Verificação do valor do desconto aplicado.

Cálculo de multa por atraso.

Casos inválidos: dias igual a 0, valor de diária negativo.

📦 Como Rodar o Projeto
Clone ou baixe o repositório.

Abra no IntelliJ.

Execute a classe Main.java para simular um aluguel.

Execute VeiculoTest.java para rodar os testes JUnit.
