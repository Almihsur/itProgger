package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand>bandsList = new ArrayList<>(); // Изначально пустой список
        bandsList.add(new MusicBand("Queen", 1968));
        bandsList.add( new MusicBand("Deep Purple", 1966));
        bandsList.add( new MusicBand("Backstreet Boys", 1993));
        bandsList.add( new MusicBand("Bad Boys Blue", 1984));
        bandsList.add( new MusicBand("Rammstein", 1994));
        bandsList.add( new MusicBand("XXX1", 2000));
        bandsList.add( new MusicBand("XXX2", 2001));
        bandsList.add( new MusicBand("XXX3", 2002));
        bandsList.add( new MusicBand("XXX4", 2003));
        bandsList.add( new MusicBand("XXX5", 2004));

//        System.out.println(bandsList);
//        Collections.shuffle(bandsList);
//        System.out.println(bandsList);
       // public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();
        for (MusicBand band: bandsList
             ) {
if(band.getYear() >= 2000) {
    musicBandsAfter2000.add(band);
}
        }
       // System.out.println(musicBandsAfter2000);

        }
    }

