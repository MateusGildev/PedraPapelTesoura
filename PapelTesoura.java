import java.util.Random;
import java.util.Scanner;

public class PapelTesoura {
    public static void main(String[] args) {
    Jogo();
    }
    static void Jogo(){
        Scanner ler = new Scanner(System.in);
        Random maquina = new Random();
        var pc = maquina.nextInt(3);

        System.out.println(" [1]PEDRA    [2]PAPEL   [3]TESOURA:");
        int perg = ler.nextInt();

        if (perg == 1){
            System.out.println("VC JOGOU PEDRA...");
            if (pc == 1){
                System.out.println("MAQUINA JOGOU PEDRA TAMBEM...");
                System.out.println("EMPATE");
            } else if (pc == 2) {
                System.out.println("MAQUINA JOGOU PAPEL...");
                System.out.println("MAQUINA GANHOU !!!");
            } else if (pc == 3) {
                System.out.println("MAQUINA JOGOU TESOURA...");
                System.out.println("VC GANHOU !!!");
            }
        } else if (perg == 2 ) {
            System.out.println("VC JOGOU PAPEL...");
            if (pc == 1){
                System.out.println("MAQUINA JOGOU PEDRA...");
                System.out.println("VC GANHOU !!!");
            } else if (pc == 2) {
                System.out.println("MAQUINA JOGOU PAPEL...");
                System.out.println("EMPATE !!!");
            } else if (pc == 3) {
                System.out.println("MAQUINA JOGOU TESOURA");
                System.out.println("MAQUINA GANHOU !!!");
            }
        }

        if (perg == 3) {
            System.out.println("VC JOGOU TESOURA...");
            if (pc == 1){
                System.out.println("MAQUINA JOGOU PEDRA...");
                System.out.println("MAQUINA GANHOU !!!");
            } else if (pc == 2) {
                System.out.println("MAQUINA JOGOU PAPEL...");
                System.out.println("VC GANHOU !!!");
            } else if (pc == 3) {
                System.out.println("MAQUINA JOGOU TESOURA");
                System.out.println("EMPATE !!!");
            }
        }
        System.out.println("==================================");
        System.out.println("Quer jogar denovo? [1]SIM  [2]NAO");
        int replay = ler.nextInt();
        while (replay == 1){
            Jogo();
        }
    }
}
