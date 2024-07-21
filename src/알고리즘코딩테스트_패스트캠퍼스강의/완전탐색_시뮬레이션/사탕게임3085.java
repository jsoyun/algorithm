//package 알고리즘코딩테스트_패스트캠퍼스강의.완전탐색_시뮬레이션;
//
//public class 사탕게임3085 {
//    public static void main(String[] args) {
//
//        //1. 가능한 모든 쌍의 사탕을 서로 교환한다.
//        public static void swapCandy(char[][] map, int r1, int c1, int r2, int c2){
//            char tmp = map[r1][c1];
//            map[r1][c1] = map[r2][c2];
//            map[r2][c2] = tmp;
//
//        }
//        int answer=0;
//        //인접한 사탕이 교환 가능함!!
//       for(int i =0; i< N; i++){
//           for(int j =0; j< N; j++){
//               //올바른 좌표인지 검증 j+1 보다는 커야 다음 교체할
//               if(j+1 <N && map[i][j] != map[i][j+1]){
//                   swapCandy(map, i,j,i,j+1);
//                   //교환한 상태에서 최대값
//                   ans = Math.max(answer,Math.max(findMaxColumn(map), findMaxRow(map)));
//                   swapCandy(map, i,j,i,j+1);
//               }
//               if(i+1 <N && map[i][j] != map[i+1][j]){
//                   swapCandy(map, i,j,i+1,j);
//                   //교환한 상태에서 최대값
//                   ans = Math.max(answer,Math.max(findMaxColumn(map), findMaxRow(map)));
//                   swapCandy(map, i,j,i+1,j);
//               }
//
//           }
//       }
//        //2. 교환한 상태에서 가장 긴 연속 부분 행, 열을 찾는다.
//
//        public static int findMaxRow(char[][] map){
//           int N = map.length;
//           int maxRow = 0;
//           for (int r=0; r<N;r++){
//               int len =1;
//               for (int c =1; c<N; c++){
//                   //연속하는 같은 값이면 길이 늘어남
//                   if(map[r][c] == map[r][c-1]) len++;
//                   else{
//                       maxRow = Math.max(maxRow,len);
//                       len =1;
//                   }
//               }
//               maxRow = Math.max(maxRow,len);
//
//           }
//           return maxRow;
//        }
//        //3. 교환한 사탕을 원복한다.
//    }
//}
