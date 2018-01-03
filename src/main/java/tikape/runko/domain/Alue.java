/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tikape.runko.domain;


public class Alue {

    private Integer id;
    private String nimi;
    private Integer viestimaara; // html:lle helposti
    private String uusimmanpaivays;
    
    public Alue(Integer id, String nimi, Integer viestimaara) {
        this.id = id;
        this.nimi = nimi;
        this.viestimaara = viestimaara;
    }

    public Alue(Integer id, String nimi) {
        this.id = id;
        this.nimi = nimi;
    }

    public Alue(String nimi) {
        this.nimi = nimi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public Integer getViestimaara() {
        return viestimaara;
    }

    public void setViestimaara(Integer viestimaara) {
        this.viestimaara = viestimaara;
    }

    public String getUusimmanpaivays() {
        return uusimmanpaivays;
    }

    public void setUusimmanpaivays(String uusimmanpaivays) {
        this.uusimmanpaivays = uusimmanpaivays;
    }

}
