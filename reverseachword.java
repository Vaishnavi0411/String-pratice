public class Reverseword {
    public static void main(String[]args)
    {
        String str= "Think Twice";               //Original String
        String[] words =str.split(" ");    //Splliting string into words
        String reverseString ="";

        for(String w:words)
        {
            String reverseword="";
            for(int i=w.length()-1;i>=0;i--)
            {
                reverseword= reverseword+w.charAt(i);
            }
        
        reverseString= reverseString+ reverseword+"  ";
        }
        System.out.println(reverseString);
}
}