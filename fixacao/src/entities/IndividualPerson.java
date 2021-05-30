package entities;

public class IndividualPerson extends Calculating{
	private Double healthCareSpending;
	
	public IndividualPerson() {
	}
	
	public IndividualPerson(String name, Double annualIncome, Double healthCareSpending) {
		super(name, annualIncome);
		this.healthCareSpending = healthCareSpending;
	}
	
	public Double getHealthCareSpending() {
		return healthCareSpending;
	}

	public void setHealthCareSpending(Double healthCareSpending) {
		this.healthCareSpending = healthCareSpending;
	}

	@Override
	public double calculation() {
		if(annualIncome < 20000.00 && healthCareSpending > 0) {
			return (annualIncome * 0.15) - (healthCareSpending * 0.5);
		}else if(annualIncome < 20000.00 && healthCareSpending == 0) {
			return annualIncome * 0.15;
		}else if(annualIncome >= 20000.00  && healthCareSpending > 0) {
			return (annualIncome * 0.25) - (healthCareSpending * 0.5);
		}else {
			return annualIncome * 0.25;
		}
	}
}
