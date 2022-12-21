import java.io.FileInputStream;
import java.util.Scanner;

public class excepthrowmethod {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3};
        Scanner input = new Scanner(System.in);
        System.out.println("nilai array ke = ");
        int index = input.nextInt();

        int data = 0;
        try{
            data = ambilData(arr,index);
        }catch (Exception e){
            System.err.println(e);
        }

        System.out.printf("index ke -%d adalah %d", index , data);
        System.out.println("\nend");

    }

//    throw exception method adalah cara supaya error runtime dapat tertangani dan melanjutkan kode berikutnya
//    contoh method di bawah ini beresiko error out of bound karena mengambil data array
    private static int ambilData(int[] array, int index)throws Exception{
        int hasil = array[index];
        return hasil;
    }
}
