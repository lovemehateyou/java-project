
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
public class text_operation {
    public static ArrayList<String> dictionary(String []input){
        String[] punc = {"the","in","of","it", "it's","so","a", "","to","no","if","of","d","omg","lol","am","i","that","can't","and"};
        int count = 0;
        ArrayList <String> res = new ArrayList<>();

        Map<String, Integer> worddic = new LinkedHashMap<>();
        for(String word: input){
            if(worddic.containsKey(word)){
                worddic.put(word, worddic.get(word) + 1);
            }
            else{
                worddic.put(word,  1);
        }
    }
    for( int i = 0; i<punc.length;i++){
        worddic.remove(punc[i]);
    }
     
    for (Map.Entry<String, Integer> entry : worddic.entrySet()) {
            if(entry.getValue() > 0 && entry.getKey().length() > 4 && count < 10){
                res.add(entry.getKey()) ; 
                count++;  
        }
        else{
            continue;
        }
       
        
    }

    return res;
}

}
