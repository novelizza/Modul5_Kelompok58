package modul5_kelompok58;

public class Data {
    private int[] coba = new int[2];
    int q=1;

    public void test(int a){
        /*for (int i=0; i < coba.length; i++) {
            this.coba[i] = a;
            q++;

        }*/
        int[] data = {a};
        this.coba = data;
    }

    public void test1(){
        for (int i=0; i<coba.length; i++) {
            System.out.println(coba[i]);
        }
        System.out.println("panjang :"+coba.length);
    }

}
