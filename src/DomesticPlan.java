
public class DomesticPlan extends Plan {
	
	public void getRate() {
		super.rate=7.5;
	}
	public void calculateBill(int units) {
		System.out.println(super.rate*units);
	}
}
