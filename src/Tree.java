import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Tree {
    private int leaves;
    private int id;

    public Tree(int leaves, int id) {
        this.leaves = leaves;
        this.id = id;
    }

    public int getLeaves() {
        return leaves;
    }

    public int getId() {
        return id;
    }
}

class ArrayListChallenge {
    public static void main(String[] args) {
        List<Tree> treeList = new ArrayList<>();
        Random rand = new Random();

        //Create 100 tree objects
        for (int i = 0; i < 100; i++) {
            int leaves = rand.nextInt(100) + 1;
            Tree tree = new Tree(leaves, i + 1);
            treeList.add(tree);
        }

        //Calculate the total number of leaves
        int totalLeaves = 0;
        for (Tree tree : treeList) {
            totalLeaves += tree.getLeaves();
        }
        System.out.println("Total leaves: " + totalLeaves);

        int maxLeaves = 0;
        Tree treeWithMaxLeaves = null;
        for (Tree tree : treeList) {
            if (tree.getLeaves() > maxLeaves) {
                maxLeaves = tree.getLeaves();
                treeWithMaxLeaves = tree;
            }
        }
        System.out.println("The tree with the most leaves is - ID: " + treeWithMaxLeaves.getId() + ", Leaves " + treeWithMaxLeaves.getLeaves());
    }
}
