public class Main {
    public static void main(String[] args) {
        System.out.println(isPrime(29));

    }
    public static boolean isPrime(int num){
       if(num<=1){
           return false;
       }
       if(num==2){
           return true;
       }
       //check for even case , so we can skip even num in loop
       if(num%2==0){
           return false;
       }
       //check from num until root of num
      //ex: num=29, i=3,5
       for(int i=3;i*i<=num;i=i+2){
           if(num%i==0){
               return false;
           }
       }
       return  true;
    }
}