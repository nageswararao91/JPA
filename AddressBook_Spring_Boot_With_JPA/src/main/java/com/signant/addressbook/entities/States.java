package com.signant.addressbook.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Entity
@ToString(exclude = {"country"})

@Table(name = "States")
public class States
{
	@Id
	@GeneratedValue
	private int stateSeq;
	private String name;

	@OneToMany(mappedBy = "states", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Cities> cities = new HashSet<Cities>();;

	@ManyToOne
	Countries country;

}
