package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferreaderE5 {
    public static void main(String[] args) {
        String suji;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            suji = br.readLine();

        } catch (IOException e) {
        }
    }
}