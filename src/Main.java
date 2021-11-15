public class Main {
    public static void main(String[] args) throws Exception {
        EmailSender.sendMail("Recipient", "Subject" ,"Messeage");
        //or you can use it as a spam bot
        SpamBot.spamAttack("Target email adress");
    }
}
