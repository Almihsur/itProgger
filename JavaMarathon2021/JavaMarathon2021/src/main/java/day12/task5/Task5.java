package day12.task5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Vasya", 40));
        members1.add(new MusicArtist("Petya", 45));
        members1.add(new MusicArtist("Ivan", 47));

        MusicBand band1 = new MusicBand("Shadows", 1990, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Paui", 20));
        members2.add(new MusicArtist("Irma", 25));
        members2.add(new MusicArtist("Bob", 27));
        MusicBand band2 = new MusicBand("Fools", 2016, members2);

        System.out.println(band1);
        System.out.println(band2);

        MusicBand.transferMembers(band1, band2);

        System.out.println(band1);
        System.out.println(band2);
    }
}
