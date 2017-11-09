package ohtu.verkkokauppa;

public interface IPankki {

	boolean tilisiirto(String nimi, int viite, String tiliNumero, String kaupanTili, int summa);

}