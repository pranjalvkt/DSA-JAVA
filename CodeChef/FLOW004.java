package CodeChef; // REMOVE PACKAGE 
import java.util.*;
import java.io.*;

public class FLOW004 {// CHANGE CLASS DECLARATION TO--> "class CodeChef"
    public static void main(String[] args) {
        try {
            FastReader fs = new FastReader();
            FastWriter out = new FastWriter();
            int t = fs.nextInt();
            while(t-- > 0){
                /* HERE IS THE SOLUTION ! */
                String str = fs.nextLine();

                int answer = 0;
                if (str.length() == 1) {
                    answer = Character.getNumericValue(str.charAt(0));
                } else {
                    answer = Character.getNumericValue(str.charAt(0));
                    answer += Character.getNumericValue(str.charAt(str.length()-1));
                }
                out.println(answer);
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