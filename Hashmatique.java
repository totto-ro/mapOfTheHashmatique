import java.util.HashMap;

public class Hashmatique{

    public static void main( String args[] ){
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put( "Bring Me To Life", "How can you see into my eyes like open doors?" );
        trackList.put( "My Immortal", "I'm so tired of being here. Suppressed by all my childish fears" );
        trackList.put( "Going Under", "Now I will tell you what I've done for you. Fifty thousand tears I've cried" );
        trackList.put( "Call Me When You're Sober", "Don't cry to me. If you loved me, You would be here with me." );

        String trackTitle = trackList.get( "My Immortal" );
        System.out.println( "Lyrics: " + trackTitle );

        for( String key : trackList.keySet() ){
            trackTitle = trackList.get( key );
            System.out.println( "Song: " + key + " Lyrics: " + trackTitle );
        }


    }





}