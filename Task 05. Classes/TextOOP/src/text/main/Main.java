package text.main;


import TextView.ViewOf;
import text.entity.Sentence;
import text.entity.Word;

public class Main {
	public static void main(String[] args) {
	Sentence title = new Sentence(); 
	Sentence first = new Sentence(); 
	Sentence second = new Sentence(); 
	ViewOf view = new ViewOf();
	title.add(new Word("Hi"));
	title.add(new Word(","));
	title.add(new Word("this"));
	title.add(new Word("is"));
	title.add(new Word("the"));
	title.add(new Word("title"));
	title.add(new Word("!"));
	
	first.add(new Word("Hi"));
	first.add(new Word(","));
	first.add(new Word("this"));
	first.add(new Word("is"));
	first.add(new Word("the"));
	first.add(new Word("first"));
	first.add(new Word("sentence"));
	first.add(new Word("."));
	
	second.add(new Word("Hi"));
	second.add(new Word(","));
	second.add(new Word("this"));
	second.add(new Word("is"));
	second.add(new Word("the"));
	second.add(new Word("second"));
	second.add(new Word("one"));
	second.add(new Word("."));
	
	view.getFullSentence(title);
	view.getFullSentence(first);
	view.getFullSentence(second);
	}
}
  
