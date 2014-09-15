package monsters.view;

import javax.swing.JOptionPane;

import monsters.controller.MonsterAppController;

public class MonsterView {
	
	private MonsterAppController baseController;	
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}
	
	public void displayInformation()
		{
		System.out.println(baseController.getMonster().getName());
		
		JOptionPane.showMessageDialog(null, "Wow a popup!!");
		
		JOptionPane.showMessageDialog(null, "I made a monster, its name is: " + baseController.getMonster().getName());
		JOptionPane.showMessageDialog(null, baseController.getMonster().getName() + " has " + baseController.getMonster().getArmCount() + " arms");
		JOptionPane.showMessageDialog(null, baseController.getMonster().getName() + " has " + baseController.getMonster().getAmountofHair() + " hairs");
		JOptionPane.showMessageDialog(null, baseController.getMonster().getName() + " has " + baseController.getMonster().getEyeCount() + " eyes");
		JOptionPane.showMessageDialog(null, baseController.getMonster().getName() + " has " + baseController.getMonster().getNoseCount() + " noses");
		JOptionPane.showMessageDialog(null, baseController.getMonster().getName() + " has " + baseController.getMonster().getNumberOfLegs() + " legs");
		
		if(baseController.getMonster().hasBellyButton() == true)
		{
			JOptionPane.showMessageDialog(null, baseController.getMonster().getName() + " has a belly button");
		}
		else
		{
			JOptionPane.showMessageDialog(null, baseController.getMonster().getName() + " doesnt have a belly button");
		}		
		}
}
