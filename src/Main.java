void main() {
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        IO.println("i = " + i);
    }

    Circle circle = new Circle();
    System.out.println("The area of a " + circle.getName() + circle.getArea());

    Square square = new Square();
    System.out.println(square.areal(5,2));

    Triangle triangle = new Triangle();
    System.out.println(triangle.getArea());
}
