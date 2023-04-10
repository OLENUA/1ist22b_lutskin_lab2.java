import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

    class Record {
    private String surname;
    private String phoneNumber;
    private String birthDate;
    private String comment;
    private Record[] records;

        public Record(String surname, String phoneNumber, String birthDate) {
            this.surname = surname;
            this.phoneNumber = phoneNumber;
            this.birthDate = birthDate;
            this.records = new Record[0];
        }


        public Record(String fileName) throws IOException {
        ArrayList<Record> records = new ArrayList<Record>();

        try (BufferedReader br = new BufferedReader(new FileReader("res\\as.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String surname = data[0];
                String phoneNumber = data[1];
                String birthDate = data[2];
                Record record = new Record(surname, phoneNumber, birthDate);
                records.add(record);
            }
        }

        this.records = records.toArray(new Record[records.size()]);
    }


    public Record[] getRecords() {
        return records;
    }

    public void setRecords(Record[] records) {
        this.records = records;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String retrieveBirthDate() {
        return "Birth date: " + this.birthDate;
    }

    public void addComment(String newComment) {
        this.comment = newComment;
    }
}
