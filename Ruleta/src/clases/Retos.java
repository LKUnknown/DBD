package clases;

public class Retos {

	
	public static String HabilidosoGrimm() {
		String res = null;
		PerksGrimm[] aux = PerksGrimm.values();
		int Randomindex = (int)(Math.random()*62);
		
		res = aux[Randomindex].toString();
		if(res == "Me_la_pela") {
			res = "Me_la_pela  Jajaja, pringao";
		}
		return res;
	}
	
	public static String HabilidosoAroa() {
		String res = null;
		PerksAroa[] aux = PerksAroa.values();
		int Randomindex = (int)(Math.random()*47);
		
		res = aux[Randomindex].toString();
		if(res == "Me_la_pela") {
			res = "Me_la_pela  Jajaja, pringao";
		}
		return res;
	}
	
	public static String HabilidosoNiels() {
		String res = null;
		PerksNiels[] aux = PerksNiels.values();
		int Randomindex = (int)(Math.random()*65);
		
		res = aux[Randomindex].toString();
		if(res == "Me_la_pela") {
			res = "Me_la_pela  Jajaja, pringao";
		}
		return res;
	}
	
	public static String HabilidosoRea() {
		String res = null;
		PerksRea[] aux = PerksRea.values();
		int Randomindex = (int)(Math.random()*47);
		
		res = aux[Randomindex].toString();
		if(res == "Me_la_pela") {
			res = "Me_la_pela  Jajaja, pringao";
		}
		return res;
	}
	
	public static String HabilidosoSilas() {
		String res = null;
		PerksSilas[] aux = PerksSilas.values();
		int Randomindex = (int)(Math.random()*80);
		
		res = aux[Randomindex].toString();
		
		if(res == "Me_la_pela") {
			res = "Me_la_pela  Jajaja, pringao";
		}
		return res;
	}
	
}
