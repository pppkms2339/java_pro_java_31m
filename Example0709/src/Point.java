class Point {
    public double x; // абсцисса точки
    public double y; // ордината точки

    // возвращает строку с описанием точки
    public String toString() {
        return "(" + x + ";" + y + ")";
    }

    // выводит на экран описание точки
    public void printPoint() {
        System.out.print(this.toString());
    }

    // метод перемещает точку на указанный вектор
    public void movePoint(double a, double b) {
        x = x + a;
        y = y + b;
    }

    // метод изменяет координаты точки на указанные
    public void setPoint(double a, double b) {
        x = a;
        y = b;
    }

    // конструктор по умолчанию, создающий точку в начале координат
    public Point() {
        x = 0.0;
        y = 0.0;
    }

    // конструктор, создающий точку с указанными координатами
    public Point(double a, double b) {
        x = a;
        y = b;
    }

    // метод вычисляющий расстояние между точками
    public double length(Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    // метод проверяющий совпадают ли точки
    public boolean equalsPoint(Point p) {
        if (this.x == p.x && this.y == p.y) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return this.x == point.x && this.y == point.y;
    }

    @Override
    public int hashCode() {
//        int result = 373;
//        result = (int)(37 * result + x);
//        result = (int)(37 * result + y);
//        return result;
        return (int)(37 * x + y);
    }
}