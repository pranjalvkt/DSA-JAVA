
package GeneralProblems;

import java.util.*

;public class Rot13 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String resStr = rot13(str);
		System.out.println(resStr);
		sc.close();
	}
    private static String rot13(String str) {
		int size = str.length();
		char[] charArr = new char[size];
		
		for(int i = 0; i < size; i++) {
			charArr[i] = str.charAt(i);
		}
		
        char[] auxArr = new char[size];

		for(int i = 0; i < size; i++) {
			int val = (int) charArr[i];
            // System.out.println(val);
			int modifiedChar = val + 13;
			if (modifiedChar > 122) {
                modifiedChar = modifiedChar - 26;
            }
            char temp = (char) modifiedChar;
            auxArr[i] = temp;
		}
        // for (int i = 0; i < auxArr.length; i++) {
        //     System.out.println(auxArr[i]);
        // }
        String newStr = new String(auxArr);
        return newStr;
	}
}
