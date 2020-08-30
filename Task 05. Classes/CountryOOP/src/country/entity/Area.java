package country.entity;

public class Area extends Country {
	private String areaname;
	private double surfacearea;
	
	
	
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public double getSurfacearea() {
		return surfacearea;
	}
	public void setSurfacearea(double surfacearea) {
		this.surfacearea = surfacearea;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((areaname == null) ? 0 : areaname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(surfacearea);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Area other = (Area) obj;
		if (areaname == null) {
			if (other.areaname != null)
				return false;
		} else if (!areaname.equals(other.areaname))
			return false;
		if (Double.doubleToLongBits(surfacearea) != Double.doubleToLongBits(other.surfacearea))
			return false;
		return true;
	}
	
	
	
}
