package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	private int id;
	private List<Track> tracks;
	private Map<String, Integer> ratings;
	
	public Playlist(int id) {
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}

	public int getId() {
		return id;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public Map<String, Integer> getRatings() {
		return ratings;
	}
	
	public void addTrack(Track track){
		this.tracks.add(track);
	}
	
	public void putRating(String userName, int score) {
		this.ratings.put(userName, score);
	}
	
	public double averageRatings() {
		int soma = 0;
		for (String userName : this.ratings.keySet()) {
			soma += this.ratings.get(userName);
		}
		double mediaSemArredondamento = (double) soma/this.ratings.size();		
		double parteFracionaria = mediaSemArredondamento - Math.floor(mediaSemArredondamento);
		if (parteFracionaria < 0.26) {
			return Math.floor(mediaSemArredondamento);
		}
		else if (parteFracionaria >= 0.74) {
			return Math.ceil(mediaSemArredondamento);
		}
		return Math.floor(mediaSemArredondamento) + 0.5;
	}
}