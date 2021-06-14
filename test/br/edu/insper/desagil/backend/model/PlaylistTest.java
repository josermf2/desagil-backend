package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;
	private Playlist playlist;
	
	@BeforeEach
	void setUp() {
		this.playlist = new Playlist(0);
	}

	@Test
	void testRoundDownToZero() {
		this.playlist.putRating("José", 1);
		this.playlist.putRating("Maria", 2);
		this.playlist.putRating("João", 3);
		this.playlist.putRating("Gabriela", 3);

		assertEquals(2.0, playlist.averageRatings(), DELTA);
	}

	@Test
	void testRoundUpToHalf() {
		this.playlist.putRating("José", 1);
		this.playlist.putRating("Maria", 2);
		this.playlist.putRating("João", 1);

		assertEquals(1.5, playlist.averageRatings(), DELTA);	
	}

	@Test
	void testRoundDownToHalf() {
		this.playlist.putRating("José", 1);
		this.playlist.putRating("Maria", 2);
		this.playlist.putRating("João", 2);

		assertEquals(1.5, playlist.averageRatings(), DELTA);	
	}

	@Test
	void testRoundUpToOne() {
		this.playlist.putRating("José", 1);
		this.playlist.putRating("Maria", 1);
		this.playlist.putRating("João", 2);
		this.playlist.putRating("Gabriela", 3);

		assertEquals(2.0, playlist.averageRatings(), DELTA);
	}
}
