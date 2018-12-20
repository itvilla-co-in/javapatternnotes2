package beans;

public class address {

	private String houseNumber;
	private String street;
	private String city;
	private String zipcode;
	
	@Override
	public String toString() {
		return "address [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + ", zipcode=" + zipcode
				+ ", state=" + state + "]";
	}

	private String state;

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public static class Builder 
	{
		private String houseNumber;
		private String street;
		private String city;
		private String zipcode;
		private String state;

		public Builder houseNumber(String houseNumber) {
			this.houseNumber = houseNumber;
			return this;
		}

		public Builder street(String street) {
			this.street = street;
			return this;
		}

		public Builder city(String city) {
			this.city = city;
			return this;
		}

		public Builder zipcode(String zipcode) {
			this.zipcode = zipcode;
			return this;
		}

		public Builder state(String state) {
			this.state = state;
			return this;
		}

		public address build() {
			return new address(this);
		}
	}

	private address(Builder builder) {
		this.houseNumber = builder.houseNumber;
		this.street = builder.street;
		this.city = builder.city;
		this.zipcode = builder.zipcode;
		this.state = builder.state;
	}
}
