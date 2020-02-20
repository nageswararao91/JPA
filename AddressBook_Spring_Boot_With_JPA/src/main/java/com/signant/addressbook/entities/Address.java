package com.signant.addressbook.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Address
{
	@Id
	@GeneratedValue
	private long addrSeq;
	private String login;
	private String dept;
	private String addr1;
	private String addr2;
	private String addr3;
	private String addr4;
	private String phone;
	private int pincode;
	private String fax;
	private String email;
	
	private String city;
	private String state;
	private String countrySeq;
	private String countryName;
}
