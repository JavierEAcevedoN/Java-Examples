package Example17.Exercises.Exercise1;

public class Multiplicacion {
    public static void main(String[] args) {
        Matriz a = new Matriz(3,3);
        
        a.setMatrizPropiaValor();
        a.imprimirMatrizPropia();
        
        Matriz b = new Matriz(3, 3);
        
        b.setMatrizPropiaValor();
        b.imprimirMatrizPropia();

        a.setMatrizExterna(b);

        Thread aT;
        aT = new Thread(a);
        aT.start();
    }
}