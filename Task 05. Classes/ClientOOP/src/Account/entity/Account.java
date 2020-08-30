package Account.entity;



public class Account implements Comparable<Account> {
	private int id;
	private int sum;
	private boolean block;
	
	public Account() {}
	
	public Account(int id, int sum) {
		this.id = id;
		this.sum = sum;
	}
	
	
	

	public boolean isBlock() {
		return block;
	}

	public void setBlock(boolean block) {
		this.block = block;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (block ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + sum;
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
		Account other = (Account) obj;
		if (block != other.block)
			return false;
		if (id != other.id)
			return false;
		if (sum != other.sum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account id: " + id + ", sum: " + sum;
	}

	@Override
	public int compareTo(Account o) {
		
		if(this.id < o.id) {
			return -1;}
		if(this.id > o.id) {
			return 1;
		}
		
		return 0;
	}
	
	

	
	
}
