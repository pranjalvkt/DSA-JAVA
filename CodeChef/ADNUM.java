package CodeChef; // REMOVE PACKAGE 
import java.util.*;
import java.io.*;

public class ADNUM {// CHANGE CLASS DECLARATION TO--> "class CodeChef"
    public static void main(String[] args) {
        try {
            FastReader fs = new FastReader();
            FastWriter out = new FastWriter();
            int n = fs.nextInt();
             /* HERE IS THE SOLUTION ! */ 
            int[] a = new int[n];
            int[] b = new int[n+1];

            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            for (int i = 0; i < b.length; i++) {
                b[i] = fs.nextInt();
            }

            HashSet<Integer> hs = new HashSet<>();

            for(int i = 0; i < a.length; i++) {
                hs.add(a[i]);
            }
            for (int i = 0; i < b.length; i++) {
                if(!hs.contains(b[i])) {
                    System.out.println(b[i]);
                }
            }

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