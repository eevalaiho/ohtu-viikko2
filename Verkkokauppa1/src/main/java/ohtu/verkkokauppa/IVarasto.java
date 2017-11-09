package ohtu.verkkokauppa;

public interface IVarasto {

	public void palautaVarastoon(ITuote t);

	public ITuote haeTuote(int id);

	public int saldo(int id);

	public void otaVarastosta(ITuote t);
	
}