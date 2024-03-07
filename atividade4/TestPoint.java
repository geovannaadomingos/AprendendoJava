package atividade4;

public class TestPoint {
    public static void main(String[] args) {
        // Testando o construtor
        Point p1 = new Point();
        System.out.println("p1: x = " + p1.getX() + ", y = " + p1.getY());

        // Testando os métodos setX e setY em p1
        p1.setX(200);
        p1.setY(300);
        System.out.println("p1 after setX and setY: x = " + p1.getX() + ", y = " + p1.getY());

        // Testando o método moveBy
        p1.moveBy(50, -50);
        System.out.println("p1 after moveBy: x = " + p1.getX() + ", y = " + p1.getY());

        // Testando movimentos que resultariam em erro
        p1.moveBy(500, 500); // Movimento que estaria fora do intervalo permitido
        System.out.println("p1 after invalid moveBy: x = " + p1.getX() + ", y = " + p1.getY());
    }
}