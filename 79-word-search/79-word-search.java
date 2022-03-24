class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if((word.charAt(0) == board[i][j]) && search(i,j,0,board,word,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean search(int i, int j, int index, char[][] board, String word, boolean[][] visited){
        if(index == word.length())
            return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || visited[i][j] || word.charAt(index) != board[i][j])
            return false;
        
        visited[i][j] = true;
        if(search(i+1,j,index+1,board,word,visited) || search(i,j+1,index+1,board,word,visited) || search(i,j-1,index+1,board,word,visited) || search(i-1,j,index+1,board,word,visited))
            return true;
        visited[i][j] = false;
        return false;
    }
}