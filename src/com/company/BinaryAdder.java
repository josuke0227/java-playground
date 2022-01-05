package com.company;

public class BinaryAdder {
    static long binary1;
    static long binary2;

    public BinaryAdder(long binary1, long binary2){
        this.binary1 = binary1;
        this.binary2 = binary2;
    }

    public void displayAddition() {
        int i = 0, remainder = 0;
        int[] sum = new int[10];

        // Test value
//        binary1 = 100010;
//        binary2 = 110010;

        while (this.binary1 != 0 || this.binary2 != 0){
            sum[i++] = (int)(this.binary1 % 10 + this.binary2 % 10 + remainder) % 2;
            remainder = (int)(this.binary1 % 10 + this.binary2 % 10 + remainder) / 2;
            this.binary1 /= 10;
            this.binary2 /= 10;
        }

        if (remainder != 0){
            sum[i++] = remainder;
        }
        i--;

        while(i >= 0) {
            System.out.print(sum[i--]);
        }
    }
}
