import java.util.*;

class Trie {
    TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word == null) {
            return;
        }

        int wordLength = word.length();
        if(wordLength == 0) {
            root.isWord = true;
        }

        TrieNode helper = root;
        for(int i = 0; i < wordLength; i++) {
            char ch = word.charAt(i);
            int a = (int)'a';
            int index = ((int)ch) - a;

            if(helper.children.get(index) == null) {
                helper.children.set(index, new TrieNode());
            }

            helper = helper.children.get(index);
        }

        helper.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word == null) {
            return false;
        }

        int wordLength = word.length();
        if(word.length() == 0) {
            return root.isWord;
        }

        TrieNode helper = root;
        for(int i = 0; i < wordLength; i++) {
            char ch = word.charAt(i);
            int a = (int)'a';
            int index = ((int)ch) - a;

            if(helper.children.get(index) == null) {
                return false;
            }

            helper = helper.children.get(index);
        }

        return helper.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(prefix == null) {
            return false;
        }

        int prefixLength = prefix.length();
        if(prefix.length() == 0) {
            return root.isWord;
        }

        TrieNode helper = root;
        for(int i = 0; i < prefixLength; i++) {
            char ch = prefix.charAt(i);
            int a = (int)'a';
            int index = ((int)ch) - a;

            if(helper.children.get(index) == null) {
                return false;
            }

            helper = helper.children.get(index);
        }

        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }

    class TrieNode {
        boolean isWord;
        ArrayList<TrieNode> children;

        public TrieNode() {
            isWord = false;
            children = new ArrayList<>();

            for(int i = 0; i < 26; i++) {
                children.add(null);
            }
        }
    }
}
