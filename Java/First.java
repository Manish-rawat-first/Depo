import java.util.Arrays;

public class First{
    public static void main(String[] args) {
        String s = "kodnest";
        char arr[] = s.toLowerCase().toCharArray();
        Arrays.sort(arr);
        for(char pe = arr[0];pe<arr[arr.length-1];pe++){
            boolean exist = false;
            for(char ch:arr){
                if(pe==ch){
                    exist = true;
                }
            }
            if(!exist){
                System.out.print(pe+" ");
            }

        }

    }
}