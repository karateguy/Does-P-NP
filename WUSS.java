import SupportPackage.*;
import java.io.*;
import java.util.Arrays;
public class WUSS 
{

	public static double[] engine(String[] args) throws IOException
	{
		ArgsProcessor ap = new ArgsProcessor(args);
		final int _K = ap.nextInt("K-Size");
		int _W = ap.nextInt("W-size (0 for default)");
		DocData doc1= new DocData(ap.nextString("File 1 location"), _K, _W);
		DocData doc2= new DocData(ap.nextString("File 2 location"), _K, _W);
		int minsize=0;
		DocData maxdoc=null;
		DocData mindoc=null;
		if(doc1.hashprints.length > doc2.hashprints.length) 
		{
			maxdoc=new DocData(doc1);
			mindoc=new DocData(doc2);
			minsize=doc2.hashprints.length;
		}
		else 
		{
			maxdoc=new DocData(doc2);
			mindoc=new DocData(doc1);
			minsize=doc1.hashprints.length;
		}
		int matches=0;
		for(int i = 0; i<minsize; i++)
		{
			int seekindex = Arrays.binarySearch(maxdoc.hashprints, mindoc.hashprints[i]);
			if(seekindex>=0 && seekindex<maxdoc.hashprints.length /*&& mindoc.hashprints[i]==maxdoc.hashprints[seekindex]*/) matches++;
		}
		int truesize=matches; //for compatibility
		double fscore = ((double)truesize)/maxdoc.hashprints.length;
		double lscore = (1.0-((double)Math.abs(maxdoc.docsize-mindoc.docsize)/maxdoc.docsize));
		//lscore/=doc1.docsize;
		lscore=Math.abs(lscore);
		double avgDist=0.0;
		/*for(int i=0; i<truesize; i++)
		{
			double rel_a= ((double)printmatches[0][i].loc);
			rel_a/=(double)mindoc.fingerprints.length;
			double rel_b= ((double)printmatches[1][i].loc);
			rel_b/=(double)maxdoc.fingerprints.length;
			//System.out.println(""+rel_a+"   "+rel_b);
			//System.out.println(""+(double)(Math.abs(rel_a-rel_b)));
			double blerg=((double)(Math.abs(rel_a-rel_b)));
			blerg/=rel_b;
			//System.out.println(blerg);
			if(Double.isNaN(blerg)) blerg=0.0;
			avgDist+=blerg;
		}
		//System.out.println(avgDist);
		avgDist/=truesize;*/
		System.out.println("Fingerprinting score= "+(100.0*fscore)+"% similar ("+truesize+" matches)");
		//System.out.println("Fingerprint location score= "+(100.0*avgDist)+"%");
		System.out.println("Length score= "+(100.0*lscore)+"% similarity in length");
		double decision=(fscore-(avgDist/4.0))*.85;
		decision+=lscore*.15;
		System.out.println("Decision score: "+decision);
		String comment;
		if(decision>=.75) comment="Files are EXTREMELY similar (files are likely to be identical)";
		else if(decision>=0.5) comment="Files have high similarity (files may be identical)";
		else if(decision>=(1.0/3.0)) comment="Files show significant similarity";
		else if(decision>=.25) comment="Files may share certain components";
		else if(decision>=0.1) comment="Files show little resemblance";
		else comment="Files show almost no similarity";
		System.out.println(comment);
		double output[]= {fscore, avgDist, lscore, decision};
		return output;
		
	}

	public static void main(String[] args)
	{
		try
		{
			engine(args);
		}
		catch(IOException problem)
		{
			System.out.println("Encountered an I/O Exception.  Program terminated");
		}
	}

	public static void dumper(String[] args, String dumpPath)
	{
		PrintWriter out = null;
		try
		{
			double [] reciever = engine(args);
			out=new PrintWriter(new FileWriter(dumpPath));
			for(int i = 0; i<4; i++) out.write(""+reciever[i]+" ");
		}
		catch(IOException problem)
		{
			System.out.println("Encountered an I/O Exception.  Program terminated");
		}
		finally
		{
			out.close();
		}
	}
}
