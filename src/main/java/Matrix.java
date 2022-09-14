import java.util.Random;

public class Matrix {
    int a;
    int b;
    int[][] matrix;


    public Matrix(int a, int b){
        Random random = new Random();
        matrix = new int[a][b];
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                set(i,j, random.nextInt(11));   //используем сетер для задачи матрицы
            }
        }
        this.a = a; //записываем а и b в переменные класса
        this.b = b;
    }
    public void set(int a, int b, int c){   //сетер
        matrix[a][b] = c;
    }

    public int get(int a, int b){    //гетер
        return matrix[a][b];
    }

    void print() {      // так как мы не выводим матрицу в методе Matrix, а только задаем для дальнейшей работы,
        for (int i = 0; i < matrix.length; i++)             // в методе принт мы выводим матрицы.
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(get(i, j) + " ");
            }
            System.out.println();
        }


    Matrix summ(Matrix m){  // сумма
        Matrix mc = new Matrix(m.a, m.b);
        for(int i = 0; i < m.a; i++) {
            for (int j = 0; j < m.b; j++) {
                mc.set(i, j, get(i,j)+m.get(i,j));       //реализуем сетер и гетер.
            }
        }
        return mc;
    }

    Matrix unch(int u){        // Умножение на число
        Matrix mc = new Matrix(a,b);
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                mc.set(i, j, get(i,j)*u);       //реализуем сетер и гетер.
            }
        }
        return mc;
    }
    Matrix umMat(Matrix m){ // умножение матриц
        Matrix mc = new Matrix(a,b);
        int r=0;
        for(int i = 0; i < mc.a; i++) {
            for (int j = 0; j < mc.b; j++) {
                if(mc.a < mc.b) {                       //условие которое позволяет избежать ошибки в случае
                    for (int k = 0; k < mc.a; k++) {    //если матрицы не квадратные.
                        r = r + (get(i,k) * m.get(k,j));
                    }
                }
                else {
                    for (int k = 0; k < mc.b; k++) {
                        r = r + (get(i,k) * m.get(k,j)); // алгоритм расчета одного числа матрицы
                    }
                }
                mc.set(i,j, r); //реализация сетера
                r=0;            // сброс переменной
            }
        }
        return mc;
    }
}