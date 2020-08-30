package Client.logic;

import Account.entity.Account;

public class AccountStatus extends Account {
	
	
	
	public void blockAccount(Account a) { a.setBlock(true); }
	public void unblockAccount(Account a) { a.setBlock(false); }
	
	public void getStatus(Account a) {
		if (a.isBlock() == true) {
			System.out.println(a.toString() + " is blocked"); 
		}
		if (a.isBlock() == false) {
			System.out.println(a.toString() + " is not blocked"); 
		}
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	
}
