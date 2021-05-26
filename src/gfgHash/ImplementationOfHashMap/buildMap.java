package gfgHash.ImplementationOfHashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class buildMap {
    public static class HashMap<K , V>{
        private class HMNode{
            K key;
            V val;
            HMNode(K key , V val){
                this.key = key;
                this.val = val;
            }
        }

        private int size;
        private LinkedList<HMNode>[] buckets;

        public HashMap(){
            initbuckets(4);
            size = 0;
        }

        private void initbuckets(int N){
            buckets = new LinkedList[N];
            for(int bi = 0; bi < buckets.length; bi++){
                buckets[bi] = new LinkedList<>();
            }
        }

        public void put(K key , V val){
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key , bi);
            
            if(di != -1){//update krni hai value is key ke corresponding
                HMNode node = buckets[bi].get(di);
                node.val = val;
            }
            else{// new value insert
                HMNode node = new HMNode(key , val);
                buckets[bi].add(node);
                size++; // this is the total no. of elements in the map and not the length of buckets
            }
            
            double lambda = size * 1.0 / buckets.length;
            if(lambda > 2.0){
                rehash();
            }
        }

        private int hashfn(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        public int getIndexWithinBucket(K key , int bi){
            int di = 0;
            for(HMNode node : buckets[bi]){
                if(node.key.equals(key)){
                    return di;
                }
                di++;
            }
            return -1;
        }

        public boolean containsKey(K key){
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key, bi);

            if(di == -1){
                return false;
            }
            return true;
        }

        public V get(K key){
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key, bi);

            if(di != -1){
                HMNode node = buckets[bi].get(di);
                return node.val;
            }
            else{
                return null;
            }
        }
        
        public void remove(K key){
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key, bi);

            if(di != -1){
                buckets[bi].remove(di);
                size--;
            }
        }

        public int size(){
            return size;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0; i < buckets.length; i++){
                for(HMNode node : buckets[i]){
                    keys.add(node.key);
                }
            }
            
            return keys;
        }

        public void rehash(){
            LinkedList<HMNode>[] oldBucket = buckets;

            initbuckets(oldBucket.length * 2);
            size = 0;

            for(int i = 0; i < oldBucket.length; i++){
                for(HMNode node : oldBucket[i]){
                    put(node.key , node.val);
                }
            }
        }
    }
    public static void main(String[] args) {

    }
}
