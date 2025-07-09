public class StringConcatenate {
    public static void main(String[] args) {
        String string1 = "Hello ";
        String string2 = "World ";
        String string3 = "Java";

        long start1 = System.nanoTime();
        String result1 = string1 + string2 + string3;
        long end1 = System.nanoTime();
        System.out.println("Concatenated using + operator : " + result1);
        System.out.println("Time taken with + operator : " + (end1 - start1) + " ns");

        long start2 = System.nanoTime();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(string1).append(string2).append(string3);
        String result2 = stringBuilder1.toString();
        long end2 = System.nanoTime();
        System.out.println("Concatenated using StringBuilder : " + result2);
        System.out.println("Time taken with StringBuilder : " + (end2 - start2) + " ns");

        long start3 = System.nanoTime();
        StringBuffer stringBuilder2 = new StringBuffer();
        stringBuilder2.append(string1).append(string2).append(string3);
        String result3 = stringBuilder2.toString();
        long end3 = System.nanoTime();
        System.out.println("Concatenated using StringBuffer : " + result3);
        System.out.println("Time taken with StringBuffer : " + (end3 - start3) + " ns");
    }
}