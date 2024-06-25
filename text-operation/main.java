public class main{
    public static void main(String[] args){
        String text ="""
            OMG!!! Did you see that 2+2=4???? It's like, so totally amazingggggg!!!! Loveeee itttt!!!! Can't
            believe it's so simple, LOL!!! :)
            Hey @User123, check out this link: https://www.example.com/ It's like, the best website to
             download Taylor swift songs everrrrr!!! :D :D
            Me encanta la música de Taylor Swift, es tan increíble, ¿no crees? Y sus conciertos son OMG!!! :O
            :O
            I just finished listening to taylor swift - soooooo good!!! Can't wait to start the whole album!!! :) :)
            
            Dude, that album was EPIC!!!! I mean, explosions everywhere!!! And the beats? O_O Mind-
            blowing!!! :O :O
            
            LOL, can't believe it's already 3:45 AM!!! Time flies when you're having fun, am I right? XD XD
            XD :D 
                """;
       
            String [] words;
             textclear.lower(text);
             textclear.remove_punc();
             textclear.num_remove(); 
             textclear. contractions();
             textclear.space_remove();
             words = textclear.change_word();

            text_operation.dictionary(words);
            
                
         

    }
}