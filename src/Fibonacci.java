import java.util.LinkedList;

public class Fibonacci {
    private int lim = 0;
    private LinkedList<Integer> serieFibonacci;

    public Fibonacci() {
    }

    public Fibonacci(int lim) {
        this.lim = lim;
        this.serieFibonacci = new LinkedList<>();
    }

    // Generar serie fibonacci utilizando una LinkedList
    public int getSerieFibonacci() {
        serieFibonacci.add(1);
        serieFibonacci.add(1);

        for (int i = 2; i < lim; i++) {
            int num = serieFibonacci.get(i - 1) + serieFibonacci.get(i - 2);
            serieFibonacci.add(num);
        }
        return serieFibonacci.get(lim - 1);
    }

    // Devolver la posición de determinado número si está en la serie.
    public int getPosNum(int num) {
        for (int i = 0; i < lim; i++) {
            if (serieFibonacci.get(i) == num) {
                return i + 1;
            }
        }
        return -1;
    }

    // Recursividad
    public int getRecursividad(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return getRecursividad(num - 1) + getRecursividad(num - 2);
        }
    }

    //toString
    @Override
    public String toString() {
        return "Fibonacci{ " +
                "dato= " + lim +
                ", serieFibonacci= " + serieFibonacci +
                '}';
    }
}
