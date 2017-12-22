package com.bns_g.springmvc4.tutorial.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the zipcode database table.
 * 
 */
@Entity
@Table(name="zipcode")
@NamedQuery(name="Zipcode.findAll", query="SELECT z FROM Zipcode z")
public class Zipcode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="city_name", nullable=false, length=256)
	private String cityName;

	@Column(name="city_name_kana", nullable=false, length=256)
	private String cityNameKana;

	@Column(name="old_zipcode", nullable=false, length=5)
	private String oldZipcode;

	@Column(name="organization_code", nullable=false)
	private int organizationCode;

	@Column(name="prefecture_name", nullable=false, length=256)
	private String prefectureName;

	@Column(name="prefecture_name_kana", nullable=false, length=256)
	private String prefectureNameKana;

	@Column(name="town_name", nullable=false, length=256)
	private String townName;

	@Column(name="town_name_kana", nullable=false, length=256)
	private String townNameKana;

	@Column(nullable=false, length=7)
	private String zipcode;

	public Zipcode() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityNameKana() {
		return this.cityNameKana;
	}

	public void setCityNameKana(String cityNameKana) {
		this.cityNameKana = cityNameKana;
	}

	public String getOldZipcode() {
		return this.oldZipcode;
	}

	public void setOldZipcode(String oldZipcode) {
		this.oldZipcode = oldZipcode;
	}

	public int getOrganizationCode() {
		return this.organizationCode;
	}

	public void setOrganizationCode(int organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getPrefectureName() {
		return this.prefectureName;
	}

	public void setPrefectureName(String prefectureName) {
		this.prefectureName = prefectureName;
	}

	public String getPrefectureNameKana() {
		return this.prefectureNameKana;
	}

	public void setPrefectureNameKana(String prefectureNameKana) {
		this.prefectureNameKana = prefectureNameKana;
	}

	public String getTownName() {
		return this.townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	public String getTownNameKana() {
		return this.townNameKana;
	}

	public void setTownNameKana(String townNameKana) {
		this.townNameKana = townNameKana;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}