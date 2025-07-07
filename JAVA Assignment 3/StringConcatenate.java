public class StringConcatenate 
{
    public static void main(String[] args)
    {
        String s1 = "Hello ";
        String s2 = "World ";
        String s3 = "Java";

        long start1 = System.nanoTime();
        String result1 = s1 + s2 + s3;
        long end1 = System.nanoTime();
        System.out.println("Concatenated using + operator: " + result1);
        System.out.println("Time taken with + operator: " + (end1 - start1) + " ns");

        long start2 = System.nanoTime();
        StringBuilder sb1 = new StringBuilder();
        sb1.append(s1).append(s2).append(s3);
        String result2 = sb1.toString();
        long end2 = System.nanoTime();
        System.out.println("Concatenated using StringBuilder: " + result2);
        System.out.println("Time taken with StringBuilder: " + (end2 - start2) + " ns");

        long start3 = System.nanoTime();
        StringBuffer sb2 = new StringBuffer();
        sb2.append(s1).append(s2).append(s3);
        String result3 = sb2.toString();
        long end3 = System.nanoTime();
        System.out.println("Concatenated using StringBuffer: " + result3);
        System.out.println("Time taken with StringBuffer: " + (end3 - start3) + " ns");
    }
}