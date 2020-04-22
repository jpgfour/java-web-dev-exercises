package exercises;

public class Class2ArrayPracticeItem12 {

    public static void main(String[] args) {

        int[] numbers = {1,1,2,3,5,8};

        for(int i =0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0 ){
                System.out.println(numbers[i]);
            }
        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Hello, what is your name:");
//        String name = input.nextLine();
//        System.out.println("Hello " + name);

    }
}
