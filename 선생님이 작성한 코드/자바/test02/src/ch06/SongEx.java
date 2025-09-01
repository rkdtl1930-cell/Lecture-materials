package ch06;

class Song{
	private String title;
	public Song(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
}

public class SongEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song mySong=new Song("Nessun Dorma");
		Song yourSong=new Song("공주는 잠 못이루고");
		System.out.println("내 노래는 "+mySong.getTitle());
		System.out.println("너 노래는 "+yourSong.getTitle());
		

	}

}
