public class AgeValidation {
	public void validAge(int age)throws InvalidAgeException{
		if(age>=18) {
			System.out.println("right to vote");
		}
		else {
			throw new InvalidAgeException("the age is not matching with the right of vote");
		}

	}

}
