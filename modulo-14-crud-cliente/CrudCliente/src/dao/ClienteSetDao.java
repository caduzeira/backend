package dao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import domain.Cliente;

public class ClienteSetDao implements IClienteDAO{

    private Set<Cliente> set;

    public ClienteSetDao(){
        this.set = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
       if(this.set.contains(cliente)){
        this.set.add(cliente);
        return true;
       }
       return false;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteEncontrado = null;
        for(Cliente cliente : this.set){
        if(cliente.getCpf().equals(cpf)){
            clienteEncontrado = cliente;
        }
       }

       if(clienteEncontrado != null){
        this.set.remove(clienteEncontrado);
       }
    }

    @Override
    public Boolean alterar(Cliente cliente) {
        if(this.set.contains(cliente)){
            for(Cliente clienteCadastrado : this.set){
                clienteCadastrado.setNome(cliente.getNome());
                clienteCadastrado.setTel(cliente.getTel());
                clienteCadastrado.setCpf(cliente.getCpf());
                clienteCadastrado.setEnd(cliente.getEnd());
                clienteCadastrado.setEstado(cliente.getEstado());
                clienteCadastrado.setCidade(cliente.getCidade());
                clienteCadastrado.setNumero(cliente.getNumero()); 
                return true;
            }
        }
        return false;
    }

    @Override
    public Cliente consultar(Long cpf) {
        for(Cliente clienteCadastro : this.set){
            if(clienteCadastro.getCpf().equals(cpf)){
                return clienteCadastro;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }
    
}
