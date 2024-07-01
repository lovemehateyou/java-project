import java.lang.String;

public class textclear {

static String [] words; 
 
public static void lower(String input) {
        // code to split the string into words and store in an array.
         words = input.toLowerCase().trim().split(" ");
       
}

public static void remove_punc(){
    String[] punc = {"!",",", ";","?", "/", ":)","@", "//", ".","+", "-", "*", "=", "(", ")", ":o", "o_o","¿",":",":d","xd"};
    for(int j = 0; j<words.length;j++){
        String word = words[j];
        for (int i = 0;i<punc.length;i++){
                word=word.replace(punc[i]," ");
        }
        words[j] = word;
    } 
       
}

    public static void num_remove(){
        for(int j = 0; j<words.length;j++){
            String word = words[j];
            for (int i = 0;i<word.length();i++){
                if (Character.isDigit(word.charAt(i))){
                    word = word.substring(0,i)+word.substring(i+1,word.length());
                    i--;
                }
                else{
                   continue;
            }
        }
        words[j] = word;
    }
     
}

    public static void  contractions(){
        int count = 0;
        for(int j = 0; j<words.length;j++){
            String word = words[j];
            for(int i = word.length()-1;i > 0; i--){
                if(word.charAt(i) == word.charAt(i-1) && word.charAt(i) != ' ' ){
                    count++;
                    if(count < 3){
                        continue;
                    }  
                    else{
                        word = word.replace(word.charAt(i), ' ') + word.charAt(i);
                    } 
            }
                else{
                    continue;
            }
        }
        count = 0;
        words[j] = word ;  
        
    }  

     
} 

public static void space_remove(){
    for (int i = 0; i < words.length; i++) {
        words[i] = words[i].replaceAll(" ", "");
    }

}

public static String [] change_word(){
     for(int j = 0; j<words.length;j++){
         String word = words[j].toString();
         if(word.equals("omg ")){
           word = word.replace(word,"oh my god");
           words[j] = word;
         }
         if(word.equals("lol ")){
           word = word.replace(word,"laugh out loud");
           words[j] = word;
         }
       
     }

     return words;
   
}



}


