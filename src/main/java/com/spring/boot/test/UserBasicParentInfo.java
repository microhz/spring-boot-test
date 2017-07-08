package com.spring.boot.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author micro
 * @date 2017年7月8日
 * @description :
 */
@Entity
@Table(name = "user_parent_basic_info")
public class UserBasicParentInfo {

	@Id
	@GeneratedValue
	private Long id;

	// @Column
	// private Long gradeId;
	//
	// @Column
	// private Double accountBalance;
	// @Column
	// private Integer currentStatus;
	// @Column
	// private Double rewardBalance;

	@Column(name = "name")
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// @Column
	// private String password;
	//
	// @Column
	// private String mobile;
	//
	// @Column
	// private String address;
	//
	// @Column
	// private Double logitude;
	//
	// @Column
	// private Double latitude;
	//
	// @Column
	// private Long gmtRegister;
	//
	// @Column
	// private Long gmtLastModify;
	//
	// @Column
	// private String utdid;
	//
	// @Column
	// private String reserve1;
	//
	// @Column
	// private String reserve2;
	//
	// @Column
	// private Long portraitUrlId;
	//
	// @Column
	// private String portraitUrl;
	//
	// @Column
	// private Integer sysStatus;
	//
	// @Column
	// private String useCode;
	//
	// @Column
	// private String inviteCode;
	//
	// @Column
	// private String appVereion;
	//
	// @Column
	// private Long provinceId;
	//
	// @Column
	// private Integer gender;
	//
	// @Column
	// private Integer domainCode;
	//
	// public Long getId() {
	// return id;
	// }
	//
	// public void setId(Long id) {
	// this.id = id;
	// }
	//
	// public String getName() {
	// return name;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }
	//
	// public String getPassword() {
	// return password;
	// }
	//
	// public void setPassword(String password) {
	// this.password = password;
	// }
	//
	// public String getMobile() {
	// return mobile;
	// }
	//
	// public void setMobile(String mobile) {
	// this.mobile = mobile;
	// }
	//
	// public String getAddress() {
	// return address;
	// }
	//
	// public void setAddress(String address) {
	// this.address = address;
	// }
	//
	// public Double getLogitude() {
	// return logitude;
	// }
	//
	// public void setLogitude(Double logitude) {
	// this.logitude = logitude;
	// }
	//
	// public Double getLatitude() {
	// return latitude;
	// }
	//
	// public void setLatitude(Double latitude) {
	// this.latitude = latitude;
	// }
	//
	// public Long getGmtRegister() {
	// return gmtRegister;
	// }
	//
	// public void setGmtRegister(Long gmtRegister) {
	// this.gmtRegister = gmtRegister;
	// }
	//
	// public Long getGmtLastModify() {
	// return gmtLastModify;
	// }
	//
	// public void setGmtLastModify(Long gmtLastModify) {
	// this.gmtLastModify = gmtLastModify;
	// }
	//
	// public String getUtdid() {
	// return utdid;
	// }
	//
	// public void setUtdid(String utdid) {
	// this.utdid = utdid;
	// }
	//
	// public String getReserve1() {
	// return reserve1;
	// }
	//
	// public void setReserve1(String reserve1) {
	// this.reserve1 = reserve1;
	// }
	//
	// public String getReserve2() {
	// return reserve2;
	// }
	//
	// public void setReserve2(String reserve2) {
	// this.reserve2 = reserve2;
	// }
	//
	// public Long getPortraitUrlId() {
	// return portraitUrlId;
	// }
	//
	// public void setPortraitUrlId(Long portraitUrlId) {
	// this.portraitUrlId = portraitUrlId;
	// }
	//
	// public String getPortraitUrl() {
	// return portraitUrl;
	// }
	//
	// public void setPortraitUrl(String portraitUrl) {
	// this.portraitUrl = portraitUrl;
	// }
	//
	// public Integer getSysStatus() {
	// return sysStatus;
	// }
	//
	// public void setSysStatus(Integer sysStatus) {
	// this.sysStatus = sysStatus;
	// }
	//
	// public String getUseCode() {
	// return useCode;
	// }
	//
	// public void setUseCode(String useCode) {
	// this.useCode = useCode;
	// }
	//
	// public String getInviteCode() {
	// return inviteCode;
	// }
	//
	// public void setInviteCode(String inviteCode) {
	// this.inviteCode = inviteCode;
	// }
	//
	// public String getAppVereion() {
	// return appVereion;
	// }
	//
	// public void setAppVereion(String appVereion) {
	// this.appVereion = appVereion;
	// }
	//
	// public Long getProvinceId() {
	// return provinceId;
	// }
	//
	// public void setProvinceId(Long provinceId) {
	// this.provinceId = provinceId;
	// }
	//
	// public Integer getGender() {
	// return gender;
	// }
	//
	// public void setGender(Integer gender) {
	// this.gender = gender;
	// }
	//
	// public Integer getDomainCode() {
	// return domainCode;
	// }
	//
	// public void setDomainCode(Integer domainCode) {
	// this.domainCode = domainCode;
	// }
	//
	// public Long getGradeId() {
	// return gradeId;
	// }
	//
	// public void setGradeId(Long gradeId) {
	// this.gradeId = gradeId;
	// }
	//
	// public Double getAccountBalance() {
	// return accountBalance;
	// }
	//
	// public void setAccountBalance(Double accountBalance) {
	// this.accountBalance = accountBalance;
	// }
	//
	// public Integer getCurrentStatus() {
	// return currentStatus;
	// }
	//
	// public void setCurrentStatus(Integer currentStatus) {
	// this.currentStatus = currentStatus;
	// }
	//
	// public Double getRewardBalance() {
	// return rewardBalance;
	// }
	//
	// public void setRewardBalance(Double rewardBalance) {
	// this.rewardBalance = rewardBalance;
	// }
}
