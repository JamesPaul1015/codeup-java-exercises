public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }


//        long x = 2;
//        do {
//            System.out.println(x);
//            x *= x;
//        } while (x < 1000000);





        boolean flag = true;

        for(int i=0;i<=100;i++){
            if(i%3==0){
                System.out.println("Fizz");
                flag=false;
            }

            if(i%5==0){
                System.out.println("Buzz");
                flag=false;
            }

            if (i % 15 == 0)
            {
                System.out.println("FizzBuzz");
            }

            if (flag)
                System.out.println(i);

            flag = true; }








    }
}
















