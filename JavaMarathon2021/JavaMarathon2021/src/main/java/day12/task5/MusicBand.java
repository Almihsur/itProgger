package day12.task5;

import java.util.List;

public class MusicBand {
    private String groupName;
    private int groupYear;
    private List<MusicArtist> members;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupYear() {
        return groupYear;
    }

    public void setGroupYear(int groupYear) {
        this.groupYear = groupYear;
    }


    public MusicBand(String name, int year, List<MusicArtist> groupMembers) {
        this.groupName = name;
        this.groupYear = year;
        this.members = groupMembers;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> groupMembers) {
        this.members = groupMembers;
    }

    public MusicBand(String name, int year) {
        this.groupName = name;
        this.groupYear = year;
    }

       public static void transferMembers(MusicBand a, MusicBand b){
        for ( MusicArtist member: a.getMembers())
            b.getMembers().add(member);
            a.getMembers().clear();

    }
    public void printMembers(){
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + groupName + '\'' +
                ", year=" + groupYear +
                ", members=" + members +
                '}';
    }
}