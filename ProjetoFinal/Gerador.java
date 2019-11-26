
public class Gerador {

	private static int senhaNormal = -1;
	private static int senhaPreferencial = 0;

	public static int senhaNormal() {
		senhaNormal += 2;
		return senhaNormal;
	}

	public static int senhaPreferencial() {
		senhaPreferencial += 2;
		return senhaPreferencial;
	}
}
