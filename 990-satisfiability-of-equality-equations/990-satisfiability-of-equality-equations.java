class Solution {
    int[] nodes = new int[26];
    public boolean equationsPossible(String[] equations) {
        for(int i=0; i<26;i++){
            nodes[i] = i;
        }
        for(String e: equations){
            if(e.charAt(1) == '='){
                nodes[find(e.charAt(0) - 'a')] = find(e.charAt(3) - 'a');
            }
        }
        for(String e : equations){
            if(e.charAt(1) == '!' && nodes[find(e.charAt(0) - 'a')] == find(e.charAt(3) - 'a'))
               return false;
        }
        return true;
    }
    
    public int find(int x){
        if(x!=nodes[x])
            return find(nodes[x]);
        return nodes[x];
    }
}