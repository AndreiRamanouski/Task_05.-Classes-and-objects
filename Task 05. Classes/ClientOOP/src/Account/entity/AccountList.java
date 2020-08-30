package Account.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountList {
	List<Account> listic  = new ArrayList<Account>();
	
	public void add(Account a) {
		
		this.listic.add(a);
		
	}
	
	public List<Account> getList(){
		return listic;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listic == null) ? 0 : listic.hashCode());
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
		AccountList other = (AccountList) obj;
		if (listic == null) {
			if (other.listic != null)
				return false;
		} else if (!listic.equals(other.listic))
			return false;
		return true;
	}
	

}
