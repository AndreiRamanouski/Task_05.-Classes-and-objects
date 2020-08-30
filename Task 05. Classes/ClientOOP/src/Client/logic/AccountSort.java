package Client.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Account.entity.Account;
import Account.entity.AccountList;

public class AccountSort {
	List<Account> sort = new ArrayList<Account>();
	

	public void setSort(AccountList a) {
		sort = a.getList();
	}
	
	public void searchId(int x) {
		for (int i = 0 ; i < sort.size(); i ++) {
			if ( x == sort.get(i).getId());{
			System.out.println("Id: " + x + " has been found. Its ballance is: " + sort.get(i).getSum());
			break;
			}
		}
	}
	public void searchSum(int x) {
		for (int i = 0 ; i < sort.size(); i ++) {
			if ( x == sort.get(i).getSum());{
				System.out.println("Sum: " + x + " has been found. Its id is: " + sort.get(i).getId());
				break;
			}
		}
	}
	public void sort() {
		Collections.sort(sort);
		for (Account a : sort) {
			System.out.println(a);
		}
	}
	
}
