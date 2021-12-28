package com.linearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] ar = {24, 45 , 1 ,54, 65, 244,643,234,64};
        System.out.println(min(ar));
    }

    static int min(int[] ar){
        int mi = ar[0];
        for(int i = 1; i < ar.length; i++){
            if(mi > ar[i])
                mi = ar[i];
        }
        return mi;
    }
}
