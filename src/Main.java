/*TODO Implementar la serie fibonacci utilizando colecciones:

Implementar los métodos:

- Que devuelva determinado fibonacci
- Que devuelva la posición de determinado número si está en la serie.
- Implementar la clase Fibonacci
- Investigar la recursividad e implementarla
- Generar Diagrama UML
* */

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(8);
        fibonacci.getSerieFibonacci();

        System.out.println("Serie generada con LinkedList: " + fibonacci);


    }
}