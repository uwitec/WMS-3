package com.wms.entity;

/**
 * ClwriteId entity. @author MyEclipse Persistence Tools
 */

public class ClwriteId implements java.io.Serializable {

	// Fields

	private String plcname;
	private String writeValue;
	private String type;
	private String meaning;
	private String remark;

	// Constructors

	/** default constructor */
	public ClwriteId() {
	}

	/** minimal constructor */
	public ClwriteId(String plcname) {
		this.plcname = plcname;
	}

	/** full constructor */
	public ClwriteId(String plcname, String writeValue, String type,
			String meaning, String remark) {
		this.plcname = plcname;
		this.writeValue = writeValue;
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

	public String getWriteValue() {
		return this.writeValue;
	}

	public void setWriteValue(String writeValue) {
		this.writeValue = writeValue;
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
		if (!(other instanceof ClwriteId))
			return false;
		ClwriteId castOther = (ClwriteId) other;

		return ((this.getPlcname() == castOther.getPlcname()) || (this
				.getPlcname() != null && castOther.getPlcname() != null && this
				.getPlcname().equals(castOther.getPlcname())))
				&& ((this.getWriteValue() == castOther.getWriteValue()) || (this
						.getWriteValue() != null
						&& castOther.getWriteValue() != null && this
						.getWriteValue().equals(castOther.getWriteValue())))
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
		result = 37
				* result
				+ (getWriteValue() == null ? 0 : this.getWriteValue()
						.hashCode());
		result = 37 * result
				+ (getType() == null ? 0 : this.getType().hashCode());
		result = 37 * result
				+ (getMeaning() == null ? 0 : this.getMeaning().hashCode());
		result = 37 * result
				+ (getRemark() == null ? 0 : this.getRemark().hashCode());
		return result;
	}

}