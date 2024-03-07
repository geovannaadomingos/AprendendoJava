package atividade4;

public class Point {
    private int x = 0, y = 0;

    public Point() {
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        if (x >= 0 && x <= 400) {
            this.x = x;
        } else {
            System.err.println("Erro: Coordenada y fora do intervalo permitido.");
        }
    }

    public void setY(int y) {
        if (y >= 0 && y <= 400) {
            this.y = y;
        } else {
            System.err.println("Erro: Coordenada y fora do intervalo permitido.");
        }
    }

    public void moveBy(int dx, int dy) {
        int newX = getX() + dx;
        int newY = getY() + dy;

        if (newX >= 0 && newX <= 400 && newY >= 0 && newY <= 400) {
            setX(newX);
            setY(newY);
        } else {
            System.err.println("Erro: Esse movimento estaria fora do intervalo permitido.");
        }
    }
}
