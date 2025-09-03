package fExam;

class Album {
    // 1. 필드 (private)
    private String title;
    private String artist;
    private int year;
    private String genre;

    // 2. 기본 생성자
    public Album() {
    }

    // 3. 모든 필드를 초기화하는 생성자
    public Album(String title, String artist, int year, String genre) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
    }

    // 4. 앨범명만 초기화하는 생성자
    public Album(String title) {
        this.title = title;
    }

    // 5. Getter & Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // 6. toString 메소드
    @Override
    public String toString() {
        return String.format("%-15s %-15s %-5d %-10s", title, artist, year, genre);
    }
}

public class Ex08_AlbumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Album a1 = new Album();
	        a1.setTitle("Thriller");
	        a1.setArtist("Michael Jackson");
	        a1.setYear(1982);
	        a1.setGenre("Pop");

	        // 모든 필드 초기화 생성자
	        Album a2 = new Album("Divide", "Ed Sheeran", 2017, "Pop");

	        // 앨범명만 초기화 생성자
	        Album a3 = new Album("The Dark Side");
	        a3.setArtist("Pink Floyd");
	        a3.setYear(1973);
	        a3.setGenre("Rock");

	        // 출력
	        System.out.printf("%-15s %-15s %-5s %-10s%n", "앨범명", "가수", "발매연도", "장르");
	        System.out.println(a1);
	        System.out.println(a2);
	        System.out.println(a3);

	}

}
