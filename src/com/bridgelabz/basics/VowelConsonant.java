package com.bridgelabz.basics;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Alphabet: ");
        char ch=scan.next().charAt(0);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='u'){
            System.out.println(ch+" is Vowel");
        }else {
            System.out.println(ch+" is Consonant");
        }
    }
}
