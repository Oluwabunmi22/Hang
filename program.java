public class Program 
{
    public static void main(String[] args) 
    {
        String slack="@Oluwabunmi", twitter="@Firstlady1";
        int count=0, i;
        System.out.println( "Oluwabunmi Adeniyi");
        System.out.println ("oluwabunmipra@gmail.com");
        System.out.println ("@Oluwabunmi");
        System.out.println ("Public Health and Genomic Epidemiology");
        System.out.println ("FirstLady1")
        for(i=0;i<slack.length();i++)
        {
            if(slack.charAt(i)!=twitter.charAt(i))
            count++;
        }
        System.out.println("Hamming Distance: "+count);
    }
}
