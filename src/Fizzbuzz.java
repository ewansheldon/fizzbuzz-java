public class Fizzbuzz {
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
