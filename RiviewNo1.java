// NAMA : KHOSYI NASYWA IMANDA
// KELAS : SIB-2E
// NO : 12

public class RiviewNo1{
    public static void main(String[] args){
        int nim [] = {2,1,4,1,7,6,2,1,0,3};
        int a = 0 , b = 4;

        int i = 1;
        while(i<=b){   

            int j=4;
            while(j>=i){
                System.out.print(" ");
                j--;
            }

            int k=1;
            while(k<=i){
                System.out.print(nim[a] + " ");
                a++;
                k++;
            }

            System.out.println();
            i++;
        }

       

    }
}