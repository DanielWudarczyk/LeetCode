import java.util.*;

class RandomizedSet {
    ArrayList<Integer> list;
    Random random;

    public RandomizedSet() {
        list=new ArrayList<>();
        random=new Random();
    }

    public boolean insert(int val) {
        if(list.contains(val)){
            return false;
        } else{
            list.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        if(list.contains(val)){
            list.remove(Integer.valueOf(val));
            return true;
        } else{
            return false;
        }
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */