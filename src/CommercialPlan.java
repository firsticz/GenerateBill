
public class CommercialPlan extends Plan{
	public void getRate() {
		super.rate=3.5;
	}
	public void calculateBill(int units) {
		System.out.println(units*super.rate);
	}
}
