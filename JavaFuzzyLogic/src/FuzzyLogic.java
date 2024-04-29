public class FuzzyLogic {
    public int compare(String first_word,String second_word,int length_1,int length_2){
        int i;
        int alterations = 0;

        //If both Strings are exactly the same
        if(second_word.equalsIgnoreCase(first_word)){
            return 0;
        }

        for(i=0;i<length_1;i++){

            if(first_word.charAt(i) != second_word.charAt(i)){
                ++alterations;
            }

            //If first_word is longer than second_word
            if(i == length_2-1){
                alterations += (length_1-length_2);
                break;
            }
        }

        //If second_word is longer than first_word
        if(length_2 > length_1){
            alterations += (length_2-length_1);
        }
        
        return alterations;
    }

    public static void main(String[] args){

        String first_word = "Star";
        String second_word = "Stir";

        int len_1 = first_word.length();
        int len_2 = second_word.length();

        FuzzyLogic fuz = new FuzzyLogic();
        int alteration = fuz.compare(first_word.toLowerCase(),second_word.toLowerCase(),len_1,len_2);
        int total_len;

        if(len_1 > len_2){
            total_len = len_1;
        }else if(len_2 > len_1){
            total_len = len_2;
        }else{
            total_len = len_1;
        }

        double perc = (double) (total_len - alteration) /total_len * 100;
        System.out.println("Alterations to be made : " + alteration);
        System.out.println("Percentage match       : " + perc);
    }
}
