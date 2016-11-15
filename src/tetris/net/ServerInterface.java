package tetris.net;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import tetris.net.status;
//add the remote method of Server here
public interface ServerInterface extends Remote{
	public void test() throws RemoteException;
	//д���rmi��ַ������
	public boolean login(String username,String localurl) throws RemoteException;
	//��ȡǰʮ�������
	public ArrayList<User> getTopPlayers() throws RemoteException;
	//����״̬��������lifetime�����ھͷ���true�������ھͷ���false��Ȼ����Ҫ���µ�¼
	public boolean setStatus(String name,status s) throws RemoteException;
	//�û�����
	public boolean logout(String name) throws RemoteException;
	
	public ArrayList<User> getOnlinePlayers() throws RemoteException;
	
	public int updateScore(String name,int score) throws RemoteException;
}