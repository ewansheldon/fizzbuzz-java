public class Fizzbuzz {
    public String play(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "fizzbuzz";
        } else if (i % 3 == 0) {
            return "fizz";
        } else {
            return "buzz";
        }
    }
}
