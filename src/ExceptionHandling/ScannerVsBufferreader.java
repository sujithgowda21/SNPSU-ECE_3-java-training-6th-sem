package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerVsBufferreader {
//    public static void main(String[] args) {
//        String name;
//        Scanner sc = new Scanner(System.in);
//        name = sc.next();
//        System.out.println(name);
//    }

//class bufferreader{
    public static void main(String[] args) throws IOException {
        String name;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ENter some name ");
        name= br.readLine();
        System.out.println(name);
    }
}




