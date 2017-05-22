package com.wms.entity;

/**
 * StockerReturnId entity. @author MyEclipse Persistence Tools
 */

public class StockerReturnId implements java.io.Serializable {

	// Fields

	private String plcname;
	private String readValue;
	private String type;
	private String meaning;
	private String remark;

	// Constructors

	/** default constructor */
	public StockerReturnId() {
	}

	/** minimal constructor */
	public StockerReturnId(String plcname) {
		this.plcname = plcname;
	}

	/** full constructor */
	public StockerReturnId(String plcname, String readValue, String type,
			String meaning, String remark) {
		this.plcname = plcname;
		this.readValue = readValue;
		this.type = type;
		this.meaning = meaning;
		this.remark = remark;
	}

	// Property accessors

	public String getPlcname() {
		return this.plcname;
	}

	public void setPlcname(String plcname) {
		this.plcname = plcname;
	}

	public String getReadValue() {
		return this.readValue;
	}

	public void setReadValue(String readValue) {
		this.readValue = readValue;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMeaning() {
		return this.meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StockerReturnId))
			return false;
		StockerReturnId castOther = (StockerReturnId) other;

		return ((this.getPlcname() == castOther.getPlcname()) || (this
				.getPlcname() != null && castOther.getPlcname() != null && this
				.getPlcname().equals(castOther.getPlcname())))
				&& ((this.getReadValue() == castOther.getReadValue()) || (this
						.getReadValue() != null
						&& castOther.getReadValue() != null && this
						.getReadValue().equals(castOther.getReadValue())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null
						&& castOther.getType() != null && this.getType()
						.equals(castOther.getType())))
				&& ((this.getMeaning() == castOther.getMeaning()) || (this
						.getMeaning() != null && castOther.getMeaning() != null && this
						.getMeaning().equals(castOther.getMeaning())))
				&& ((this.getRemark() == castOther.getRemark()) || (this
						.getRemark() != null && castOther.getRemark() != null && this
						.getRemark().equals(castOther.getRemark())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPlcname() == null ? 0 : this.getPlcname().hashCode());
		result = 37 * result
				+ (getReadValue() == null ? 0 : this.getReadValue().hashCode());
		result = 37 * result
				+ (getType() == null ? 0 : this.getType().hashCode());
		result = 37 * result
				+ (getMeaning() == null ? 0 : this.getMeaning().hashCode());
		result = 37 * result
				+ (getRemark() == null ? 0 : this.getRemark().hashCode());
		return result;
	}

}