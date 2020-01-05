package homework4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintMain {

	public static void main(String[] args) {
		ArrayList<MusicTrack> musics = new ArrayList<>();
		
		musics.add(new MusicTrack("Photograph", "Ed Sheeran", 4.02, 4.3));
		musics.add(new MusicTrack("Waka waka", "Shakira", 3.03, 4.5));
		musics.add(new MusicTrack("Believer", "Imagine Dragons", 3.37, 4.6));
		musics.add(new MusicTrack("22", "Taylor Swift", 3.52, 4));
		musics.add(new MusicTrack("Leaving on a Jet Plane", "John Denver", 3.57, 4.5));
		musics.add(new MusicTrack("Galway girt", "Ed Sheeran", 3.02, 4.4));
		musics.add(new MusicTrack("Thinking out loud", "Ed Sheeran", 3.22, 4.5));
		
		System.out.println("Sorted the tracks alphabetically by title\n");
		System.out.println(String.format("%-30s %-30s %-20s %-20s", "TITLE", "ARTIST", "DURATION", "RATING"));
		Collections.sort(musics);
		for(MusicTrack m: musics){	
            System.out.println(m);
        }
		
		System.out.println("\nSorted the tracks by rating in descending order\n");
		System.out.println(String.format("%-30s %-30s %-20s %-20s", "TITLE", "ARTIST", "DURATION", "RATING"));
		Collections.sort(musics, new MusicComparator());
		for(MusicTrack m: musics){	
            System.out.println(m);
        }
		
		System.out.println("\nSorted the tracks alphabetically by artist\n");
		System.out.println(String.format("%-30s %-30s %-20s %-20s", "TITLE", "ARTIST", "DURATION", "RATING"));
		musics.sort((song1, song2) -> song1.getArtist().compareTo(song2.getArtist()));
		for(MusicTrack m: musics){	
            System.out.println(m);
        }
		
		System.out.println("\nChosen the tracks of the selected artist and sort those by duration in ascending order\n");
		System.out.println(String.format("%-30s %-30s %-20s %-20s", "TITLE", "ARTIST", "DURATION", "RATING"));
		List<MusicTrack> musicL = musics.stream().filter(artist -> artist.getArtist() == "Ed Sheeran").collect(Collectors.toList());
		musicL.stream().sorted(Comparator.comparing(MusicTrack::getDuration)).forEach(System.out::println);
		
	}

}
