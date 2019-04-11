package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getAllWhiskeysForAParticularYear(){
		List<Whisky> found = whiskyRepository.findWhiskiesByYear(2018);
		assertEquals(2018, found.get(0).getYear());
	}

	@Test
	public void getAllDistilleryByRegion(){
		List<Distillery> found = distilleryRepository.findDistilleriesByRegion("Speyside");
		assertEquals("Speyside", found.get(0).getRegion());
	}

	@Test
	public void getWhiskiesFromAParticularDistilleryWithSpecificYear(){
		List<Whisky> found = whiskyRepository.findWhiskiesFromADistilleryWithSpecificAge("Rosebank", 12);
		assertEquals("The Rosebank 12 - Flora and Fona", found.get(0).getName());
	}

	@Test
	public void getWhiskiesFromAParticularRegion(){
		List<Whisky> found = whiskyRepository.findWhiskyByRegion("Rosebank", "Lowland");
		assertEquals("The Rosebank 12 - Flora and Fona", found.get(0).getName());
	}

//	@Test
//	public void getDistilleryWithWhiskiesTwelveYearsOld(){
//		List<Distillery> found = distilleryRepository.findDistilleryTwelveYearOld();
//
//
//	}




}
