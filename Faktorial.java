public class Faktorial{

    public int getFaktorial(int angka){
        if (angka==0){
            return 1;
        }
        else{
            return angka * getFaktorial(angka-1);
        }
    }



    public static void main(String[]args){
        Faktorial f = new Faktorial();
        int hasil = f.getFaktorial(5);
        System.out.println(hasil);

    }



}