package com.signant.addressbook.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = {"states"})

@Entity
@Table(name = "Cities")
public class Cities
{

	@Id
	@GeneratedValue
	private int citySeq;
	private String name;

	
	@ManyToOne
	States states;
}
