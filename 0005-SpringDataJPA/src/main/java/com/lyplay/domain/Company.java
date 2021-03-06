package com.lyplay.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Entity(name="sf_em_company")
public class Company implements Serializable, Comparable<Company>{

	private static final long serialVersionUID = -4759861195453752222L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comp_id", nullable = false, length = 20)
	private Long id;
	
	@Column(name = "comp_name", nullable = true, length = 100)
	private String companyName;
	
	@Column(name = "address", nullable = true, length = 200)
	private String address;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time")
    private Date createTime; 
	
	@Column(name = "changer", length = 20)
	private String changer;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_time")
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getChanger() {
		return changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

    @PreUpdate
    public void preUpdate() {
    	updateTime = new Date();
    }
    
    @PrePersist
    public void prePersist() {
        Date now = new Date();
        createTime = now;
        updateTime = now;
    }
    
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public int compareTo(Company obj) {
		if(obj == null){
			return 1;
		} else {
			return (new CompareToBuilder()).append(this.getId(), obj.getId()).toComparison();
		}
	}
	
	
	
	
	
	
}
