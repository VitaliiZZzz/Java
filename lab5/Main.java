package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть текст:");
        Text text = new Text(scan.nextLine());

        StringBuilder texts = new StringBuilder();
        for(int i = 0; i < text.splited_text.length; i++){
            texts.append(text.splited_text[i]);
        }
        int len = texts.length();
        for (int i = 0; i < len; i++) {
            char c = texts.charAt(i);
            texts.setCharAt(i, Character.toLowerCase(c));
        }

        boolean flag = false;
        ArrayList<StringBuilder> arr = new ArrayList<>();

        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j <= i; j++) {
                StringBuilder str = new StringBuilder(texts.substring(j, len-i+j));
                StringBuilder reverse_str = new StringBuilder();
                for (int q = len-i-1; q >= 0; q--) {
                    reverse_str.append(str.substring(q,q+1));
                }
                if (str.toString().equals(reverse_str.toString())) {
                    arr.add(str);
                    flag = true;
                }
            }
            if (flag) {
                break;
            }
        }
        int n = arr.size();
        if (n == 0) {
            System.out.println("Паліндромів не знайдено ^_^");
        }else {
            System.out.println("Паліндром: ");
            for (StringBuilder end : arr) {
                System.out.println(end);
            }
        }
    }
}
