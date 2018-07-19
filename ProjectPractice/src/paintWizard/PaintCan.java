package paintWizard;

public class PaintCan {


	private String name = null;
	private int litre = 0;
	private int coveragePerLitre = 0;
	private int totalcoveragePerProduct =0;
	private int price;
	public PaintCan(String name, int litre, int coveragePerLitre, int price) 
	{
		this.name=name;
		this.litre=litre;
		this.coveragePerLitre=coveragePerLitre;
		this.price=price;
		this.calculateTotalCoverage();	
	}
	public void calculateTotalCoverage() 
	{
		this.totalcoveragePerProduct=this.coveragePerLitre*this.litre;
	}
	public int getPrice() 
	{ 
		return this.price;
	}
	public int getTotalCoveragePerProduct()
	{
		return this.totalcoveragePerProduct;
	}
	public int getCoveragePerLitre() 
	{
		return this.coveragePerLitre;
	}
	public int getLitre() 
	{
		return this.litre;
	}
	public String getName() 
	{
		return this.name;
	}
	

}
