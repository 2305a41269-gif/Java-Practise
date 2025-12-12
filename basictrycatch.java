public class basictrycatch {
    public static void main(String[]args){
        try{
            int a = 10;
            int b = 0;
            int result = a/b;
            System.out.println("Result: "+ result);

        } catch(Exception sushant) {
            System.out.println("Caught Eception: " + sushant.getMessage());
        }
    }
    
}
