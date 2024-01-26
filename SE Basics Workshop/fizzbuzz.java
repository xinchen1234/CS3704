package CS3704;
public class fizzbuzz{

    public static void main(String[] args){

		System.out.println(print());
	
	}

    public static String print(){
        String str = null;
        for(int i = 1; i < 21; i++){
            if(i % 5 == 0 && i % 3 == 0){
                str = "FizzBuzz";
            }else if(i % 3 == 0){
                str = "Fizz";
            }else if(i % 5 == 0){
                str = "Buzz";
            }else{
                str = Integer.toString(i);
            }

        }
        return str;

    }
}
