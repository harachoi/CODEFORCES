import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.parseInt(br.readLine());
        if (w > 2) {
            System.out.println(w % 2 == 0 ? "YES" : "NO");
        } else System.out.println("NO");
    }
}
