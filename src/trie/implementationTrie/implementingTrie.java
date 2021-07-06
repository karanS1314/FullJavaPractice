package trie.implementationTrie;

public class implementingTrie {
   
    class Trie{
        Node root;
        class Node{
            char x;
            int wordEnd = 0;
            Node children[];
    
            Node(char x){
                this.x = x;
                children = new Node[26];
            }
        }
        
        Trie(){
            root = new Node('\0');
        } 

        void insert(String word){
            Node curr = root;
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                if(curr.children[c - 'a'] == null){
                    curr.children[c - 'a'] = new Node(c);
                }
                curr = curr.children[c - 'a'];
            }
            curr.wordEnd++;
        }

        boolean search(String word){
            Node endNode = getNode(word);
            if(endNode != null && endNode.wordEnd > 0){
                return true;
            }

            return false;
        }

        boolean withPrefix(String prefix){
            Node endNode = getNode(prefix);
            if(endNode != null){
                return true;
            }

            return false;
        }

        Node getNode(String temp){
            Node curr = root;
            for(int i = 0; i < temp.length(); i++){
                char c = temp.charAt(i);
                if(curr.children[c - 'a'] == null){
                    return null;
                }
                curr = curr.children[c - 'a'];
            }
            return curr;
        }
    }  

    public static void main(String[] args) {
        


    
    }

}
