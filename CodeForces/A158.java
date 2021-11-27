package CodeForces;// REMOVE PACKAGE 
import java.util.*;
import java.io.*;

public class A158 {// CHANGE CLASS DECLARATION TO--> "class CodeChef"
    public static void main(String[] args) {
        try {
            FastReader fs = new FastReader();
            FastWriter out = new FastWriter();
            int t = fs.nextInt();
            int n = fs.nextInt();
            int count = 0;
            int[] arr = new int[t];
            for (int i = 0; i < t; i++) {
                arr[i] = fs.nextInt();
            }
            if (n >= t) {
                System.out.println(t);
            }
            if (arr[n] > 0) {
                for (int i = 0; i < t; i++) {
                    if(arr[i] > 0 && arr[i] >= arr[n]) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
            else {
                for (int i = 0; i <= n; i++) {
                    if(arr[i] > 0) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(count);
            out.close();
        } catch (Exception e) {
            return;
        }
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while(st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
}