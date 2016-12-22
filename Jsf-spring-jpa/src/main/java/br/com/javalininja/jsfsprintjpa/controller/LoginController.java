package br.com.javalininja.jsfsprintjpa.controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.javalininja.jsfsprintjpa.model.entities.Usuario;
import br.com.javalininja.jsfsprintjpa.model.service.UsuarioService;
import br.com.javalininja.util.Md5Util;

@Controller(value = "loginController")
@Scope("request")
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;

    private String login;
    private String senha;

    public String loginAction() {
        String l = getLogin();
        String s = getSenha();
        String sMd5 = null;
        try {
            sMd5 = Md5Util.hashMd5(s);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        Usuario u = usuarioService.buscaPorLoginESenha(l, sMd5);
        return "";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public UsuarioService getUsuarioService() {
        return usuarioService;
    }

    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

}
