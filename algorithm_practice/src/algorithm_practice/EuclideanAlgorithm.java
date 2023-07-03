package algorithm_practice;

/**
 * @author lee
 * 유클리드 호제법으로 최대 공약수 구하기(x>=y)
 */
public class EuclideanAlgorithm {

	public int euclidean(int x, int y) {
		
		while(y !=0) {
			int r = x%y;
			x = y;
			y = r;
		}
		return x;
	}
	
	public static void main(String[] args) {

	}

}
