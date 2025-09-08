package HomeTask;

public class InterFaceVideo {
public static void main(String[] args)
{
	
	Video v=new Video();
	Audio a=new Audio();
	
	v.play();
	a.play();
	
}
}
interface playable
{
	void play();
}
class Video implements playable
{
	
   public void play() 
	{	
		System.out.println("Video is Playing");	
	}
}
class Audio implements playable
{
	public void play()
	{
		System.out.println("Audio is playing");
	}
}
