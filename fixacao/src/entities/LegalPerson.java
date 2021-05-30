package entities;

public class LegalPerson extends Calculating {
	
	private Integer numberOfEmployees;
	
	public LegalPerson() {
	}
	
	
	
	public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double calculation() {
		if(numberOfEmployees > 10) {
			return annualIncome * 0.14;
		}else {
			return annualIncome * 0.16;
		}	
	}	
}
