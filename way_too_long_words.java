import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.length() > 10) sb.append(str.charAt(0)).append(str.length() - 2).append(str.charAt(str.length() - 1));
            else sb.append(str);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
