package visão;

import model.LocadoraVeiculos;

import java.util.Scanner;

    public class TesteLocadora {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            LocadoraVeiculos l1 = new LocadoraVeiculos();

            System.out.println("Digite seu nome: ");
            l1.setNome(ler.nextLine());
            System.out.println("Digite sua idade: ");
            l1.setIdade(ler.nextInt());
            if (l1.getIdade() <= 17){
                System.out.println("Você não pode alugar o veículo");
                System.exit(0);
            } else {

                ler.nextLine();
                System.out.println("Digite seu cpf: ");
                l1.setCpf(ler.nextLine());
                System.out.println("Digite seu Número de telefone: ");
                l1.setTelefone(ler.nextLine());

                System.out.println("Você possui um cartão de crédito com limite maior que R$ 500,00? ");
                l1.setCartaoDeCredito(ler.nextLine());
                if (l1.getCartaoDeCredito().equalsIgnoreCase("não")) {
                    System.out.println("Você não é apropriado para alugar o veículo");
                    System.exit(0);
                } else {

                    System.out.println("Selecione o veículo: " +
                            "\n1 - Renault Kwid" +
                            "\n2 - Fiat Mobi" +
                            "\n3 - Hyundai HB20" +
                            "\n4 - Fiat Grand Siena");
                    l1.setVeiculo(ler.nextInt());

                    System.out.println("Selecione o local para retirar o veiculo:" +
                            "\n1 - Canoas" +
                            "\n2 - Gramado" +
                            "\n3 - Porto Alegre" +
                            "\n4 - Novo Hamburgo ");
                    l1.setLocal(ler.nextInt());

                    do {
                        System.out.println("Digite quantas diárias você quer: ");
                        l1.setDiaria(ler.nextInt());
                        if (l1.getDiaria() < 1 || l1.getDiaria() > 30) {
                            System.out.println("Opção inválida, você pode alugar o carro por apenas 30 dias");
                            System.exit(0);
                        }
                    } while (l1.getDiaria() < 1 && l1.getDiaria() > 30);

                    System.out.println("Selecione um acessório: " +
                            "\n1 - Sem Acessório" +
                            "\n2 - Proteção a pneus e vidros" +
                            "\n3 - Assento com elevação" +
                            "\n4 - Cadeira de Bebê");
                    l1.setAcessorio(ler.nextInt());

                    System.out.println(l1);
                }
            }
        }





    }

