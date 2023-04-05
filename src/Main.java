import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException {
        Records records = new Records("lutskin","+380635626695","10/09/2004", "no coments");
        records.birthDay();
        records.setComment();
        records.read();

    }
}