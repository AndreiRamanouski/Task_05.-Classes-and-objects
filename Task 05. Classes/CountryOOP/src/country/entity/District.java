package country.entity;

public class District extends Area {
	private String districtname;

	
	
	
	public String getDistrictname() {
		return districtname;
	}

	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((districtname == null) ? 0 : districtname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		if (districtname == null) {
			if (other.districtname != null)
				return false;
		} else if (!districtname.equals(other.districtname))
			return false;
		return true;
	}
	
	
	
}
