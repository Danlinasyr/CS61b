public class HelloNumbers {
    public static void main(String[] args) {
        int x,temp;
        x = 0;
        temp = 0;
        while (x < 10) {
            temp = temp + x;
            System.out.println(temp);
            x = x + 1;
        }
    }
}