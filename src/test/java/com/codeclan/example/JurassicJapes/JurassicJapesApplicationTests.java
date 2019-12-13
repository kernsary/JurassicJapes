package com.codeclan.example.JurassicJapes;

import com.codeclan.example.JurassicJapes.models.Dinosaur;
import com.codeclan.example.JurassicJapes.models.Paddock;
import com.codeclan.example.JurassicJapes.repositories.DinosaurRepository;
import com.codeclan.example.JurassicJapes.repositories.PaddockRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JurassicJapesApplicationTests {

	@Autowired
	DinosaurRepository dinosaurRepository;

	@Autowired
	PaddockRepository paddockRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPaddock(){
		Paddock newPaddock = new Paddock("Mire");
		paddockRepository.save(newPaddock);
	}

	@Test
	public void createDinosaur(){
		Paddock newPaddock = new Paddock("Mire");
		paddockRepository.save(newPaddock);
		Dinosaur newDinosaur = new Dinosaur("Raptor", "meat", newPaddock);
		dinosaurRepository.save(newDinosaur);
	}

	@Test
	public void canGetPaddock(){
		Paddock paddock = paddockRepository.getOne(1L);
		assertEquals("Swamp", paddock.getName());
	}

	@Test
	public void canGetDinosaur(){
		Dinosaur dinosaur = dinosaurRepository.getOne(1L);
		assertEquals("T Rex", dinosaur.getSpecies());
	}

	@Test
	public void canChangeDinosaurPaddock(){
		Paddock newPaddock = new Paddock("Mire");
		paddockRepository.save(newPaddock);
		Dinosaur dinosaur = dinosaurRepository.getOne(1L);
		dinosaur.setPaddock(newPaddock);
		dinosaurRepository.save(dinosaur);
		Dinosaur dinosaur1 = dinosaurRepository.getOne(1L);
		assertEquals("Mire", dinosaur1.getPaddock().getName());
	}



}
