package Client.main;

import Account.entity.Account;
import Account.entity.AccountList;
import Client.logic.AccountSort;
import Client.logic.AccountStatus;
import Client.logic.MathWithAccount;

public class Main {

	public static void main(String[] args) {
		AccountStatus setStat = new AccountStatus();
		AccountSort sort = new AccountSort();
		
		AccountList list = new AccountList();
		
		MathWithAccount math = new MathWithAccount();
		
		Account a1 = new Account(15, 665);
		Account a2 = new Account(94, -141);
		Account a3 = new Account(8, -999);
		Account a4 = new Account(98, 789);
		Account a5 = new Account(17, 587);
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		
		setStat.blockAccount(a1);
		setStat.getStatus(a1);
		
		math.setList(list);
		math.generalSum();
		math.positiveSum();
		math.negativeSum();
		
		sort.setSort(list);
		sort.searchId(15);
		sort.searchSum(789);
		sort.sort();
	}

}
//1. .  Реализовать поиск и сортировку счетов.  
