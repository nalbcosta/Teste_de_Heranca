/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author 1212111173
 */
public class Juridica extends Pessoa{
        private String cnpj;
        private String municipal;
        private String estadual;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getMunicipal() {
        return municipal;
    }

    public void setMunicipal(String municipal) {
        this.municipal = municipal;
    }

    public String getEstadual() {
        return estadual;
    }

    public void setEstadual(String estadual) {
        this.estadual = estadual;
    }
        
        
                
}
