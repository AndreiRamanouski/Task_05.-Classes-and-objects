package TextView;

import java.util.ArrayList;
import java.util.List;

import text.entity.Sentence;
import text.entity.Word;

public class ViewOf {
	private List<Word> list = new ArrayList<Word>();
	
	public void getFullSentence(Sentence a) {
		list = a.getWords();
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.print(list.get(i).getWord());
			System.out.print(" ");
		}
		System.out.println();
	}
}
