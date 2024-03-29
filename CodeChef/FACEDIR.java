package CodeChef; // REMOVE PACKAGE 
import java.util.*;
import java.io.*;

public class FACEDIR {// CHANGE CLASS DECLARATION TO--> "class CodeChef"
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
    public static void main(String[] args) {
        try {
            FastReader fs = new FastReader();
            FastWriter out = new FastWriter();
            int t = fs.nextInt();
            while(t-- > 0){
                /* WRITE YOUR CODE HERE */
                int x = fs.nextInt();
                int rem = x % 4;
                switch (rem) {
                    case 0:
                        out.println("North");
                        break;
                    case 1:
                        out.println("East");
                        break;
                    case 2:
                        out.println("South");
                        break;
                    case 3:
                        out.println("West");
                        break;
                
                    default:
                        break;
                }
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}