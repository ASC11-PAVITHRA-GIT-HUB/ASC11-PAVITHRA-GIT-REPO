public class wordCount {
    public int word_Count(String sen) {
        String[] token = sen.trim().split("\\s+");
        int count = 0 ;
        for (String toke : token) {

            if (!toke.matches("\\d+")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        wordCount w =new wordCount();
        String sen = "Pavi is 21 years old";
        System.out.println(w.word_Count(sen));


    }
}



