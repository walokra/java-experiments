package com.ruleoftech.exp.ajotektiedot.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tekniset tiedot model.
 */
@Entity
@Table(name = "tekniset_tiedot")
// @NamedQueries({ @NamedQuery(name = "TeknisetTiedot.findByMerkkiAndMalli",
// query =
// "SELECT t FROM TeknisetTiedot t WHERE t.merkkiSelvakielinen LIKE %:merkki% AND t.kaupallinenNimi LIKE %:malli%")
// })
public class TeknisetTiedot implements Serializable {
	private static final long serialVersionUID = 1L;

	public TeknisetTiedot() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long jarnro;

	@Column(nullable = true)
	private String ajoneuvoluokka;

	@Column(nullable = true)
	private Date ensirekisterointipvm;

	@Column(nullable = true)
	private Integer ajoneuvoryhma;

	@Column(nullable = true)
	private String ajoneuvonkaytto;

	@Column(nullable = true)
	private Long kayttoonottopvm;

	@Column(nullable = true)
	private String vari;

	@Column(nullable = true)
	private Integer ovienLukumaara;

	@Column(nullable = true)
	private String korityyppi;

	@Column(nullable = true)
	private Integer ohjaamotyyppi;

	@Column(name = "istumapaikkojenLkm", nullable = true)
	private Integer istumapaikkojenLkm;

	@Column(nullable = true)
	private Integer omamassa;

	@Column(name = "teknSuurSallKokmassa", nullable = true)
	private Integer teknSuurSallKokmassa;

	@Column(name = "tieliikSuurSallKokmassa", nullable = true)
	private Integer tieliikSuurSallKokmassa;

	@Column(name = "ajonKokPituus", nullable = true)
	private Integer ajonKokPituus;

	@Column(name = "ajonLeveys", nullable = true)
	private Integer ajonLeveys;

	@Column(name = "ajonKorkeus", nullable = true)
	private Integer ajonKorkeus;

	@Column(nullable = true)
	private String kayttovoima;

	@Column(nullable = true)
	private Integer iskutilavuus;

	@Column(name = "suurinNettoteho", nullable = true)
	private Integer suurinNettoteho;

	@Column(name = "sylintereidenLkm", nullable = true)
	private Integer sylintereidenLkm;

	@Column(nullable = true)
	private String ahdin;

	@Column(name = "merkkiSelvakielinen", nullable = true)
	private String merkkiSelvakielinen;

	@Column(nullable = true)
	private String mallimerkinta;

	@Column(nullable = true)
	private String vaihteisto;

	@Column(name = "vaihteidenLkm", nullable = true)
	private Integer vaihteidenLkm;

	@Column(name = "kaupallinenNimi", nullable = true)
	private String kaupallinenNimi;

	@Column(name = "voimanvalJaTehostamistapa", nullable = true)
	private String voimanvalJaTehostamistapa;

	@Column(nullable = true)
	private String tyyppihyvaksyntanro;

	@Column(name = "yksittaisKayttovoima", nullable = true)
	private String yksittaisKayttovoima;

	@Column(nullable = true)
	private String kunta;

	@Column(nullable = true)
	private Integer co2;

	public Long getJarnro() {
		return jarnro;
	}

	public void setJarnro(Long jarnro) {
		this.jarnro = jarnro;
	}

	public String getAjoneuvoluokka() {
		return ajoneuvoluokka;
	}

	public void setAjoneuvoluokka(String ajoneuvoluokka) {
		this.ajoneuvoluokka = ajoneuvoluokka;
	}

	public Date getEnsirekisterointipvm() {
		return ensirekisterointipvm;
	}

	public void setEnsirekisterointipvm(Date ensirekisterointipvm) {
		this.ensirekisterointipvm = ensirekisterointipvm;
	}

	public Integer getAjoneuvoryhma() {
		return ajoneuvoryhma;
	}

	public void setAjoneuvoryhma(Integer ajoneuvoryhma) {
		this.ajoneuvoryhma = ajoneuvoryhma;
	}

	public String getAjoneuvonkaytto() {
		return ajoneuvonkaytto;
	}

	public void setAjoneuvonkaytto(String ajoneuvonkaytto) {
		this.ajoneuvonkaytto = ajoneuvonkaytto;
	}

	public Long getKayttoonottopvm() {
		return kayttoonottopvm;
	}

	public void setKayttoonottopvm(Long kayttoonottopvm) {
		this.kayttoonottopvm = kayttoonottopvm;
	}

	public String getVari() {
		return vari;
	}

	public void setVari(String vari) {
		this.vari = vari;
	}

	public Integer getOvienLukumaara() {
		return ovienLukumaara;
	}

	public void setOvienLukumaara(Integer ovienLukumaara) {
		this.ovienLukumaara = ovienLukumaara;
	}

	public String getKorityyppi() {
		return korityyppi;
	}

	public void setKorityyppi(String korityyppi) {
		this.korityyppi = korityyppi;
	}

	public Integer getOhjaamotyyppi() {
		return ohjaamotyyppi;
	}

	public void setOhjaamotyyppi(Integer ohjaamotyyppi) {
		this.ohjaamotyyppi = ohjaamotyyppi;
	}

	public Integer getIstumapaikkojenLkm() {
		return istumapaikkojenLkm;
	}

	public void setIstumapaikkojenLkm(Integer istumapaikkojenLkm) {
		this.istumapaikkojenLkm = istumapaikkojenLkm;
	}

	public Integer getOmamassa() {
		return omamassa;
	}

	public void setOmamassa(Integer omamassa) {
		this.omamassa = omamassa;
	}

	public Integer getTeknSuurSallKokmassa() {
		return teknSuurSallKokmassa;
	}

	public void setTeknSuurSallKokmassa(Integer teknSuurSallKokmassa) {
		this.teknSuurSallKokmassa = teknSuurSallKokmassa;
	}

	public Integer getTieliikSuurSallKokmassa() {
		return tieliikSuurSallKokmassa;
	}

	public void setTieliikSuurSallKokmassa(Integer tieliikSuurSallKokmassa) {
		this.tieliikSuurSallKokmassa = tieliikSuurSallKokmassa;
	}

	public Integer getAjonKokPituus() {
		return ajonKokPituus;
	}

	public void setAjonKokPituus(Integer ajonKokPituus) {
		this.ajonKokPituus = ajonKokPituus;
	}

	public Integer getAjonLeveys() {
		return ajonLeveys;
	}

	public void setAjonLeveys(Integer ajonLeveys) {
		this.ajonLeveys = ajonLeveys;
	}

	public Integer getAjonKorkeus() {
		return ajonKorkeus;
	}

	public void setAjonKorkeus(Integer ajonKorkeus) {
		this.ajonKorkeus = ajonKorkeus;
	}

	public String getKayttovoima() {
		return kayttovoima;
	}

	public void setKayttovoima(String kayttovoima) {
		this.kayttovoima = kayttovoima;
	}

	public Integer getIskutilavuus() {
		return iskutilavuus;
	}

	public void setIskutilavuus(Integer iskutilavuus) {
		this.iskutilavuus = iskutilavuus;
	}

	public Integer getSuurinNettoteho() {
		return suurinNettoteho;
	}

	public void setSuurinNettoteho(Integer suurinNettoteho) {
		this.suurinNettoteho = suurinNettoteho;
	}

	public Integer getSylintereidenLkm() {
		return sylintereidenLkm;
	}

	public void setSylintereidenLkm(Integer sylintereidenLkm) {
		this.sylintereidenLkm = sylintereidenLkm;
	}

	public String getAhdin() {
		return ahdin;
	}

	public void setAhdin(String ahdin) {
		this.ahdin = ahdin;
	}

	public String getMerkkiSelvakielinen() {
		return merkkiSelvakielinen;
	}

	public void setMerkkiSelvakielinen(String merkkiSelvakielinen) {
		this.merkkiSelvakielinen = merkkiSelvakielinen;
	}

	public String getMallimerkinta() {
		return mallimerkinta;
	}

	public void setMallimerkinta(String mallimerkinta) {
		this.mallimerkinta = mallimerkinta;
	}

	public String getVaihteisto() {
		return vaihteisto;
	}

	public void setVaihteisto(String vaihteisto) {
		this.vaihteisto = vaihteisto;
	}

	public Integer getVaihteidenLkm() {
		return vaihteidenLkm;
	}

	public void setVaihteidenLkm(Integer vaihteidenLkm) {
		this.vaihteidenLkm = vaihteidenLkm;
	}

	public String getKaupallinenNimi() {
		return kaupallinenNimi;
	}

	public void setKaupallinenNimi(String kaupallinenNimi) {
		this.kaupallinenNimi = kaupallinenNimi;
	}

	public String getVoimanvalJaTehostamistapa() {
		return voimanvalJaTehostamistapa;
	}

	public void setVoimanvalJaTehostamistapa(String voimanvalJaTehostamistapa) {
		this.voimanvalJaTehostamistapa = voimanvalJaTehostamistapa;
	}

	public String getTyyppihyvaksyntanro() {
		return tyyppihyvaksyntanro;
	}

	public void setTyyppihyvaksyntanro(String tyyppihyvaksyntanro) {
		this.tyyppihyvaksyntanro = tyyppihyvaksyntanro;
	}

	public String getYksittaisKayttovoima() {
		return yksittaisKayttovoima;
	}

	public void setYksittaisKayttovoima(String yksittaisKayttovoima) {
		this.yksittaisKayttovoima = yksittaisKayttovoima;
	}

	public String getKunta() {
		return kunta;
	}

	public void setKunta(String kunta) {
		this.kunta = kunta;
	}

	public Integer getCo2() {
		return co2;
	}

	public void setCo2(Integer co2) {
		this.co2 = co2;
	}
}
