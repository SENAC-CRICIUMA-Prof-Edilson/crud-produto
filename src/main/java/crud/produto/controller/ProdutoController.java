package crud.produto.controller;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import crud.produto.model.ProdutoEntity;
import crud.produto.repository.ProdutoRepository;

public class ProdutoController {
    
    @Autowired
    private ProdutoRepository repositorio;

    @PostMapping(value="/produto/salvar")
    public boolean salvar(ProdutoEntity produto){
        //try{
            repositorio.save(produto);
            return true;
        //}catch(Exception e){
        //    return false;
        //}
    }
}
