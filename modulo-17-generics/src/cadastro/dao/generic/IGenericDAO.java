package cadastro.dao.generic;

import java.util.Collection;

import cadastro.domain.Cliente;
import cadastro.domain.IPersistente;

public interface IGenericDAO <T extends IPersistente> {
    public Boolean cadastrar(T entity);

    public void excluir(Long valor);

    public Boolean alterar(T entity);

    public T consultar(Long valor);

    public Collection<T> buscarTodos();
}
