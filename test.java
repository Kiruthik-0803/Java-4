import java.util.Scanner;

class rectangle {
    int length;
    int breadth;
    int height;

    float calculate() {
        return (float) length * breadth * height;
    }

}

class circle {
    float radius;

    float calculate() {
        return (float) (3.14 * radius * radius);
    }

}

class triangle {
    int base;
    int height;

    float calculate() {
        return (float) (0.5 * base * height);
    }
}

class test {
    public static void main(String args[]) {
        rectangle r = new rectangle();
        triangle t = new triangle();
        circle c = new circle();
        int choice = 1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Enter the choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the breadth, length, height:");
                    r.breadth = sc.nextInt();
                    r.length = sc.nextInt();
                    r.height = sc.nextInt();
                    System.out.println("Area of rect:" + r.calculate());
                    break;

                case 2:
                    System.out.println("Enter the Radius:");
                    c.radius = sc.nextInt();
                    System.out.println("Area of circle:" + c.calculate());
                    break;

                case 3:
                    System.out.println("Enter the base and height:");
                    t.base = sc.nextInt();
                    t.height = sc.nextInt();
                    System.out.println("Area of triangle:" + t.calculate());
                    break;

                default:
                    if (choice > 0) {
                        System.out.println("Enter valid choice:");
                    }

            }
        }
        sc.close();
    }

}