package cadastro.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cadastro.dao.generic.GenericDAO;
import cadastro.domain.Produto;

public class ProdutoMapDAO extends GenericDAO<Produto> implements IProdutoDAO{

    public ProdutoMapDAO(){
        super();
        Map<Long,Produto> mapaInterno = this.map.get(getTipoClasse());
        if(mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualizarDados(Produto entity, Produto entityCadastro) {
        
    }

}
