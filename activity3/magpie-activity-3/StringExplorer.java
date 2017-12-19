/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White & Christopher Cameron
 * @version December 2017
 */
public class StringExplorer
{

    /**
     * Tests various string methods
     */
    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";

        //  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);

		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);

		//Another indexOf test
		int notFoundPsn = sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);

		int asdf = sample.indexOf("he", 8);
		System.out.println("sample.indexOf(\"he\") = " + asdf);

		//  Try other methods here:
	}
}
