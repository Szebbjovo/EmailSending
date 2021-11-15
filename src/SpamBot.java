public class SpamBot {
    public static void spamAttack(String targetEmail) throws Exception{
        for(int i = 0; i < 100;i++) {
            EmailSender.sendMail(targetEmail, "Your Computer HAse virus!!!","VIRUS boss, trebe sa facem ceva!!!!! \n Descarca antivirusul :" +
                    "https://rr.noordstar.me/anti-virus-pfizer-for-ur-pc-3c7a102c");
                    //rick roll ur friends ;)
        }

    }
}
