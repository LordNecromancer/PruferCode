import java.util.ArrayList;
import java.util.Scanner;

public class PruferCode {

	public static void main(String[] args) {
		String answer="";
		Scanner scanner=new Scanner(System.in);
		int numberOfVertices=scanner.nextInt();
		ArrayList<Integer> vertices=new ArrayList<Integer>();
		for(int i=1;i<=numberOfVertices;i++) {
		vertices.add(i);
		}
		int[][] matrix=new int[numberOfVertices][numberOfVertices];

		for(int i=0;i<numberOfVertices;i++) {
			for(int j=0;j<numberOfVertices;j++) {
				int num=scanner.nextInt();
				if(num!=0 && num!=1) {
					System.out.print("Invalid input");
					break;
				}
				matrix[i][j]=num;
			}
		}
		
		for(int i=vertices.get(vertices.size()-1);i>0&& vertices.size()>2;) {
			int numberOfOnes=0;
			int index=0;
			for(int j=0;j<numberOfVertices;j++) {
			if(matrix[i-1][j]==1) {
				numberOfOnes++;
				index=j+1;
			}
		//	System.out.print(j);

		  }
			if(numberOfOnes==1) {
				answer=answer+" , "+index;
				matrix[i-1][index-1]=0;
				matrix[index-1][i-1]=0;
				vertices.remove(new Integer(i));
				i=vertices.get(vertices.size()-1);
			}
			else {
				i--;
			}
			

		}
		System.out.print(answer);

		
	}

}
