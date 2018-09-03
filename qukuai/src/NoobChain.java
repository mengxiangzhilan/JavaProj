import java.util.ArrayList;
import com.google.gson.GsonBuilder;
public class NoobChain {

    public static int difficulty=5;
    public static ArrayList<Block> blockchain=new ArrayList<>();
    public static void main(String[] args) {
        /*Block genesisBlock = new Block("Hi im the first block", "0");
        System.out.println("hash for block 1："+genesisBlock.hash);
        Block sBlock = new Block("yo im the second block", genesisBlock.hash);
        System.out.println("hash for block 2："+sBlock.hash);
        Block tBlock = new Block("yo im the third block", sBlock.hash);
        System.out.println("hash for block 3："+tBlock.hash);*/
        blockchain.add(new Block("Hi im the first block", "0"));
        System.out.println("Trying to Mine block 1..");
        blockchain.get(0).mineBlock(difficulty);

        blockchain.add(new Block("yo im the second block",blockchain.get(blockchain.size()-1).hash));
        System.out.println("Trying to Mine block 2..");
        blockchain.get(1).mineBlock(difficulty);

        blockchain.add(new Block("yo im the third block", blockchain.get(blockchain.size()-1).hash));
        System.out.println("Trying to Mine block 3..");
        blockchain.get(2).mineBlock(difficulty);

        System.out.println("\nBlockchain is Valid: " + isChainValid());

        String blockchainjson=new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println("\nThe block chain : ");
        System.out.println(blockchainjson);
    }
    public static Boolean isChainValid(){
        Block currentBlock;
        Block previousBlock;
        for (int i=1;i<blockchain.size();i++){
            currentBlock=blockchain.get(i);
            previousBlock=blockchain.get(i-1);
            String hashTarget = new String(new char[difficulty]).replace('\0', '0');
            if(!currentBlock.hash.equals(currentBlock.calculateHash())){
                System.out.println("Current Hashes not equal");
                return false;
            }
            if(!previousBlock.hash.equals(currentBlock.previousHash)){
                System.out.println("previous Hashes not equal");
                return false;
            }
            if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
                System.out.println("This block hasn't been mined");
                return false;
            }

        }
        return true;
    }


}
