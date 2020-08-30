package text.entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence extends Text{
	private List<Word> list = new ArrayList<Word>();
	
	public void add(Word a) {
		this.list.add(a);
	}
	
	
	public List<Word> getWords(){	
		return list;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}


	
}
