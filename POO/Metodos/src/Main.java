import Models.Aluno;
import Models.Turma;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        ArrayList<Turma> turmas = new ArrayList<Turma>();

        while (opcao != 5) {
            System.out.print("\n");
            System.out.println("==================" +
                    "1 - Cadastrar Turma\n" +
                    "2 - Cadastrar Estudantes\n" +
                    "3 - Listar Informações das Turmas\n" +
                    "4 - Listar Informações dos Estudantes\n" +
                    "5 - Sair"
            );
            System.out.print("Opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    Scanner scanTurma = new Scanner(System.in);
                    Turma turma = new Turma(); //Cria uma nova turma

                    System.out.print("Nome da Turma: ");
                    turma.setNome(scanTurma.nextLine());

                    System.out.print("Codigo da Turma: ");
                    turma.setCodigo(scanTurma.nextLine());

                    System.out.print("Capacidade da Turma: ");
                    turma.setCapacidade(scanTurma.nextInt());

                    turmas.add(turma); //Adiciona na lista de turmas
                    break;
                case 3:
                    for (Turma t: turmas) {
                        t.listarInfos();
                        System.out.println("==================");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opção Invalida");
            }

        }

    }

}