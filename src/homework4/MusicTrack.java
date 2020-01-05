package homework4;

public class MusicTrack implements Comparable<MusicTrack> {

	private String title, artist;
	private double duration, rating;
	
	@Override
	public int compareTo(MusicTrack song) {
		return title.compareToIgnoreCase(song.title);
	}
	
	//Constructor
	public MusicTrack(String title, String artist, double duration, double rating) {
		super();
		this.title = title;
		this.artist = artist;
		this.duration = duration;
		this.rating = rating;
	}

	// Getter/Setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	//Methods
	public String toString() {
		StringBuilder print = new StringBuilder();
		String data_print;
		print.append(String.format("%-30s %-30s %-20s %-20s", getTitle(), getArtist(), getDuration(), getRating()));

		data_print = print.toString();
		return data_print;
	}
	
	
}
