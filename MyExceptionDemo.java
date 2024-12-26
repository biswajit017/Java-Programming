public class MyExceptionDemo {
    public static void main(String[] args) {
        throwIllegalException();
    }

    public static void throwIllegalException() {
        try {
            throw new IllegalStateException("MyException");
        } catch (IllegalStateException objA) {
            System.out.println("Caught: " + objA.getMessage());
        }
    }
}