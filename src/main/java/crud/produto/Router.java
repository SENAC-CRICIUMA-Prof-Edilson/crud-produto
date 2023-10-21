package crud.produto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import crud.produto.controller.ProdutoController;
import crud.produto.model.ProdutoEntity;

@Controller
public class Router {
    
    @GetMapping(value="/produto")
    public String produtoPage(){
        return "produto/form";
    }

    @PostMapping(value="/produto/salvar")
    public String salvarProduto(@ModelAttribute ProdutoEntity produto){
        ProdutoController produto_controller = new ProdutoController();
        produto_controller.salvar(produto);
        return "produto/response";
    }
}
