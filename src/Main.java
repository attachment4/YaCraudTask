public class Main {

    public static int gcdRange(int L, int R) {
        if (L == R) {
            return L;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(gcdRange(5, 10));  // 1
        System.out.println(gcdRange(7, 7));   // 7
        System.out.println(gcdRange(1, 100)); // 1
    }
}