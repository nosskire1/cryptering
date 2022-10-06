public class cryptering {
    public static void main(String[] args){
        String m = "hej";
        String k = "hallo";

        Model cryptModel = new Model();
        System.out.print(cryptModel.cryptString(m,k));
    }




}
