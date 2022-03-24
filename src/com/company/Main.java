package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n =2;
        int cnt = 0;
        while (n<=100){
            for (int i =2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    cnt ++;
                }
            }
            if(cnt ==0){
                System.out.print(n+"\t");
            }
            cnt =0;
            n++;
        }
    }
}
