package beans;

public class emp {

	private Integer empid;
	private String empname;
	private String empdept;
	private String empsal;
	private address address;

	
	
	@Override
	public String toString() {
		return "emp [empid=" + empid + ", empname=" + empname + ", empdept=" + empdept + ", empsal=" + empsal
				+ ", address=" + address + "]";
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpdept() {
		return empdept;
	}

	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

	public String getEmpsal() {
		return empsal;
	}

	public void setEmpsal(String empsal) {
		this.empsal = empsal;
	}

	public address getAddress() {
		return address;
	}

	public void setAddress(address address) {
		this.address = address;
	}

	
	public static class Builder {
		private Integer empid;
		private String empname;
		private String empdept;
		private String empsal;
		private address address;

		public Builder empid(Integer empid) {
			this.empid = empid;
			return this;
		}

		public Builder empname(String empname) {
			this.empname = empname;
			return this;
		}

		public Builder empdept(String empdept) {
			this.empdept = empdept;
			return this;
		}

		public Builder empsal(String empsal) {
			this.empsal = empsal;
			return this;
		}

		public Builder address(address address) {
			this.address = address;
			return this;
		}

		public emp build() {
			return new emp(this);
		}
	}

	private emp(Builder builder) {
		this.empid = builder.empid;
		this.empname = builder.empname;
		this.empdept = builder.empdept;
		this.empsal = builder.empsal;
		this.address = builder.address;
	}
}
