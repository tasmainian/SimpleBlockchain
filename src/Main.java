import java.util.*;
public class Main {

	public static void main(String[] args) {

        String[] genesisTransactions = {"Tas sent Aryan 5 bitcoin","McMaster sent Tas 1000 bitoin"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"Tas sent Krishtee 7 bitcoin", "Tas sent McMaster 5000 bitcoin"};
        Block block2 = new Block(genesisBlock.getHash(), block2Transactions);

        String[] block3Transactions = {"Tas sent family 9000 bitcoin"};
        Block block3 = new Block(block2.getHash(), block3Transactions);

        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getHash());
	}

}
