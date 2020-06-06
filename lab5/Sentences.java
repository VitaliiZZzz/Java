package lab5;

public class Sentences{
    Punctuation[] punctuation;
    public static Words[] words;
    public  String sentt;
    public int qunt;
    public Sentences (String sent){
        sentt = sent;
        String punctuation_symbols = ".!,-?";
        sent = sent.replaceAll("[\\s]{2,}", " ");
        String [] splited_sentence = sent.split("(?=,|\\.|\\,|\\S+\\-+\\s|!|\\?)|\\s");
        int counter_puncts = 0;
        int counter_words = 0;
        for (int i = 0; i < splited_sentence.length; i++) {
            if(punctuation_symbols.contains(splited_sentence[i])){
                if(!splited_sentence[i].equals("")){
                    punctuation = addPuncts(counter_puncts, punctuation, splited_sentence[i]);
                    counter_puncts+=1;
                }

            }
            else{
                words = addWord(counter_words, words, splited_sentence[i]);
                counter_words+=1;
            }
        }


        qunt=counter_words;
    }
    public static Punctuation[] addPuncts(int n, Punctuation[] arr, String x)
    {
        int i;

        // create a new array of size n+1
        Punctuation[] newarr = new Punctuation[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = new Punctuation(x);

        return newarr;
    }
    public static Words[] addWord(int n, Words[] arr, String x)
    {
        int i;

        // create a new array of size n+1
        Words[] newarr = new Words[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = new Words(x);

        return newarr;
    }
}

