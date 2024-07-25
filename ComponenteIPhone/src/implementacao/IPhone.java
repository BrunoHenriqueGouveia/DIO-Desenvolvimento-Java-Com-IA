package implementacao;

public class IPhone {
	
	  private ReprodutorMusical reprodutorMusical;
	  private AparelhoTelefonico aparelhoTelefonico;
	  private NavegadorInternet navegadorInternet;

	  public IPhone() {
	    reprodutorMusical = new ReprodutorMusical();
	    aparelhoTelefonico = new AparelhoTelefonico();
	    navegadorInternet = new NavegadorInternet();
	  }

	  public ReprodutorMusical getReprodutorMusical() {
	    return reprodutorMusical;
	  }

	  public AparelhoTelefonico getAparelhoTelefonico() {
	    return aparelhoTelefonico;
	  }

	  public NavegadorInternet getNavegadorInternet() {
	    return navegadorInternet;
	  }
	}