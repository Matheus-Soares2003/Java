import java.util.Scanner;

public class DegustacaoVinho {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();
        String respostasCompetidores = scan.nextLine();

        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");
        int count = 0;
        for (short i = 0; i < 5; i++) {
            if (respostasCompetidoresSplit[i].equals(T)) {
                count++;
            }

        }
        System.out.println(count);
    }
}

