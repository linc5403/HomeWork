package com.banyuan.demo;

import org.junit.Test;

public class test {
        public int maxNumberOfBalloons(String text) {
            int a,b,c,d,e,count;
            a=b=c=d=e=count=0;
            for(int i=0;i<text.length();i++){
                String  str=text.substring(i,i+1);
                if(str.equals('b'))a++;
                if(str.equals('a'))b++;
                if(str.equals('l'))c++;
                if(str.equals('o'))d++;
                if(str.equals('n'))e++;}
            while(a==1&&b==1&&c==2&&d==2&&e==1){
                count++;
            }
            return count;
        }
@Test
    public void main(String[] args) {
        int balloon = maxNumberOfBalloons("balloon");
        System.out.println(balloon);
    }

}
