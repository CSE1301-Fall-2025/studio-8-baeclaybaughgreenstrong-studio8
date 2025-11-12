package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {

	public String[] choices;

	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		this.choices = choices;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt();
		for (int i=0; i<choices.length; i++){
			System.out.println((i+1) + ". " + choices[i]);
		}
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices;
	}
	
	public static void main(String[] args) {
		String[] duckSongOptions = {"apples", "bananas","grapes","coconuts"};
		Question duckSong = new MultipleChoiceQuestion("What did the duck ask for at the lemonade stand?" , "grapes", 3, duckSongOptions);
		duckSong.displayPrompt();
		System.out.println(duckSong.checkAnswer("grapes"));
	}

}
