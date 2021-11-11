package com.java.practice.Alian;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ALIAN_INFOS")
public class AlianClass {

	@Id
	private int aId;
	private AlianName aName;
	private String acolor;
	public AlianClass(int aId, AlianName aName, String acolor) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.acolor = acolor;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public AlianName getaName() {
		return aName;
	}
	public void setaName(AlianName aName) {
		this.aName = aName;
	}
	public String getAcolor() {
		return acolor;
	}
	public void setAcolor(String acolor) {
		this.acolor = acolor;
	}
	public AlianClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AlianClass [aId=" + aId + ", aName=" + aName + ", acolor=" + acolor + "]";
	}
	
}
	