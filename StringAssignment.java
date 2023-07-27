import java.util.*;

public class StringAssignment {

    //No of lowercase vowels

    public static void lowerCaseVowels(){
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;
        for(int i=0;i<str.length();++i){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }  

        }
        System.out.println(count);

    }

    //Check if anagrams

    public static void anagrams(){
        String str1="earth";
        String str2 = "heart";
    
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){
            char str1array[]=str1.toCharArray();
            char str2array[]=str2.toCharArray();

            Arrays.sort(str1array);
            Arrays.sort(str2array);

            boolean result = Arrays.equals(str1array, str2array);

            if(result){
                System.out.println("Anagrams");
            }
            else
                System.out.println("Not anagrams");
        }

        else    
            System.out.println("Not anagrams");
    }

    public static void main(String args[]){
        lowerCaseVowels();
        anagrams();
    }
}