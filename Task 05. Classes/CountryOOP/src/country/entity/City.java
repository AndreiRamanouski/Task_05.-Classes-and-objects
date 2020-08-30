package country.entity;

public class City extends District {
	private String cityname;
	
	public City() {}
	
	public City(String areaname, int surfacearea, String districtname, String cityname) {
		setAreaname(areaname);
		setSurfacearea(surfacearea);
		setDistrictname(districtname);
		this.cityname = cityname;
	}
	

	@Override
	public String toString() {
		return "City: " + cityname + ", District name: " + getDistrictname() + ", Area name: "
				+ getAreaname() + ", Surface area: " + getSurfacearea() + ", Country name: " + getCountryname();
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cityname == null) ? 0 : cityname.hashCode());
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
		City other = (City) obj;
		if (cityname == null) {
			if (other.cityname != null)
				return false;
		} else if (!cityname.equals(other.cityname))
			return false;
		return true;
	}
	
	
	
}
