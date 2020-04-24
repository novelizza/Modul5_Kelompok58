package modul5_kelompok58;

public class userService {
    private String[][] data = new String[2][3];
    private String[][] histories = new String[2][3];
    private String email, password, roles = "";

    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data =
                {
                        {"nouvel.izza.fardana.kelompok58@gmail.com", "12345", "supedAdmin"},
                        {"muhammad.amri.hakim.kelompok58@gmail.com", "12345", "user"}
                };
        String[][] histories =
                {
                        {"nouvel.izza.fardana.kelompok58@gmail.com", "Fisika Dasar", "Dasar Komputer dan Pemograman", "25-04-1999"},
                        {"muhammad.amri.hakim.kelompok58@gmail.com", "Dasar Komputer dan Pemograman", "Konsep Jaringan Komputer", "25-04-1999"}
                };
        this.data = data;
        this.histories = histories;
    }

    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    roles = data[i][2];
                    return true;
                }
            }
        }
        return false;
    }

    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
            for(int i=0;i<histories.length;i++){
                if (histories[i][0].equals(email)){
                    System.out.println(histories[i][1]);
                    System.out.println(histories[i][2]);
                    System.out.println(histories[i][3]);
                }
            }
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }

}
