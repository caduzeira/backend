package cadastro.dao.generic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cadastro.domain.Cliente;
import cadastro.domain.IPersistente;

public abstract class GenericDAO<T extends IPersistente> implements IGenericDAO<T>{

    protected Map<Class, Map<Long,T>> map;

    public abstract Class<T> getTipoClasse();

    public abstract void atualizarDados(T entity, T entityCadastro);
    
    public GenericDAO(){
        if(this.map == null){
            this.map = new HashMap<>();
        }
    }

    @Override
    public Boolean alterar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        T objetoCadastrado = mapaInterno.get(entity.getCodigo());
        if(objetoCadastrado != null){
            atualizarDados(entity,objetoCadastrado);
            return true;
        }
        return false;
    }

    @Override
    public Collection<T> buscarTodos() {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        return mapaInterno.values();
    }

    @Override
    public Boolean cadastrar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        if(mapaInterno.containsKey(entity.getCodigo())){
            return false;
        }
        mapaInterno.put(entity.getCodigo(), entity);
        return true;
    }

    @Override
    public T consultar(Long valor) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        return mapaInterno.get(valor);
    }

    @Override
    public void excluir(Long valor) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        T objetoCadastrado = mapaInterno.get(valor);

        if(objetoCadastrado != null){
            this.map.remove(valor,objetoCadastrado);
        }
    }


}
