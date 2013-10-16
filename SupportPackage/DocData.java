package SupportPackage;

import java.io.*;
import java.util.Arrays;

public class DocData {

	public piece[] fingerprints;
	public int docsize;
	private String normalized;
	public static String normalize(String bad)
	{
		String lower = bad.toLowerCase();
		String last="";
		String next=lower;
		do
		{
			last=next;
			next=next.replaceAll(" ", "");
			//next=next.replaceAll(" \n", " ");
			next=next.replaceAll("\n", "");
		}
		while(next!=last);
		return next;
	}
	public static String[] namezipper(piece[] pieces)
	{
		String [] names = new String[pieces.length];
		for(int i=0; i<pieces.length; i++) names[i]=new String(pieces[i].val);
		return names;
	}
	public static int[] loczipper(piece[] pieces)
	{
		int [] locs =new int[pieces.length];
		for(int i=0; i<pieces.length; i++) locs[i]=pieces[i].loc;
		return locs;
	}
	public static piece[] unduplicate(piece[] first)
	{
		piece[] intermediate = new piece [first.length];
		int []namezip = loczipper(first);
		int rems=0;
		intermediate[first.length-1]= new piece();
		intermediate[first.length-1]=first[first.length-1];
		for(int i=0; i<first.length-1; i++)
		{
			boolean unique=Arrays.asList(Arrays.copyOfRange(namezip, i+1, first.length)).contains(first[i].loc);
			unique=!unique;
			if(unique) intermediate[i]=new piece(first[i]);
			else
			{
				intermediate[i]=new piece();
				rems++;
			}
		}
		int reindex=0;
		piece[] result = new piece[first.length-rems];
		for(int i=0; i<result.length; i++)
		{
			//System.out.println(i);
			while(intermediate[i+reindex].val=="") reindex++;
			result[i]=new piece(intermediate[i+reindex]);
			//System.out.println(result[i].val);

		}
		//System.out.println(result.length);
		return result;

	}


	public DocData(String path, int ksize, int windowsize) throws IOException
	{
		BufferedReader in =null;
		String raw="";
		try
		{
			in=new BufferedReader(new FileReader(path));
			String line="";
			line=in.readLine();
			while(line!=null)
			{
				raw+="\n"+line;
				line=in.readLine();
			}
		}
		finally
		{
			in.close();
		}
		if(windowsize==0) windowsize= (int) (0.5*ksize)+1;
		normalized=normalize(raw);
		docsize = normalized.length();
		String [] grams = new String[normalized.length() - ksize];
		for(int i =0; i<grams.length; i++)
		{
			char [] gram  = new char [ksize];
			for(int j=0; j<ksize; j++) gram[j]=normalized.charAt(i+j);
			grams[i]=new String(gram);
		}
		piece [] temp = new piece[grams.length - windowsize];
		int shortener=0;
		for(int i=0; i<temp.length; i++)
		{
			temp[i]= new piece();
			int myindex=((int) (Math.random()*windowsize))+i;
			//System.out.println(""+myindex+"  :  "+grams[myindex]);
			if(grams[myindex]=="") 
			{
				shortener++;
				continue;
			}
			temp[i].val=grams[myindex];
			grams[myindex]="";
			temp[i].loc=myindex;
		}
		fingerprints = new piece[temp.length-shortener];
		int reindex=0;
		for(int i=0; i<fingerprints.length; i++)
		{
			while(temp[i+reindex].val=="") reindex++;
			fingerprints[i]=new piece(temp[i+reindex]);
		}
		System.out.println("Created "+fingerprints.length+" unique ingerprints.");
	}
	public DocData(DocData parent)
	{
		fingerprints=new piece[parent.fingerprints.length];
		for(int i=0; i<parent.fingerprints.length; i++)
		{
			fingerprints[i]=new piece();
			fingerprints[i].val=new String(parent.fingerprints[i].val);
			fingerprints[i].loc=parent.fingerprints[i].loc;
		}
		docsize=parent.docsize;
		normalized=new String(parent.normalized);
	}

}
