import SupportPackage.ArgsProcessor;
import java.io.DataInputStream;	
import java.io.FileInputStream;



public class MethodsList{
	// establishes the traits of the problem

	private int a; // equivalent to [l][0]
	private int c; // equivalent to [l][1]
	private int e; // equivalent to [l][2]
	private int g; // equivalent to [l][3]
	private int i; // equivalent to [l][4]
	private int k; // equivalent to [l][5]
	private int Problem1 []= new int [6];
	
	
	
	private int b; // equivalent to [l+1][0]
	private int d; // equivalent to [l+1][1]
	private int f; // equivalent to [l+1][2]
	private int h; // equivalent to [l+1][3]
	private int j; // equivalent to [l+1][4]
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

	

















}