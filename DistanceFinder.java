public class DistanceFinder {
	public static void main(String[] args) {
		
		//Issues I found:
		//1)import the argsprocessor from the CSE repos
		//2)on line 151, you reference 'j' which does not exist.  did you mean 'i' from the encompassing FOR loop?
		//3)you have multiple errors from lines 168 to 179 where you reference variables which are not yet defined
		//--Aaron
		
		//ap.nextInt numberOfProblems= ap.nextInt("How many problems are there?")
		int numberOfProblems = 20;
		int i=0;
		int [] pOrNPValue = new int [numberOfProblems];
		int [] bestCaseValue = new int [numberOfProblems];
		int [] averageCaseValue = new int [numberOfProblems];
		int [] worstCaseValue = new int [numberOfProblems];
		int [] linesOfCodeValue = new int [numberOfProblems];
		int [] runtimeConstantValue = new int [numberOfProblems];

		int ok = 0;
		int oLogLogN=1;
		int oLogN=2;
		int oNC=3;
		int oN=4;
		int oNLogStarN=5;
		int oNLogN=6;
		int oLogNFactorial=oNLogN;
		int oNK=7;
		int oCN=8;
		int oNFactorial=9;{

			for (i=0;i<numberOfProblems;i++){

				String string1= ap.nextString("P or NP?");
				if(string1=P){
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

					int string3 = ap.nextString("Average Case Run Time?");

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
					int string4 = ap.nextString("Worst Case Run Time?");

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

					int string5 = ap.nextString("Lines of Code");
					linesOfCodeValue[i]=string5;

					int string6 = ap.nextString("Run Time Constant");
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


				double pOrNPDistance = (double) Math.abs(Math.pow((x2-x1),2));
				double BestCaseDistance = (double) Math.abs(Math.pow((y2-y1),2));
				double AverageCaseDistance = (double) Math.abs(Math.pow((z2-z1),2));
				double WorstCaseDistance = (double) Math.abs(Math.pow((z2-z1),2));
				double linesOfCodeDistance = (double) Math.abs(Math.pow((z2-z1),2));
				double runTimeConstantDistance = (double) Math.abs(Math.pow((z2-z1),2));





				double totalDistance = (double) Math.sqrt(yDistance+xDistance+zDistance);
			}
			//else if(x1=originX && y1=originY && z1=originZ){
			//double xDistance = (double) Math.abs(Math.pow((x2),2));
			//double yDistance = (double) Math.abs(Math.pow((y2),2));
			//double zDistance = (double) Math.abs(Math.pow((z2),2));
			//double finalDistance = (double) Math.sqrt(yDistance+xDistance);
			//}else if (x2=originX && y2=originY && z2=originZ){
			//double xDistance = (double) Math.abs(Math.pow((x1),2));
			//double yDistance = (double) Math.abs(Math.pow((y1),2));
			//double zDistance = (double) Math.abs(Math.pow((z1),2));
			//double finalDistance = (double) Math.sqrt(yDistance+xDistance);
			//}

			System.out.println("Distance between points = " + totalDistance);


		}
	}
}
