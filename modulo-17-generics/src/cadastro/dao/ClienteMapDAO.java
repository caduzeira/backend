package cadastro.dao;

import java.util.HashMap;
import java.util.Map;

import cadastro.dao.generic.GenericDAO;
import cadastro.domain.Cliente;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDao {

    // private Map<Long,Cliente> map;

    public ClienteMapDAO(){
        super();
        Map<Long,Cliente> mapaInterno = this.map.get(getTipoClasse());
        if(mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastro) {
        entityCadastro.setNome(entity.getNome());
        entityCadastro.setTel(entity.getTel());
        entityCadastro.setNumero(entity.getNumero());
        entityCadastro.setEnd(entity.getEnd());
        entityCadastro.setCidade(entity.getCidade());
        entityCadastro.setEstado(entity.getEstado());
    }

    

    // @Override
    // public Boolean cadastrar(Cliente cliente) {
    //     if(this.map.containsKey(cliente.getCpf())){
    //         return false;
    //     }

    //     this.map.put(cliente.getCpf(), cliente);
    //     return true;
    // }

    // @Override
    // public void excluir(Long cpf) {
    //     Cliente clienteCadastrado = this.map.get(cpf);

    //    if(clienteCadastrado != null){
    //         this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
    //    }
    // }

    // @Override
    // public Boolean alterar(Cliente cliente) {
    //     Cliente clienteCadastrado = this.map.get(cliente.getCpf());
    //     if(clienteCadastrado != null){
    //         clienteCadastrado.setNome(cliente.getNome());
    //         clienteCadastrado.setTel(cliente.getTel());
    //         clienteCadastrado.setCpf(cliente.getCpf());
    //         clienteCadastrado.setEnd(cliente.getEnd());
    //         clienteCadastrado.setEstado(cliente.getEstado());
    //         clienteCadastrado.setCidade(cliente.getCidade());
    //         clienteCadastrado.setNumero(cliente.getNumero());
    //         return true;
    //     }
    //     return false;
    // }

    // @Override
    // public Cliente consultar(Long cpf) {
    //     return this.map.get(cpf);
    // }

    // @Override
    // public Collection<Cliente> buscarTodos() {
    //     return this.map.values();
    // }
    
}
