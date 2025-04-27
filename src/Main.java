import models.Elemento;
import models.Fila;
import models.Pilha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha historico = new Pilha();
        Fila filaAtendimento = new Fila();

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n1 - Adicionar solicitação ao histórico");
            System.out.println("2 - Remover solicitação do histórico");
            System.out.println("3 - Mostrar histórico de solicitações");
            System.out.println("4 - Adicionar cliente à fila de atendimento");
            System.out.println("5 - Atender próximo cliente");
            System.out.println("6 - Mostrar fila de atendimento");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Opção inválida.");
                opcao = -1;
            }
            switch (opcao) {
                case 1:
                    System.out.print("ID da Solicitação: ");
                    String idSolicitacao = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Data e Hora: ");
                    String dataHora = scanner.nextLine();
                    Elemento novaSolicitacao = new Elemento(idSolicitacao, descricao, dataHora, null, null);
                    historico.push(novaSolicitacao);
                    System.out.println("Solicitação adicionada ao histórico.");
                    break;
                case 2:
                    try {
                        Elemento removido = historico.pop();
                        System.out.println("Solicitação removida: " + removido.id);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    historico.mostrarHistorico();
                    break;
                case 4:
                    System.out.print("Nome do Cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("ID do Cliente: ");
                    String idCliente = scanner.nextLine();
                    System.out.print("Motivo do Atendimento: ");
                    String motivo = scanner.nextLine();
                    Elemento novoCliente = new Elemento(idCliente, null, null, nomeCliente, motivo);
                    filaAtendimento.enfileirar(novoCliente);
                    System.out.println("Cliente adicionado à fila.");
                    break;
                case 5:
                    try {
                        Elemento atendido = filaAtendimento.desenfileirar();
                        System.out.println("Atendendo: " + atendido.nomeCliente);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    filaAtendimento.mostrarFila();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}