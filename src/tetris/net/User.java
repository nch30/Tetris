package tetris.net;

import java.io.Serializable;

enum status{offline,online,battling};
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -369278961792783423L;
	public String username=null;
	public String url=null;
	public int score=0;
	public int rank=0;
	public int timeleft=10;
	public status state=status.offline;
}