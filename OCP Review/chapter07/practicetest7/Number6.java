package practicetest7;

public class Number6 {
	
	class RunOutOfTrackException extends Exception {}
	class AnotherTrainingComingException extends Exception {}
	
	public static void main(String[] args) throws RunOutOfTrackException, AnotherTrainingComingException {
		Number6 a = new Number6();
		
		try {
			a.drive();
			System.out.println("Hello");
		} catch (RunOutOfTrackException | AnotherTrainingComingException e) {
		//} catch (RunOutOfTrackException e) {		
		//} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
			throw e;
		}
	}
	
	void drive() throws RunOutOfTrackException, AnotherTrainingComingException {
		throw new RunOutOfTrackException();
	}
}

