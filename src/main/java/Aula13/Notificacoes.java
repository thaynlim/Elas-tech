package Aula13;

import java.util.ArrayList;

public class Notificacoes {
    static void main() {

        ArrayList<Notificacao> mensagem = new ArrayList<>();
        mensagem.add(new Email());
        mensagem.add(new SMS());

        for (Notificacao mensagens : mensagem) {
            mensagens.enviarMensagem();

            }
        }
    }



