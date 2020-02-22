public class Main {
    public String solve(String value) {
        return "Solved value: " + doA(value);
    }

    public String doA(String value) {
        return "Done A with value: " + doB(value);
    }

    public String doB(String value) {
        return "Done B with value: " + doC(value);
    }

    public String doC(String value) {
        return "Done C with value: " + value;
    }

    public static void main(String[] args) {
        String expected = "Solved value: Done A with value: Done B with value: Done C with value: abacaba";
        String received = new Main().solve("abacaba");
        if (expected.equals(received)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
