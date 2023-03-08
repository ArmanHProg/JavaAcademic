package homeworks.enums.enums_2.coffesize;

public class Show {
    Size[] size = Size.values();

    /**
     * print coffee size and ordinal
     */
    public void print(){

        for (int i = 0; i < size.length; i++) {
            System.out.println(size[i] + "  " + size[i].ordinal() );
        }
    }

}
