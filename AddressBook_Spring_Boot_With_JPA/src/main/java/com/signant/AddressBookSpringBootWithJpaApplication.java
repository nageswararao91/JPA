package com.signant;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.signant.addressbook.entities.Cities;
import com.signant.addressbook.entities.Countries;
import com.signant.addressbook.entities.States;
import com.signant.addressbook.repository.CountryRepository;

@SpringBootApplication
public class AddressBookSpringBootWithJpaApplication
	implements
		CommandLineRunner
{

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args)
	{
		SpringApplication.run(AddressBookSpringBootWithJpaApplication.class,
			args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		saveCountry();
	}

	@Transactional
	private void saveCountry()
	{
		Countries countries = new Countries();
		countries.setName("India");

		/* State 1 */
		States states1 = new States();
		states1.setName("Ap");
		states1.setCountry(countries);

		/* state 1--> Cities */
		Cities cities11 = new Cities();
		cities11.setName("Guntur");
		cities11.setStates(states1);

		Cities cities12 = new Cities();
		cities12.setName("Kadapa");
		cities12.setStates(states1);

		states1.getCities().add(cities11);
		states1.getCities().add(cities12);

		/* State 2 */
		States states2 = new States();
		states1.setName("TG");
		states1.setCountry(countries);

		/* State 2 --> Cities */
		Cities cities21 = new Cities();
		cities21.setName("Hyderabad");
		cities21.setStates(states2);

		Cities cities22 = new Cities();
		cities22.setName("Warangal");
		cities22.setStates(states2);

		states2.getCities().add(cities21);
		states2.getCities().add(cities22);

		countries.getStates().add(states1);
		countries.getStates().add(states2);

		/* Saving country */
		countryRepository.save(countries);

		Optional<Countries> findById = countryRepository.findById(1);
		System.out.println("After inserting country : "+findById);
	}

}
