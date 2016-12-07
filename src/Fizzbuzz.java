public class Fizzbuzz {

    public static void main(String[] args) {

        Fizzbuzz fizzbuzz = new Fizzbuzz();

        for (int j=1; j < 101; j++) {
            System.out.println(fizzbuzz.play(j));
//              System.out.println("HELLO WORLD");

        }

    }

    public String play(int i) {
        if (i % 15 == 0) {
            return "fizzbuzz";
        } else if (i % 3 == 0) {
            return "fizz";
        } else if (i % 5 == 0) {
            return "buzz";
        } else {
            return Integer.toString(i);
        }
    }
}

