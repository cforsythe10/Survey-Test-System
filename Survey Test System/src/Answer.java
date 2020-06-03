import java.io.Serializable;

public class Answer implements Serializable {
	private String answer;
	
	public Answer(String ans) {
		answer = ans;
	}
	
	public void modifyAnswer(String newAns) {
		answer = newAns;
	}
	
	public String getAnswer() {
		return answer;
	}
}
