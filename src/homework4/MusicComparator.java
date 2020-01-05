package homework4;

import java.util.Comparator;

public class MusicComparator implements Comparator<MusicTrack> {

	@Override
	public int compare(MusicTrack song1, MusicTrack song2) {
		if(song1.getRating() < song2.getRating()) {
			return -1;
		}
		if(song1.getRating() > song2.getRating()) {
			return 0;
		}
		else return 0;
	}

}
