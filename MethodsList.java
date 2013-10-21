import SupportPackage.ArgsProcessor;
import java.io.DataInputStream;	
import java.io.FileInputStream;


public class MethodsList {

	public static void main(String[] args) {
		DataInputStream reader = new DataInputStream(new FileInputStream("DistanceOutput.txt"));

		int numberOfProblems = l;



		int [][]PProblems = new int [l][6];
		int [][]PProblems2 = new int [l+1][6];
		int [][] Problem2 = new int [m][6];

		int oldx=PProblems[l][0];
		int oldy=PProblems[l+1][0];

		int olda=PProblems[l][1];
		int oldb=PProblems[l+1][1];

		int oldc=PProblems[l][2];
		int oldd=PProblems[l+1][2];

		int olde=PProblems[l][3];
		int oldf=PProblems[l+1][3];

		int oldg=PProblems[l][4];
		int oldh=PProblems[l+1][4];

		int oldj=PProblems[l][5];
		int oldk=PProblems[l+1][5];

		int intermidiatex = 0;
		int intermidiatey = 0;

		int intermidiatea = 0;
		int intermidiateb = 0;

		int intermidiatec = 0;
		int intermidiated = 0;

		int intermidiatee = 0;
		int intermidiatef = 0;

		int intermidiateg = 0;
		int intermidiateh = 0;

		int intermidiatej = 0;
		int intermidiatek = 0;
	}


	public static boolean movement1 (int x, int y){

		int intermidiatex = 0;
		int intermidiatey = 0;
		int intermidiatea = 0;
		int intermidiateb = 0;
		int intermidiatec = 0;
		int intermidiated = 0;
		int intermidiatee = 0;
		int intermidiatef = 0;
		int intermidiateg = 0;
		int intermidiateh = 0;
		int intermidiatej = 0;
		int intermidiatek = 0;

		if ((x==y)||(x<y)){
			return true;
		}else{
			return false;
		}
		if (movement1 == false){
			y= intermidiatex+oldx;
			x= intermidiatey+oldy;
			int a= intermidiateb+oldb;
			int b= intermidiatea+olda;
			int c= intermidiated+oldd;
			int d= intermidiatec+oldc;
			int e= intermidiatef+oldf;
			int f= intermidiatee+olde;
			int g= intermidiateh+oldh;
			int h= intermidiateg+oldg;
			int j= intermidiatek+oldk;
			int k= intermidiatej+oldj;

		}
	}

	public static boolean movement2 (int a, int b){

		if ((a==b||a<b)&& (movement1==true)){
			return true;
		}else{
			return false;
		}
		if (movement2 == false){
			int intermidiatea = 0;
			int intermidiateb = 0;
			int intermidiatec = 0;
			int intermidiated = 0;
			int intermidiatee = 0;
			int intermidiatef = 0;
			int intermidiateg = 0;
			int intermidiateh = 0;
			int intermidiatej = 0;
			int intermidiatek = 0;
			
			int a= intermidiateb+oldb;
			int b= intermidiatea+olda;
			int c= intermidiated+oldd;
			int d= intermidiatec+oldc;
			int e= intermidiatef+oldf;
			int f= intermidiatee+olde;
			int g= intermidiateh+oldh;
			int h= intermidiateg+oldg;
			int j= intermidiatek+oldk;
			int k= intermidiatej+oldj;
		}
	}

	public static boolean movement3 (int c, int d){

		if ((c==d||c<d)&& (movement1==true)&& (movement2==true)){
			return true;
		}else{
			return false;
		}
		if (movement2 == false){
			int intermidiatec = 0;
			int intermidiated = 0;
			int intermidiatee = 0;
			int intermidiatef = 0;
			int intermidiateg = 0;
			int intermidiateh = 0;
			int intermidiatej = 0;
			int intermidiatek = 0;
			
			int c= intermidiated+oldd;
			int d= intermidiatec+oldc;
			int e= intermidiatef+oldf;
			int f= intermidiatee+olde;
			int g= intermidiateh+oldh;
			int h= intermidiateg+oldg;
			int j= intermidiatek+oldk;
			int k= intermidiatej+oldj;
		}
	}
	public static boolean movement4 (int e, int f){

		if ((e==f||e<f)&& (movement1==true)&& (movement2==true)&& movement3==true){
			return true;
		}else{
			return false;
		}
		if (movement4 == false){
			int intermidiatee = 0;
			int intermidiatef = 0;
			int intermidiateg = 0;
			int intermidiateh = 0;
			int intermidiatej = 0;
			int intermidiatek = 0;
			
			int e= intermidiatef+oldf;
			int f= intermidiatee+olde;
			int g= intermidiateh+oldh;
			int h= intermidiateg+oldg;
			int j= intermidiatek+oldk;
			int k= intermidiatej+oldj;
		}
	}
	public static boolean movement4 (int g, int h){

		if ((e==f||e<f)&& (movement1==true)&& (movement2==true)&& movement3==true){
			return true;
		}else{
			return false;
		}
		if (movement4 == false){
			int intermidiateg = 0;
			int intermidiateh = 0;
			int intermidiatej = 0;
			int intermidiatek = 0;
			
			int g= intermidiateh+oldh;
			int h= intermidiateg+oldg;
			int j= intermidiatek+oldk;
			int k= intermidiatej+oldj;
		}
}
	public static boolean movement5 (int j, int k){

		if ((j==k||j<k)&& (movement1==true)&& (movement2==true)&& (movement3==true)&& (movement4==true)){
			return true;
		}else{
			return false;
		}
		if (movement5 == false){
		
			int intermidiatej = 0;
			int intermidiatek = 0;
	
			int j= intermidiatek+oldk;
			int k= intermidiatej+oldj;
		}
	
}
}
}
}