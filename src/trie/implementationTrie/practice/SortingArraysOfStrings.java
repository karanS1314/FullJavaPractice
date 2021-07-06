package trie.implementationTrie.practice;

import java.util.*;

public class SortingArraysOfStrings {
    static Node root;
    static class Node{
        char x;
        int wordEnd = 0;
        Node children[];

        Node(char x){
            this.x = x;
            children = new Node[26];
        }
    }
    static void insert(String word){
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
    static boolean search(String word){
        Node endNode = getNode(word);
        if(endNode != null && endNode.wordEnd > 0){
            return true;
        }

        return false;
    }
    static boolean withPrefix(String prefix){
        Node endNode = getNode(prefix);
        if(endNode != null){
            return true;
        }

        return false;
    }

    static Node getNode(String temp){
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
    public static void main(String[] args) {
        String arr[] = {"abc", "xyz", "abcd", "bcd", "abc"};

        ArrayList<String> res = sort(arr);

        for(String ss : res){
            System.out.print(ss + " ");
        }
        System.out.println();

        // output should be --> abc abc abcd bcd xyz
    }


    static ArrayList<String> sort(String a[]){
        ArrayList<String> res = new ArrayList<>();
        if(a == null || a.length == 0){
            return res;
        }

        root = new Node('\0');
        Node curr = root;

        for(String ss : a){
            insert(ss);
        }

        for(Node child : curr.children){
            if(child != null){
                List<String> entry = dfs(child , "" , new ArrayList<>());
                res.addAll(entry);
            }
        }

        return res;
    }

    static List<String> dfs(Node node , String pre , List<String> temp){
        if(node.wordEnd > 0){
            for(int i = 0; i < node.wordEnd; i++){
                temp.add(pre + node.x);
            }
        }

        for(Node child : node.children){
            if(child != null){
                dfs(child , pre + node.x , temp);
            }
        }
        return temp;
    }
}
