package com.signant.addressbook.entities;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString


@Entity
@Table(name = "Countries")
public class Countries
{
	@Id
	@GeneratedValue
	private int countrySeq;
	private String name;

	@OneToMany(mappedBy = "country",fetch = FetchType.EAGER)
	@NotNull
	private Set<States> states;
	
	
//	public void addState(States state) {
//		if(states == null)
//			states = new HashSet<States>();
//		state.setCountry(this);
//		states.add(state);
//	}
	

}
