public class BitManipulationAssignment {
    public static void main(String[] args) {

        //Swap without using 3rd variable

        int x = 3,y = 4;
        System.out.println("Before Swapping x = "+x+" y = "+y);

        x=x^y;
        y=x^y;
        x=x^y;
        
        System.out.println("After Swapping x = "+x+" y = "+y);

        Add1();
        UCtoLC();

    }

    //Add 1 to an integer

    public static void Add1(){
        int x =4;
        System.out.println(-~x);
    }

    //UpperCase to LowerCase

    public static void UCtoLC() {

        for(char ch = 'A';ch<='Z';ch++){
            System.out.print((char)(ch | ' '));
        }
        
    }
}
