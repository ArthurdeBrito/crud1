/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.controller;

import br.ulbra.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno.saolucas
 */
public class UsuarioController {
    private List<Usuario> usuarios = new ArrayList<>();

   
    public List<Usuario> listar() {
        return usuarios;
    }

    
    public void salvar(Usuario u) {
        usuarios.add(u);
    }

    
    public void atualizar(Usuario u) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == u.getId()) {
                usuarios.set(i, u);
                break;
            }
        }
    }

    
    public void remover(int id) {
        usuarios.removeIf(user -> user.getId() == id);
    }

}
