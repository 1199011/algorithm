package algorithm_practice;

import java.util.Arrays;

/**
 * @author lee
 *	배열에서 각 배열 순위를 구하는 법
 *	배열을 복사한 후 배열을 비교
 */
public class ArrRank {
	
	public int[] rank(int[] point) {
		int[] rankPoint = new int[point.length];
		int[] clonePoint = point.clone();
		
		for(int i = 0; i < point.length; i++ ) {
			int rank = 1;
			for(int j = 0; j < point.length; j++ ) {
				if(point[i] < clonePoint[j]) {
					rank++;
				}
				rankPoint[i] = rank;
			}
		}
		
		return rankPoint;
	}
	
	public static void main(String[] args) {
		
		int[] point = {40,13,89,52,7};
		ArrRank ar = new ArrRank();
		ar.rank(point);
		System.out.println(Arrays.toString(ar.rank(point)));
	}

}
