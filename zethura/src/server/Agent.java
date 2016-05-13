package server;

public class Agent extends Entity{
	
	Chunk curChunk;
	private String password;
	private boolean authenticated = true;
	private boolean firstLogin = true;
	
	CharClass curClass;
	
	CharStatPacket stats;
	
	//prints out all current stats
	
	public Agent(){
		stats = new CharStatPacket();
	}
	
	public boolean authenticate(String pw){
		
		if(firstLogin){
			password = pw;
			return true;
		}else{
			if (pw == password){
				authenticated = true;
				return true;
			} else {
				return false;
			}
		}
	}
	
	public void logout(){
		authenticated = false;
		
		//Then save the character
		
	}
	
	
	public void swapClass(CharClass cls){
		curClass = cls;
		stats = curClass.applyMult(stats);
	}
	
	
	
	
	
	
	
}
