package LinkedListChallange;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Album {
	
	private String Albumname;
	private ArrayList<Song> Songs;
	private String artist;
	  
  public Album(String albumname, String artist) {		
		this.Albumname = albumname;
		this.Songs = new ArrayList<>();
		this.artist = artist;
	}
  
  public boolean addSongs(String Title, String Duration){
	  if(findSong(Title)==null){
		  this.Songs.add(new Song(Title, Duration));
		  return true;
	  }	  
	  return false;
  }
  
  private Song findSong(String Title){
	  for(Song CheckedSong: this.Songs){
		  if(CheckedSong.getTitle().equals(Title)){
			  return CheckedSong;
		  }
	  }
	  return null;
  }
  
  public boolean addToPlayList(int tracknumber, LinkedList<Song> playlist){
	  int index=tracknumber-1;
	  if((index>=0)&&(index<=Songs.size())){
		playlist.add(this.Songs.get(index));
		return true;
	  }
	  else
	  {
		  System.out.println("This album doesnt have a track "+tracknumber);
		  return false;
	  }
}
  
  public boolean addToPlayList(String Title, LinkedList<Song> playlist){
	  Song checkedSong=findSong(Title);
	  if(checkedSong !=null){
		  playlist.add(checkedSong);
		  return true;
	  }
	  System.out.println("The song "+Title+" is not in the album");
	return false;
	  
  }
  
  
  
  
   
	



}