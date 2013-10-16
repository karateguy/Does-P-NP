package SupportPackage;

public class piece {
	public String val;
	public int loc;
	
	public piece()
	{
		val="";
		loc=0;
	}
	public piece(piece parent)
	{
		val=new String(parent.val);
		loc=parent.loc;
	}
}
