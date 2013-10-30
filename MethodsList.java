import SupportPackage.ArgsProcessor;
import java.io.DataInputStream;	
import java.io.FileInputStream;



public class MethodsList{
	// establishes the traits of the problem

<<<<<<< HEAD
	private int a; // equivalent to [l][0]
	private int c; // equivalent to [l][1]
	private int e; // equivalent to [l][2]
	private int g; // equivalent to [l][3]
	private int i; // equivalent to [l][4]
	private int k; // equivalent to [l][5]
	private int Problem1 []= new int [6];
	
	
	
	private int b; // equivalent to [l+1][0]
=======
	/*private int a; // equivalent to [l][0]  1-0
	private int c; // equivalent to [l][1]   1-1
	private int e; // equivalent to [l][2]  1-2
	private int g; // equivalent to [l][3]  1-3
	private int i; // equivalent to [l][4]  1-4
	private int k; // equivalent to [l][5]*/  //1-5
	private int Problem1 []= new int [6];



	/*private int b; // equivalent to [l+1][0] follow pattern as above
>>>>>>> e2d20af96e4174a611ba7b60a34a6bdbd90fb732
	private int d; // equivalent to [l+1][1]
	private int f; // equivalent to [l+1][2]
	private int h; // equivalent to [l+1][3]
	private int j; // equivalent to [l+1][4]
<<<<<<< HEAD
	private int n; // equivalent to [l+1][5]

	//A Problem has 6 traits: a P/NP value, best case, average case, worst case, run time constant and lines of code
	
	public int [] Prob1 (){

		return this.Problem1;
		
	}
	
	public int [] Problem2(int b,int d, int f, int h, int j, int n){
		int[]  secondProblem= new int[]{b,d,f,h,n};
		return secondProblem;
	}
	
	// Problems also have a set distance from another problem

	public boolean firstComparison(){
		if (a<b||a==b){
			return false;
		}return true;
	}

	public boolean secondComparison(){
		if (c<d||c==d){
			return false;
		}return true;
	}

	public boolean thirdComparison (){
		if (e<f||e==f){
			return false;
		}return true;
	}

	public boolean fourthComparison (){
		if (g<h||g==h){
			return false;
		}return true;
	}

	public boolean fifthComparison (){
		if (i<j||i==j){
			return false;
		}return true;
	}

	public boolean sixthComparison ({

		if (k<n||k==n){
			return false;
		}return true;
	}

	
=======
	private int n; // equivalent to [l+1][5]*/
	private int Problem2 [] = new int[6];

	//A Problem has 6 traits: a P/NP value, best case, average case, worst case, run time constant and lines of code
	
	/**
	 * 
	 * @param p1=the parent array for this.Problem1[];
	 * @param p2=the parent array for this.Problem2[];
	 * <p> use this if you pass an independent array for problem 1 and 2
	 */
	public MethodsList(int[] p1, int[] p2) 
	{
		for(int i = 0; i<6; i++) 
		{
			this.Problem1[i]=p1[i];
			this.Problem2[i]=p2[i];
		}
	}
	
	/**
	 * 
	 * @param intake a parent array for both Problem arrays
	 * @param k the index of the parent array (within intake) for this.Problem1
	 * 
	 * <p>this.Problem2[] is taken from intake[k+1]
	 * this is defined as Channing had originally set it up
	 * <p>Use this to pass a single 2D array as a parent for both arrays
	 */
	public MethodsList(int[][] intake, int k)
	{
		for(int i = 0; i<6; i++)
		{
			this.Problem1[i]=intake[k][i];
			this.Problem2[i]=intake[k+1][i];
		}
	}
	
	

	public int [] Prob1 (){

		return this.Problem1;

	}

	public int [] Prob2(){
		return this.Problem2;
	}

	// Problems also have a set distance from another problem

	/**
	 * 
	 * @param num the index to be compared between Problem1[] and Problem2[]
	 * @return (!(a is less than b || a equals b))
	 * <p> where a=this.Problem1[num]
	 * b=this.Problem2[num];
	 */
	public boolean Comparison(int num)
	{
		if(num<0 || num>5) return false;
		int a = this.Problem1[num];
		int b = this.Problem2[num];
		return(!(a<b||b==a));
	}


>>>>>>> e2d20af96e4174a611ba7b60a34a6bdbd90fb732

















}