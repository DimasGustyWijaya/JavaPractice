import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class exceptiontraining {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3};
        FileInputStream Fileinput = null;
        Scanner input = new Scanner(System.in);
        System.out.println("nilai array ke = ");
        int index = input.nextInt();


        //exception handling jadi kalo kita masukan input 5 itukan error karna index cuma sampe 4 solusinya
// menggunakan try untuk mencoba nanti akan ditangkap menggunakan catch, masukan yang membuat error excep ke try
//        disini  adalah sistem out yang ngeprint index dan arr[index],
//        kalo sebelum di try dan catch itu program akan mati dan tidak mengeksekusi perintah sout "end"
//        tapi kalo pake ini program akan menangkap error dan melanjutkan perintah berikut nya
//        kita bisa juga try dua masalah dan menangkap dua masalah juga
    try{
        System.out.printf("index ke -%d adalah %d", index , arr[index]);
        Fileinput = new FileInputStream("sample.txt");

//        arrarindexofbound didapat dari mencoba error array sebelunya lalu di copy ke param catct untuk membedakan dengan error fileinput

    } catch (ArrayIndexOutOfBoundsException e){
        System.err.println(e);
    }catch (IOException e){
        System.err.println(e);
    }finally {
        System.out.println("program selesai");
    }

//    ada juga finally yang akan dieksekusi setelah try dan catch dan juga akan menclose sesi pembukaan file


        System.out.println("end");

    }
}
