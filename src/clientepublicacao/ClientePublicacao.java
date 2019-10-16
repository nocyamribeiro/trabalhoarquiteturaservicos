/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientepublicacao;

import br.com.publicacaoweb.Publicacao;
import java.util.List;


/**
 *
 * @author maycon
 */
public class ClientePublicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final List<Publicacao> pesquisa = pesquisa(null, "Architect", null, null, null);
        for(Publicacao p : pesquisa) {
            System.out.println("Código: "+ p.getId());
            System.out.println("Nome: "+ p.getDescricao());
        }
    }

    private static java.util.List<br.com.publicacaoweb.Publicacao> pesquisa(java.lang.Integer codigo, java.lang.String titulo, java.lang.Integer paginaInicial, java.lang.Integer paginaFinal, java.lang.Integer anoPublicacao) {
        br.com.publicacaoweb.RetornarPublicacao_Service service = new br.com.publicacaoweb.RetornarPublicacao_Service();
        br.com.publicacaoweb.RetornarPublicacao port = service.getRetornarPublicacaoPort();
        return port.pesquisa(codigo, titulo, paginaInicial, paginaFinal, anoPublicacao);
    }

    
}
