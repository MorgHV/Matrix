import java.util.Random;

public class Matrix {
    int a;
    int b;
    int d;

    Double[][] masa;
    Double[][] masa2;


    public Matrix(int a, int b) {
        Random random = new Random();
        this.a = a;
        this.b = b;
        Double[][] masa = new Double[a][b];
        Double[][] masa2 = new Double[a][b];
        System.out.println("Матрица");

        for (int i = 0; i < masa.length; i++) {
            for (int j = 0; j < masa[i].length; j++) {
                masa[i][j] = random.nextDouble(101);
                System.out.print(masa[i][j] + "    ");

            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < masa2.length; i++) {
            for (int j = 0; j < masa2[i].length; j++) {
                masa2[i][j] = random.nextDouble(101);
                System.out.print(masa2[i][j] + "    ");

            }
            System.out.println();
        }
        System.out.println();

        this.masa = masa;
        this.masa2 = masa2;


    }

    public void HumbaYUmba(Double[][] masa, Double[][] masa2) {
        Double[][] masas = new Double[a][b];
        for (int i = 0; i < masa.length; i++) {
            for (int j = 0; j < masa[i].length; j++) {
                masas[i][j] = masa[i][j] + masa2[i][j];
                System.out.print(masas[i][j] + "     ");
            }
            System.out.println();
        }
    }

    public void YmnogenieNaChislo(Double[][] masa, int d) {
        this.d = d;
        Double[][] Ymnog = new Double[a][b];
        for (int i = 0; i < masa.length; i++) {
            for (int j = 0; j < masa[i].length; j++) {
                Ymnog[i][j] = masa[i][j] * d;
                System.out.print(Ymnog[i][j] + "    ");

            }
            System.out.println();


        }
    }

    public void Poebota(Double[][] masa, Double[][] masa2) {
        Double[][] KvadroPoebota = new Double[a][b];
        Double peremenay = 0.0;
        for (int i = 0; i< masa.length;i++){
            for(int j = 0;j < masa[i].length;j++){
                for(int k = 0; k < masa[i].length;k++){
                    peremenay = peremenay+ masa[i][k]*masa2[k][j];
                }
                KvadroPoebota[i][j]=peremenay;
                peremenay = 0.0;
                System.out.print(KvadroPoebota[i][j]+"   ");
            }
            System.out.println();
        }



    }
}
