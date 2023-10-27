package crud.produto.controller;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import crud.produto.model.ProdutoEntity;
import crud.produto.repository.ProdutoRepository;

@Controller
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository repositorio;

    @GetMapping(value="/produto")
    public String produtoPage(){
        return "produto/form";
    }

    @PostMapping(value="/produto/salvar")
    public String salvarProduto(@ModelAttribute ProdutoEntity produto){        
        repositorio.save(produto);
        return "produto/response";
    }
}
