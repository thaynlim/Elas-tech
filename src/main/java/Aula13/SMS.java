package Aula13;

public class SMS implements Notificacao {
    @Override
    public void enviarMensagem(){
        System.out.println("SMS enviado: Sua compra foi aprovada!");
    }
}
