package Aula13;

import java.util.ArrayList;

public class Email implements Notificacao {
    @Override
    public void enviarMensagem() {
        System.out.println("E-mail enviado: Sua compra foi aprovada!");
    }
}