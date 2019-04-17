package Thread;


import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;
/*
public class Music extends Thread{
	
	private Player player; // 자바 줌 라이브러리 중 하나
	private boolean isLoop; // 현재 곡이 무한 반복인지 한번만 재생되고 꺼지는지에 대한 설정
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) {
		try {
			this.isLoop = isLoop;
			file = new File(Thread.class.getResource("../music/" + name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public int getTime() { //현재 실행되는 음악이 어떤 위치에서 실행되는지 알려줌
		if(player == null)
		{
			return 0;
		}
		return player.getPosition();
	}
	
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt();
	}
	
	@Override
	public void run() {
		try {
			do {
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			}while(isLoop);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
*/

public class Music {

    private String filename;
    private static Player player;
    Thread playMusic;
    // constructor that takes the name of an MP3 file

    public Music(String filename) {
        this.filename = filename;
    }

    //음악 플레이 메서드
    public void play() {
        try {
            FileInputStream fis = new FileInputStream(filename);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
        } catch (Exception e) {
            System.out.println("Problem playing file " + filename);
            System.out.println(e);
        }
    }

    public void start() {
        play();
        playMusic = new Thread(new PlayMusic());
        playMusic.start();
    }

    public void stop() {
        close();
        playMusic = null;
    }

    public void close() {
        if (player != null) {
            player.close();
        }
    }

    class PlayMusic implements Runnable {

        public void run() {
            try {
                player.play();
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

