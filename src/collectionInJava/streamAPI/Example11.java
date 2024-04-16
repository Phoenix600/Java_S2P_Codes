package collectionInJava.streamAPI;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Song{
    String title;
    Long duration;
    public Song(String title,Long duration)
    {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}

/**
 * Before Stream API
 */
public class Example11 {
    public static void main(String[] args) {
        Song s1 = new Song("Lucid Dreams",1800L);
        Song s2 = new Song("Empty",200L);
        Song s3 = new Song("Bad Energy",340L);
        Song s4 = new Song("Feel Alone",70L);
        Song s5 = new Song("Wasted",350L);

        List<Song> songList = new LinkedList<>(List.of(s1,s2,s3,s4,s5));

        List<Song> resultSong = new LinkedList<>();
        for (Song x: songList)
        {
            if(x.duration >= 300)
            {
                resultSong.add(x);
            }
        }

        Comparator<Song> comparator = new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                return o2.duration.compareTo(o1.duration);
            }
        };

        resultSong.sort(comparator);
        System.out.println(resultSong);

        List<String> finalSongNamesList = new ArrayList<String>();
        for (Song x: resultSong)
        {
            finalSongNamesList.add(x.title);
        }

        System.out.println(finalSongNamesList);


        // Using Stream API
        List<String> result1 = songList.stream().
                filter(obj->obj.duration >= 300)
                .sorted((d1,d2)->d2.duration.compareTo(d1.duration))
                .map(data->data.title).toList();

        System.out.println(result1);


    }
}
