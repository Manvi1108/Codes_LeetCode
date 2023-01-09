class Solution {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        char[] ls = word.toCharArray();
        int row = board.length;
        int col = board[0].length;
        visited = new boolean[row][col];
        for(int i = 0; i< row; i++){
            for(int j = 0; j<col; j++){
                if(ls[0] == board[i][j] && search(i,j,0,board,ls)){
                    return true;
                }
            }
        }
        return false;
    }


    public boolean search(int i, int j, int idx, char[][] board, char[] ls){
        if(idx == ls.length)
        return true;

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || visited[i][j] || ls[idx] != board[i][j]){
            return false;
        }

        visited[i][j] = true;
        if(search(i+1,j,idx+1,board,ls) || search(i,j+1,idx+1, board, ls) || search(i-1,j,idx+1,board,ls) || search(i,j-1,idx+1,board,ls)){
            return true;
        }

        visited[i][j] = false;
        return false;

    }

}