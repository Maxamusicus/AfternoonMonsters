package monsters.controller;

import monsters.model.MarshmallowMonster;
import monsters.view.MonsterView;

public class MonsterAppController {
	
	private MonsterView appView;
	private MarshmallowMonster monster;
	
	public MonsterAppController()
	{
		monster = new MarshmallowMonster("Svenlaf the Destroyer", 10, 2, 3, 5.0, 4.0, true);
		appView = new MonsterView(this);
		
		appView.displayInformation();
		
		//String name, int eyeCount, int armCount, int noseCount, double amountOfHair, double numberOfLegs, boolean hasBellyButton
		
		
	}
	
	public MarshmallowMonster getMonster(){ return monster;}
	
}
