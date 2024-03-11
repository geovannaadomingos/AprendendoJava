// Roteiro:
// - considere o design da classe Point [ja visto em sala de aula] abaixo:
// - implemente as tasks (1) a (3) e finalize com a (4)

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

// (1) Sobrescrever o metodo equals [herdado de Object] para que a classe possa ter um criterio de comparacao e ser usada tranquilamento em estrutura de dados como ArrayList.
// (2) Sobrescrever o metodo toString para que retorne uma representacao em String do estado [fields x e y] do objeto Point
// (3) Implemente uma subclasse chamada ScreenPoint [herda de Point]; em ScreenPoint assegure o seguinte invariante de classe 
//      (x >=0 && x <= 300) && (y >=0 && y <= 300); 
// REQUIRED: garanta esse invariante sem sobrescrever nenhum dos metodos da classe Point [dada acima]
// DICA: use um metodo para validar isso tanto em Point quanto em ScreenPoint!

// (4) Ao finalizar, favor finalizar essa task e submeter a sua versao da classe Point final.
// ***OBS: Pode submeter um arquivo .txt ou .java com o codigo da classe ou apenas o texto da mesma como comentario privado.
package atividade5;

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

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null || getClass() != object.getClass()) {
            return false;
        } else {
            Point point = (Point) object;
            return x == point.x && y == point.y;
        }
    }

    public String toString() {
        return "campos x=" + x + " e y=" + y;
    }
}

class ScreenPoint extends Point {
    public void setX(int x) {
        if (isValidX(x)) {
            super.setX(x);
        }
    }

    public void setY(int y) {
        if (isValidY(y)) {
            super.setY(y);
        }
    }

    private boolean isValidX(int x) {
        return x >= 0 && x <= 300;
    }

    private boolean isValidY(int y) {
        return y >= 0 && y <= 300;
    }
}
