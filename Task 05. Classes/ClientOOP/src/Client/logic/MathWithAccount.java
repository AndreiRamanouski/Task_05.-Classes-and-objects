package Client.logic;

import java.util.ArrayList;
import java.util.List;

import Account.entity.Account;
import Account.entity.AccountList;

public class MathWithAccount {
	
	List<Account> math = new ArrayList<Account>();
	public void setList(AccountList a) {
		math = a.getList();
	}
	
	public void generalSum() {
		int sum = 0;
		for (int i = 0 ; i < math.size(); i ++) {
			sum += math.get(i).getSum();
		}
		System.out.println("General sum = " + sum);
	}
	
	public void positiveSum() {
		int sum = 0;
		for (int i = 0 ; i < math.size(); i ++) {
			if (math.get(i).getSum() > 0)
			sum += math.get(i).getSum();
		}
		System.out.println("Positive sum = " + sum);
	}
	public void negativeSum() {
		int sum = 0;
		for (int i = 0 ; i < math.size(); i ++) {
			if (math.get(i).getSum() < 0)
			sum += math.get(i).getSum();
		}
		System.out.println("Negative sum = " + sum);
	}
	

}
