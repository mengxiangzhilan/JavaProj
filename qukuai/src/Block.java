import java.util.Date;

public class Block {
    public String hash;//数字签名
    public String previousHash;//前一块hash
    private String data;//块数据
    private long timeStamp;//当前时间
    private int nonce;

    public Block(String previousHash, String data) {
        //构造器
        this.previousHash = previousHash;
        this.data = data;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();

    }

    public String calculateHash() {//当前块的hash
        String calculatehash = StringUtil.applySha256(
                previousHash
                        + Long.toString(timeStamp)
                        + Integer.toString(nonce)
                        + data);
        return calculatehash;
    }


    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0');//replace旧串替换
        while (!hash.substring(0, difficulty).equals(target)) {//当hash的前difficulty字节的值不等于target
            nonce++;
            hash = calculateHash();
        }
        System.out.println("Block Mined:" + hash);
    }
}
