import java.util.*;

public class TrackList {

    public String getOneSong(String input) {
        return "The Lyrics to the Song chosen are: " + input;
    }
    
    public static void getAllSongsLyrics(HashMap userMap) {
        Set<String> songs = userMap.keySet();
        for(String song: songs) {
            System.out.print(song + ": ");
            System.out.println(userMap.get(song));
        }
        
         // HOW TO GET THE KEY FROM THE VALUE. WHICH I LOOKED UP BUT DIDNT KNOW HOW TO USE: 
         // <variable>.getKey() // variable would be the lyrics i set to it, in this case. 

        // for (HashMap.Entry<String, String> track : trackList.entrySet()) {
        //     System.out.println(track.getKey() + ": " + track.getValue());
        // }


    }
}