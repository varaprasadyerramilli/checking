package LinkedListChallange;

public class Song {
	public Song(String title, String duration) {
		Title = title;
		Duration = duration;
	}

	private String Title;
	private String Duration;
	
	public String getTitle() {
		return Title;
	}
	
	public String getDuration() {
		return Duration;
	}
	
	public String getSong(){
		return this.Title+" "+this.Duration;
	}
	
}
