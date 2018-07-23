package paintWizard;

import java.util.ArrayList;

public class Logic {
	private PaintCan cheapoMax = new PaintCan("CheapoMax",20,10,1999 );
	private PaintCan averageJoes = new PaintCan("averageJoes",15,11,1799);
	private PaintCan duluxourousPaints = new PaintCan("DuluxourousPaints",10,20,2500);
	ArrayList<PaintCan> allCans = new ArrayList();
	
	public Logic() 
	{
		allCans.add(cheapoMax);
		allCans.add(averageJoes);
		allCans.add(duluxourousPaints);
	}

	public String calculateBestCoverage(int roomCoverage) 
	{
		PaintCan temp = new PaintCan("",1000,1000,0);
		double remainingPaint;
		double remainingLitre;
		double tempRemainingLitre=0;
		for(PaintCan pc : allCans) 
		{
			remainingPaint=pc.getTotalCoveragePerProduct()-roomCoverage;
			remainingLitre=remainingPaint/pc.getCoveragePerLitre();
			if(tempRemainingLitre==0)
			{
				tempRemainingLitre=remainingLitre;
				temp=pc;
			} 
			else if(tempRemainingLitre>remainingLitre) 
			{
				tempRemainingLitre=remainingLitre;
				temp=pc;
			}
		}
		return temp.getName();
	}
	
	public String calculateRemainingCost(int roomCoverage) 
	{
		PaintCan temp = new PaintCan("",1000,1000,0);
		double costPerLitre; 
		double remainingPaint;
		double tempRemainingCost=0;
		for(PaintCan pc: allCans) 
		{
			remainingPaint=pc.getTotalCoveragePerProduct()-roomCoverage;
			costPerLitre =(pc.getPrice()/pc.getLitre())*remainingPaint;
			if(tempRemainingCost==0) 
			{
				tempRemainingCost= costPerLitre;
				temp=pc;
			}
			else if(tempRemainingCost>costPerLitre) 
			{
				tempRemainingCost= costPerLitre;
				temp=pc;
			}
		}

		return temp.getName();
	}
}
