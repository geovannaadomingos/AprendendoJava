// Roteiro:
// - considere o design da classe Point [ja visto em sala de aula] abaixo:

// public class Point {
//     public int x = 0, y = 0;

//     public int getX() { return x; }
//     public int getY() { return y; }

//     public void setX(int x) { 
//         this.x = x; 
//     }
//     public void setY(int y) { 
//         this.y = y; 
//     }

//     public void moveBy(int dx, int dy) {
//         setX(getX() + dx);
//         setY(getY() + dy);
//     }
// }

// (1) Implemente um construtor para que seja possivel criar uma instancia de Point da seguinte forma: Point p = new Point(10, 10);
// (2) Verifique questao de "data hiding" para assegurar um encapsulamento onde os fields nao sejam visiveis fora do modulo
// (3) Existe um contrato [invariante de classe] que exige que as coordenadas representadas pela classe Point sejam positivas e menores ou iguais a 400, ou seja, (x >=0 && x <= 400) && (y >=0 && y <= 400). Assegure para que a classe mantenha essa integridade ao ser manipulada por codigo clientes.

// (4) Ao finalizar, favor finalizar essa task e submeter a sua versao da classe Point final.
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
            System.err.println("Erro: Coordenada x fora do intervalo permitido.");
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
