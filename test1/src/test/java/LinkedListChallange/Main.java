package LinkedListChallange;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {

	private static ArrayList<Album> albums=new ArrayList<Album>();
	
public static void main(String[] args){

	Album album = new Album("KGF", "Yash");
	album.addSongs("Dheera Dheeara", "5.12 Mins");
	album.addSongs("Evadikevadu Baninsa", "5.45 Mins");
	album.addSongs("Salam Rocky Bhai", "6.25 Mins");
	album.addSongs("Taragani baruvaina", "2.66 Mins");
	album.addSongs("Club Song", "3.51 Mins");
	albums.add(album);
	
	album=new Album("Bunny", "AlluArjun");
	album.addSongs("Jabilamavo", "4.31 Mins");
	album.addSongs("Va Va Vareva", "3.25 Mins");
	album.addSongs("Bunny Bunny", "5.45 Mins");
	album.addSongs("Mailu Mailu", "5.12 Mins");
	album.addSongs("Item Song", "5.12 Mins");
	albums.add(album);
	
	LinkedList<Song> playlist= new LinkedList<Song>();
	albums.get(0).addToPlayList("Dheera Dheeara", playlist);
	albums.get(0).addToPlayList(2, playlist);
	albums.get(1).addToPlayList("Jabilamavo", playlist);
	albums.get(1).addToPlayList(2, playlist);
	
	play(playlist);

}


public static void play(LinkedList<Song> playList){
	Scanner sc = new Scanner(System.in);
	boolean quit=false;
	boolean farword=true;	
	ListIterator<Song> listIterator=playList.listIterator();
	if(playList.size()==0){
		System.out.println("No songs in the playlist");
	}
	else
	{
		System.out.println("Now Playing " +listIterator.next().getSong());
	}
	
	while(!quit){
		int action = sc.nextInt();
		sc.nextLine();
		
		switch(action){
		case 0: 
			System.out.println("Playlist complete.");
			quit=true;
			break;
		case 1:
			if(!farword){
				if(listIterator.hasNext()){
					listIterator.next();
				}
				farword=true;
			}
			if(listIterator.hasNext()){
				System.out.println("Now Playing "+listIterator.next().getSong());
			}
			else
			{
				System.out.println(" We have reached the end of the playlist");
				farword=false;
			}
			break;
		case 2:
			if(farword){
				if(listIterator.hasPrevious()){
					listIterator.previous();
				}
				farword=false;
			}
			if(listIterator.hasPrevious()){
				System.out.println("Now Playing "+ listIterator.previous().getSong());
			}
			else{
				System.out.println("We are at the end of the playlist");
				farword=true;			
			}
			break;
		case 3:
			if(farword){
				if(listIterator.hasPrevious()){
					System.out.println("Now replyaing "+ listIterator.previous().getSong());
					farword=false;
				}else{
					System.out.println("We are at the start of the list");
				}
					
			}
			else{
				if(listIterator.hasNext()) {
					System.out.println("Now replaying "+ listIterator.next().toString());
					farword=true;
				}
				else{
					System.out.println("We have reached end of the list");
				}
			}
			break;
		case 4:
			printList(playList);
			break;
		case 5:
			printMenu();
			break;
		}
	}
}

private static void printMenu(){
	System.out.println("Available actions:\npress");
	System.out.println("0 - to quit\n"+
	 "1 - to play next song\n"+
	 "2 - to play previous song\n"+
	 "3 - to replay the current song/n" +
	 "4 - list of songs in the playlist"+
	 "5 - print available actions.");
}


private static void printList(LinkedList<Song> playList){
	Iterator<Song> iterator=playList.iterator();
	System.out.println("===============================");
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	}
	System.out.println("===============================");
	
}
}
