public class WrapperClasses {

    public static void main(String[] args) {

        int i = 42;
        double d = 3.14;
        char c = 'A';
        boolean b = true;

        Integer intWrapper = i;
        Double doubleWrapper = d;
        Character charWrapper = c;
        Boolean booleanWrapper = b;

        System.out.println("Class name of Integer wrapper : " + intWrapper.getClass().getName());
        System.out.println("Class name of Double wrapper : " + doubleWrapper.getClass().getName());
        System.out.println("Class name of Character wrapper : " + charWrapper.getClass().getName());
        System.out.println("Class name of Boolean wrapper : " + booleanWrapper.getClass().getName());
    }
}