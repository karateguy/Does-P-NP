public class DistanceFinder {

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

			if(string2==ok){
				bestCaseValue[i]=0;
			}else if(string2=oLogLogN){
				bestCaseValue[i]=1;
			} else if(string2=oLogN){
				bestCaseValue[i]=2;
			}else if(string2=oNC){
				bestCaseValue[i]=3;
			}else if(string2=oN){
				bestCaseValue[i]=4;
			}else if(string2=oNLogStarN){
				bestCaseValue[i]=5;
			}else if(string2=oNLogN){
				bestCaseValue[i]=6;
			}else if(string2=oNK){
				bestCaseValue[i]=7;
			}else if(string2=oCN){
				bestCaseValue[i]=8;
			}else if(string2=oNFactorial){
				bestCaseValue[i]=9;
			}

			String string3 = ap.nextString("Average Case Run Time?");

			if(string3=ok){
				averageCaseValue[i]=0;
			}else if(string3=oLogLogN){
				averageCaseValue[i]=1;
			} else if(string3=oLogN){
				averageCaseValue[i]=2;
			}else if(string3=oNC){
				averageCaseValue[i]=3;
			}else if(string3=oN){
				averageCaseValue[i]=4;
			}else if(string3=oNLogStarN){
				averageCaseValue[i]=5;
			}else if(string3=oLogLogN){
				averageCaseValue[i]=6;
			}else if(string3=oNK){
				averageCaseValue[i]=7;
			}else if(string3=oCN){
				averageCaseValue[i]=8;
			}else if(string3=oNFactorial){
				averageCaseValue[i]=9;
			}

			String string4 = ap.nextString("Worst Case Run Time?");

			if(string4=ok){
				worstCaseValue[i]=0;
			}else if(string4=oLogLogN){
				worstCaseValue[i]=1;
			} else if(string4=oLogN){
				worstCaseValue[i]=2;
			}else if(string4=oNC){
				worstCaseValue[i]=3;
			}else if(string4=oN){
				worstCaseValue[i]=4;
			}else if(string3=oNLogStarN){
				worstCaseValue[i]=5;
			}else if(string4=oLogLogN){
				worstCaseValue[i]=6;
			}else if(string4=oNK){
				worstCaseValue[i]=7;
			}else if(string4=oCN){
				worstCaseValue[i]=8;
			}else if(string4=oNFactorial){
				worstCaseValue[i]=9;
			}

			String string5 = ap.nextString("Lines of Code");
			linesOfCodeValue[i]=string5;

			double string6 = ap.nextString("Run Time Constant");
			runtimeConstantValue[i]=string6;
			Math.round(string6);
			System.out.println(i + ", " + pOrNPValue[j]+ ", " + bestCaseValue[j]+ ", " + averageCaseValue[j]+ ", " + worstCaseValue[j]+ ", " + linesOfCodeValue[j] + ", " + runtimeConstantValue[j]);
		}


		double one =  pOrNPValue[i];
		double two = (double) bestCaseValue[i];
		double three = (double) averageCaseValue[i];
		double four = (double) worstCaseValue[i];
		double five = (double) linesOfCodeValue[i];
		double six = (double) runtimeConstantValue[i];

		



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
