
public class RelogioDeAtleta {

	public static void main(String[] args){
	
	
	int cardiaRepouso = 60;	
	int cardiaAtual = 119;
	int oxigenio = 98;
	int calculoUm = cardiaRepouso * 3;
	int calculoDois = cardiaRepouso * 2;
		
		
		 
		 if(cardiaAtual > calculoUm || cardiaAtual < oxigenio){
			 System.out.println("Diminuir");
		 }
		 
		 
		 else if (cardiaAtual < calculoDois && oxigenio > 97) {
			 System.out.println("Aumentar");
		 }
		 
		 else{
			 System.out.println("manter");
		 }
		 
		 
		 
		 
		

	}

}
