package LinkedListChallange;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Album {
	
	private String Albumname;
	private static ArrayList<String> Album;
	private String artist;
	  
  public Album(String albumname, ArrayList<String> Album, String artist) {		
		this.Albumname = albumname;
		this.Album = new ArrayList<>();
		this.artist = artist;
	}

  public ArrayList<String> addSong(String Title, String Duration){
	  if(this.Album.contains(Title+" "+Duration)){
		  System.out.println("Song already added");
	  }
	  else {
	  Album.add(Title+" "+Duration);
	  System.out.println("Song: "+Title+" Duration: "+Duration+" added to the album with name "+Albumname);
	  }
	  return Album;
  }
  
   
	



}