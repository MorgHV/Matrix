public class Main {
    public static void main(String[] args) {
        Matrix mc = new Matrix(2, 2);
        Matrix mc2 = new Matrix(2, 2);
        Matrix mc3 = new Matrix(2,2);
        Matrix mc4 = new Matrix(2,2);
        Matrix mc5 = new Matrix(2,2);
        mc.print();
        System.out.println();
        mc2.print();
        System.out.println();
        mc3 = mc.summ(mc2);
        mc3.print();
        System.out.println();
        mc4 = mc.unch(2);
        mc4.print();
        System.out.println();
        mc5 = mc.umMat(mc2);
        mc5.print();
    }
}