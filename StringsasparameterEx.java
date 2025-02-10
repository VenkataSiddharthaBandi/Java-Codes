
class helloo{
    void check(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}


public class StringsasparameterEx{
    public static void main(String[] args){
        int p[] = {1,2,3,4,5};
        helloo obj = new helloo();
        obj.check(p);
    }
}