package monsters.model;

public class MarshmallowMonster {

	private String name;
	private double numberOfLegs;
	private double amountOfHair;
	private int armCount;
	private int noseCount;
	private int eyeCount;
	private boolean hasBellyButton;
	
	public MarshmallowMonster()
	{
		
	}
	
	public MarshmallowMonster(String name, int eyeCount)
	{
		this.name = name;
		this.eyeCount = eyeCount;
	}
	
	public MarshmallowMonster(String name, int eyeCount, int armCount, int noseCount, double amountOfHair, double numberOfLegs, boolean hasBellyButton)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.noseCount = noseCount;
		this.amountOfHair = amountOfHair;
		this.numberOfLegs = numberOfLegs;
		this.hasBellyButton = hasBellyButton;
	}
	public String getName(){ return name;}
	public double getNumberOfLegs(){ return numberOfLegs;}
	public double getAmountofHair(){ return amountOfHair;}
	public int getArmCount(){ return armCount; }
	public int getNoseCount(){ return noseCount;}
	public int getEyeCount(){ return eyeCount;}
	public boolean hasBellyButton() { return hasBellyButton;}
	
	
}
