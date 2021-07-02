package UnionFind;

public class UnionFind {
    //Implementation of UnionFind/Disjoint set via arrays using path compression

    //object atrributes
    // Tracks number of elems in UnionFind 
    private int size;

    /*Tracks the parent node of a given value i;
     root nodes are nodes such that id[i] = i*/
    private int[] id;

    // Tracks the size of every component/set
    private int[] sz;

    //Tracks the number of components/sets
    private int numComponents;

    public UnionFind(int size) {
        this.size = size = numComponents;
        sz = new int[size];
        id = new int[size];

        for (int i = 0; i < size; i++) {
            sz[i] = 1; //All components have size 1
            id[i] = i; //All components are their own parent nodes
        }
    }

    //finds and returns the root node of a given value and optimises the set
    public int find(int node) {
        //trivial case
        if (node == id[node]) {
            return node;
        }

        //Finding root
        int root = node;
        while (root != id[root]) {
            root = id[root];
        }

        //Path compression to give the DS amortized constant time complexity (what does this mean???)
        // root is now a pointer to the root node of all elems in the component
        while (node != root) {
            int temp = id[node]; //temporary pointer to parent node 
            id[node] = root;      //sets node's parent to root
            node = temp;         //sets node to parent of node
        }

        return root;
    }

    //Checks if two nodes are connected
    public boolean connected(int node1, int node2) {
        return find(node1) == find(node2);
    }

    // Return the size of the components/set 'node1' belongs to
    public int componentSize(int node1) {
        return sz[find(node1)];
    }

    // Return the number of elements in this UnionFind/Disjoint set
    public int size() {
        return size;
    }

    // Returns the number of remaining components/sets
    public int components() {
        return numComponents;
    }

    public void unify(int node1, int node2) {

        //find root nodes
        int root1 = find(node1);
        int root2 = find(node2);

        //trivial case 
        if (root1 == root2) {
            return;
        }

        //merge smaller into larger component
        if (sz[root1] < sz[root2]) {
            sz[root2] += sz[root1];
            id[root1] = root2;
            id[root2] = 0;
        } else {
            sz[root1] += sz[root2];
            id[root2] = root1;
            id[root1] = 0;
        }

    // Since the roots found are different we know that the
    // number of components/sets has decreased by one
        numComponents--;
    }

}
