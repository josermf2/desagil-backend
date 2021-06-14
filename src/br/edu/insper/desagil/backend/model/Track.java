package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	public Track(Artist artist, String name, int duration){
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}

	public Artist getArtist() {
		return artist;
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}
	
	public String getDurationString() {
		int segundos = this.duration%60;
		int minutos = this.duration/60;
		String duracao = Integer.toString(minutos) + ":";
		if (segundos >= 10) {
			duracao += Integer.toString(segundos);
		}
		else{
			duracao += "0" + Integer.toString(segundos);
		}
		return duracao;
	}
	
	public String getFullArtistName() {
		return this.artist.getName();
	}
	
}
