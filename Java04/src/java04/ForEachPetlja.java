package java04;

public class ForEachPetlja {

	public static void main(String[] args) {

		int[] niz = {2,5,3,6,8,9,-1,1,2,5};
		
		for(int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		
		System.out.println("---------------------------");
		
		for(int broj:niz) {
			if(broj==4) {
				continue;
			}
			if(broj==-1) {
				break;
			}
		
		System.out.println(broj);
	}

}
}