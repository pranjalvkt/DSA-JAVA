package CodeForces;
import java.util.*;
import java.io.*;

public class A469 {// CHANGE CLASS DECLARATION TO--> "class CodeChef"
    public static void main(String[] args) {
        try {
            FastReader fs = new FastReader();
            FastWriter out = new FastWriter();
            int t = fs.nextInt();

            int p = fs.nextInt();
            int[] pArr = new int[p];
            for (int i = 0; i < p; i++) {
                pArr[i] = fs.nextInt();
            } 

            int q = fs.nextInt();
            int[] qArr = new int[q];
            for (int i = 0; i < q; i++) {
                qArr[i] = fs.nextInt();
            }

            boolean[] levelArr = new boolean[t];
            Arrays.fill(levelArr, false);

            for (int i = 0; i < p; i++) {
                levelArr[pArr[i]-1] = true;
            }
            
            for (int i = 0; i < q; i++) {
                levelArr[qArr[i]-1] = true;
            }
            boolean flag = true;
            for (int i = 0; i < levelArr.length; i++) {
                if (levelArr[i] == false) {
                    flag = false;
                    break;
                } 
            }
            if (flag) {
                out.println("I become the guy.");
            } else {
                out.println("Oh, my keyboard!");
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