public class SentenceAnalysis
{
    public static void main(String[] args)
    {
        String sentence = "Learning Java is fun and interesting";

        String[] words = sentence.split(" ");
        System.out.println("Number of words: " + words.length);

        int firstIndexofI = sentence.indexOf("i");
        int lastIndexofI = sentence.lastIndexOf("i");

        System.out.println("First occurrence of 'i' : " + firstIndexofI);
        System.out.println("Last occurrence of 'i' : " + lastIndexofI);
        System.out.println("Sentence Starts with : " + sentence.startsWith("Learn"));
        System.out.println("Sentence Ends with : " + sentence.endsWith("ing"));
    }
}