package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {	
	@BeforeEach
	void setUp() {
	}

	@Test
	void testZeroSeconds() {
		Track track = new Track(new Artist("Jose"), "A+ em DesAgil", 0);
		assertEquals("0:00", track.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		Track track = new Track(new Artist("Jose"), "A+ em DesAgil", 5);
		assertEquals("0:05", track.getDurationString());
	}


	@Test
	void testTwentyFiveSeconds() {
		Track track = new Track(new Artist("Jose"), "A+ em DesAgil", 25);
		assertEquals("0:25", track.getDurationString());
	}


	@Test
	void testOneMinuteZeroSeconds() {
		Track track = new Track(new Artist("Jose"), "A+ em DesAgil", 60);
		assertEquals("1:00", track.getDurationString());
	}


	@Test
	void testOneMinuteFiveSeconds() {
		Track track = new Track(new Artist("Jose"), "A+ em DesAgil", 65);
		assertEquals("1:05", track.getDurationString());
	}


	@Test
	void testOneMinuteTwentyFiveSeconds() {
		Track track = new Track(new Artist("Jose"), "A+ em DesAgil", 85);
		assertEquals("1:25", track.getDurationString());
	}


	@Test
	void testTwoMinutesZeroSeconds() {
		Track track = new Track(new Artist("Jose"), "A+ em DesAgil", 120);
		assertEquals("2:00", track.getDurationString());
	}


	@Test
	void testTwoMinutesFiveSeconds() {
		Track track = new Track(new Artist("Jose"), "A+ em DesAgil", 125);
		assertEquals("2:05", track.getDurationString());
	}


	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		Track track = new Track(new Artist("Jose"), "A+ em DesAgil", 145);
		assertEquals("2:25", track.getDurationString());
	}


	@Test
	void testOneCollaborator() {
		List<Artist> colaboradores = new ArrayList<>(); 
		colaboradores.add(new Artist("Becky G"));
		CollaborationTrack collaborationTrack = new CollaborationTrack(new Artist("Anitta"), colaboradores ,"A+ em DesAgil", 145);
		assertEquals("Anitta (feat. Becky G)", collaborationTrack.getFullArtistName());
	}

	@Test
	void testTwoCollaborators() {
		List<Artist> colaboradores = new ArrayList<>(); 
		colaboradores.add(new Artist("Ludmilla"));
		colaboradores.add(new Artist("Snoop Dog"));
		CollaborationTrack collaborationTrack = new CollaborationTrack(new Artist("Anitta"), colaboradores ,"A+ em DesAgil", 145);
		assertEquals("Anitta (feat. Ludmilla, Snoop Dog)", collaborationTrack.getFullArtistName());	}
}
