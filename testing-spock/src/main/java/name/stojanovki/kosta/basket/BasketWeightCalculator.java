package name.stojanovki.kosta.basket;

public class BasketWeightCalculator {
	private int totalWeight = 0;

	public void addItem(int itemWeight) // Assume weight is always an integer
										// number
	{
		totalWeight = totalWeight + itemWeight;

	}

	public int getTotalWeight() {
		return totalWeight;
	}

}