package demo2.Test;

public class Op {


    public static void main(String[] args) {
        int[] a={1,55,77,66,8,4,29,58,4,6};
        buu(a);
        for (int i = 0; i <a.length-1 ; i++) {
            System.out.println(a[i]);
        }
    }

    static  void  buu(int[] a){
        int temp;
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j <a.length-1-i ; j++) {
                if (a[j]>a[j+1]) {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
    }

}
