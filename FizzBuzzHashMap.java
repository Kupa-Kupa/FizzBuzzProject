import java.util.HashMap; // HashMap info https://www.w3schools.com/java/java_hashmap.asp

public class FizzBuzzHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> fizzbuzz = new HashMap<Integer, String>();
        fizzbuzz.put(3, "fizz");
        fizzbuzz.put(5, "buzz");

        for (int i = 1; i <= 100; i++) {
            String output = "";
            for (int numkey : fizzbuzz.keySet()) {
                    if (i % numkey == 0) {
                        output += fizzbuzz.get(numkey); // .get retrieves a value from the map by its key
                    }
                }
            if (output == "") {
                output += i;
            }
            System.out.println(output);
        }
    }
}