import java.util.*;

public class Block {
	private String[] transactions;
	private int hash; //creation of hash for current block
	private int prevHash; //using hash from previous block
	
	public Block(int prevHash, String[] transactions){
		this.prevHash = prevHash; 
		this.transactions = transactions;
		
		Object[] current = {Arrays.hashCode(transactions), prevHash}; //creates an current block object using hashcode from transactions and previous block hash code
		this.hash = Arrays.hashCode(current);  //creates hashcode for new block
	}
	
	//getter methods
	public int getPrevHash(){
		return prevHash;
	}
	
	public int getHash(){
		return hash;
	}
	
	public String[] getTransactions(){
		return transactions;
	}
	

}
