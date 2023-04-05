import java.io.*;
import java.util.ArrayList;

class Records{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private String suename;
    private String phone;
    private String birthDay;
    private String comment;

    public Records(String suename, String phone, String birthDay, String comment) {
        this.suename = suename;
        this.phone = phone;
        this.birthDay = birthDay;
        this.comment = comment;
    }
    public void birthDay(){
        System.out.println(birthDay);
    }
    public void setComment() throws IOException{
        String coment = reader.readLine();
        System.out.println("seted coment: " + coment);
    }
    public void noComent(){
        System.out.println("No comments! ;)");
    }
    public void read() throws IOException {
        File file = new File("C:\\Users\\ОлексійЛуцкін\\Documents\\laba2\\res\\as.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}
