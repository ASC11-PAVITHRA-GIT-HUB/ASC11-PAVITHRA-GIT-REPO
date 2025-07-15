public class number_in_words {
    public static void nu_to_wo(int num){
        if(num<100 && num >999){
            System.out.println("Enter the valid 3 digit number");
        }
        String[] words ={"Zero", "one" , "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        int hundred = num/100;
        int ten = (num/10)%10;
        int units = num%10;
        System.out.println("digit in words:");
        System.out.println(words[hundred]+ " "+ words[ten]+ " " + words[units]);
    }

    public static void main(String[] args) {
        nu_to_wo(312);
    }
}
