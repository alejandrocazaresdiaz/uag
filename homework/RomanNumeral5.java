//package com.alexCazares;

/**
 *
 * @author Alejandro Cazares
 */
public class RomanNumeral5 {

    public static void main(String... args) {
        int num = Integer.parseInt(args[0]);
        System.out.println(new RomanNumeral5().toRoman(num));
    }

    public String toRoman(int num) {
        StringBuilder sb = new StringBuilder();
        //399 =400-1= CCC XC IX ...max -2 //300,200,100,90,50,
        int [] base = {100,90,50,40,10,9,5,4,1};
        String [] symbols = {"C","XC","L","XL","X","IX","V","IV","I"};
        int index=0;
        while(num>0){
            int nSymbol = num/base[index];
//            int residuo = num%base[index];
            if(nSymbol>0){
                sb.append(symbols[index]);
                num-=base[index];
            }else{
                index++;
            }
            //System.out.println(num+" "+nSymbol);
        }
        return sb.toString();
    }

}
