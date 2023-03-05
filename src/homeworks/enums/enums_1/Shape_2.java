package homeworks.enums.enums_1;

public enum Shape_2 implements Shape_interf{
    SQUARE {
        @Override
        public int getArea() {
            return getA() * getB();
        }
        @Override
        public int getPerimeter() {
            return getA()*2 + getB()*2;
        }

    },
    RECTANGLE {

        @Override
        public int getArea() {
            return getA() * getB();
        }

        @Override
        public int getPerimeter() {
            return getA()*2 + getB()*2;
        }
    };

    private int a,b;

    /**
     *
     * @param a
     * @param b
     */
    void setValues(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public	int getA() {
        return a;
    }
    public	int getB() {
        return b;
    }

    public abstract int getArea();
}
