package homeworks.enums.enums_1;

public  enum Shape {

    SQUARE {
        public double area(double side) {
            return side * side;
        }

        public  double area(double s, double q){
            return 0;
        }
    },
    RECTANGLE {
        public double area(double length, double width) {
            return length * width;
        }
        public double area(double dimensions){
            return 0;
        }
    },
    CIRCLE {
        public double area(double radius) {
            return Math.PI * radius * radius;
        }
        public  double area(double s, double q){
            return 0;
        }
    },
    TRIANGLE {
        public double area(double base, double height) {
            return 0.5 * base * height;
        }
        public double area(double dimensions){
            return 0;
        }
    };

    /**
     * area for 1 argument shapes
     * @param dimensions
     * @return
     */
    public abstract double area(double dimensions);

    /**
     * area for 2 argument shapes
     * @param dimensions
     * @param dimensions2
     * @return
     */
    public abstract double area(double dimensions, double dimensions2);
}

