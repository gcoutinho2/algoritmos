package br.com.coutinho.modelo;

import br.com.coutinho.enums.TipoCartao;
import br.com.coutinho.exceptions.TipoPagamentoInvalidoException;


public class CompraLoja extends Compra {
    
    public CompraLoja(Integer id, double valorTotal, TipoCartao tipoCartao) throws TipoPagamentoInvalidoException {
        super(id, valorTotal, tipoCartao);
        if(tipoCartao == TipoCartao.VR || tipoCartao == TipoCartao.VA){
            throw new TipoPagamentoInvalidoException();
        }
    }
    
    
    
  
    
    
        
       
    }


    
   
   
    

