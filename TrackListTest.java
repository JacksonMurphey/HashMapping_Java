import java.util.*;

public class TrackListTest {


    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Dusk Rises", "When the Moon Sets, Dusk Rises!");
        userMap.put("Tremor Legs", "Love to make the bed rock, Tremor Legs");
        userMap.put("Cyber", "Beep Boop BOOP Beep Bop");
        userMap.put("98 degrees", "My temp is over, is over, is over, 98 degrees");
        userMap.put("Cry-Pillow", "Soft tears fall down to my, to my, tooooo my, CRY-PILLOW!!!!");


        TrackList trackList = new TrackList();

        String songOne = userMap.get("Dusk Rises");
        System.out.println(trackList.getOneSong(songOne));

        String songTwo = userMap.get("Tremor Legs");
        System.out.println(trackList.getOneSong(songTwo));

        String songThree = userMap.get("Cyber");
        System.out.println(trackList.getOneSong(songThree));

        String songFour = userMap.get("98 degrees");
        System.out.println(trackList.getOneSong(songFour));

        String songFive = userMap.get("Cry-Pillow");
        System.out.println(trackList.getOneSong(songFive));


        TrackList.getAllSongsLyrics(userMap);


    }


}