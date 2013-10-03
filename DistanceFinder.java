import java.util.Arrays;
import SupportPackage.ArgsProcessor;

public class DistanceFinder {
	public static void main(String[] args) {

		//Issues I found:
		//1)import the argsprocessor from the CSE repos
		//2)on line 151, you reference 'j' which does not exist.  did you mean 'i' from the encompassing FOR loop?
		//3)you have multiple errors from lines 168 to 179 where you reference variables which are not yet defined
		//--Aaron
		ArgsProcessor ap = new ArgsProcessor(args);
		int numberOfProblems= ap.nextInt("How many problems are there?");
		//int numberOfProblems = 20;
		//int i=0; <-i'm deleting this because you only use it within the FOR loop as an iterator
		int [] pOrNPValue = new int [numberOfProblems];
		int [] bestCaseValue = new int [numberOfProblems];
		int [] averageCaseValue = new int [numberOfProblems];
		int [] worstCaseValue = new int [numberOfProblems];
		int [] linesOfCodeValue = new int [numberOfProblems];
		int [] runtimeConstantValue = new int [numberOfProblems];
		
		//Note: these numbers CANNOT be changed mid program
		final int ok = 0;
		final int oLogLogN=1;
		final int oLogN=2;
		final int oNC=3;
		final int oN=4;
		final int oNLogStarN=5;
		final int oNLogN=6;
		final int oLogNFactorial=oNLogN;
		final int oNK=7;
		final int oCN=8;
		final int oNFactorial=9;

		for (int i=0;i<numberOfProblems;i++){

			String string1= ap.nextString("P or NP?");
			if(string1=="P"){
				pOrNPValue[i]=0;
			}else{
				pOrNPValue[i]=1;


				int string2 = ap.nextInt("Best Case Run Time?");

				switch(string2)
				{
				case ok:
					bestCaseValue[i]=0;
					break;
				case oLogLogN:
					bestCaseValue[i]=1;
					break;
				case oLogN:
					bestCaseValue[i]=2;
					break;
				case oNC:
					bestCaseValue[i]=3;
					break;
				case oN:
					bestCaseValue[i]=4;
					break;
				case oNLogStarN:
					bestCaseValue[i]=5;
					break;
				case oNLogN:
					bestCaseValue[i]=6;
					break;
				case oNK:
					bestCaseValue[i]=7;
					break;
				case oCN:
					bestCaseValue[i]=8;
					break;
				case oNFactorial:
					bestCaseValue[i]=9;
					break;
				}

				int string3 = ap.nextInt("Average Case Run Time?");

				switch(string3)
				{
				case ok:
					averageCaseValue[i]=0;
					break;
				case oLogLogN:
					averageCaseValue[i]=1;
					break;
				case oLogN:
					averageCaseValue[i]=2;
					break;
				case oNC:
					averageCaseValue[i]=3;
					break;
				case oN:
					averageCaseValue[i]=4;
					break;
				case oNLogStarN:
					averageCaseValue[i]=5;
					break;
				case oNLogN:
					averageCaseValue[i]=6;
					break;
				case oNK:
					averageCaseValue[i]=7;
					break;
				case oCN:
					averageCaseValue[i]=8;
					break;
				case oNFactorial:
					averageCaseValue[i]=9;
					break;
				}
				int string4 = ap.nextInt("Worst Case Run Time?");

				switch(string4)
				{
				case ok:
					worstCaseValue[i]=0;
					break;
				case oLogLogN:
					worstCaseValue[i]=1;
					break;
				case oLogN:
					worstCaseValue[i]=2;
					break;
				case oNC:
					worstCaseValue[i]=3;
					break;
				case oN:
					worstCaseValue[i]=4;
					break;
				case oNLogStarN:
					worstCaseValue[i]=5;
					break;
				case oNLogN:
					worstCaseValue[i]=6;
					break;
				case oNK:
					worstCaseValue[i]=7;
					break;
				case oCN:
					worstCaseValue[i]=8;
					break;
				case oNFactorial:
					worstCaseValue[i]=9;
					break;
				}

				int string5 = ap.nextInt("Lines of Code");
				linesOfCodeValue[i]=string5;

				int string6 = ap.nextInt("Run Time Constant");
				runtimeConstantValue[i]=string6;
				Math.round(string6);
				System.out.println(i + ", " + pOrNPValue[i]+ ", " + bestCaseValue[i]+ ", " + averageCaseValue[i]+ ", " + worstCaseValue[i]+ ", " + linesOfCodeValue[i] + ", " + runtimeConstantValue[i]);
			}


			double one =  pOrNPValue[i];
			double two = (double) bestCaseValue[i];
			double three = (double) averageCaseValue[i];
			double four = (double) worstCaseValue[i];
			double five = (double) linesOfCodeValue[i];
			double six = (double) runtimeConstantValue[i];



			// here the program needs to take the elements of two random problems that are input into the system

		}
		int [][] probs = new int[numberOfProblems][6];
		for(int i = 0; i<numberOfProblems; i++)
		{
			probs[i][0]=pOrNPValue[i];
			probs[i][1]=bestCaseValue[i];
			probs[i][2]=averageCaseValue[i];
			probs[i][3]=worstCaseValue[i];
			probs[i][4]=linesOfCodeValue[i];
			probs[i][5]=runtimeConstantValue[i];
		}
		double [][] distance = new double [numberOfProblems][numberOfProblems];
		//speaking of inefficiency....look at this next part
		for(int i = 0; i<numberOfProblems; i++)
		{
			Arrays.fill(distance[i], Double.NaN); //REMEMBER
			for(int j = (i+1); j<numberOfProblems; j++) //REMEMBER
			{
				double dist = 0.0;
				for(int k=0; k<6; k++)
				{
					dist+=Math.pow( (double) (probs[i][k]-probs[j][k]) , 2.0);
				}
				distance[i][j]=Math.sqrt(dist);
				System.out.println("Distance between points = " + distance[i][j] );
			}
		}
		


	}
}
