//prompt for number of dimensions using an args processor works for int, double and float

public class DistanceFinder {

	public static void main(String[] args) {
		float x1 = (float) 3;
		float y1 = (float) 4;
		float x2 = (float) 0;
		float y2 = (float) 0.98564;
		
		float originX = 0;
		float originY = 0;
		
		//if(x1!=0 && y1!=0|| x2!=0 && y2!=0){
		float xDistance = (float) Math.abs(Math.pow((x2-x1),2));
		float yDistance = (float) Math.abs(Math.pow((y2-y1),2));
		float finalDistance = (float) Math.sqrt(yDistance+xDistance);
		
		//} else if(x1=0 && y1=0){
		//float xDistance = (float) Math.abs(Math.pow((x2),2));
		//float yDistance = (float) Math.abs(Math.pow((y2),2));
		//float finalDistance = (float) Math.sqrt(yDistance+xDistance);
		//}else if (x2!=0 && y2!=0){
		//float xDistance = (float) Math.abs(Math.pow((x1),2));
		//float yDistance = (float) Math.abs(Math.pow((y1),2));
		//float finalDistance = (float) Math.sqrt(yDistance+xDistance);
		//}
		
		System.out.println("Distance between points = " + finalDistance);
	
	}

}
