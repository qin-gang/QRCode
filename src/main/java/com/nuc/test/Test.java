package com.nuc.test;

public class Test {



    /**
     * 进行本节点及其下边的结点的堆排序
     * @param tree
     * @param n
     * @param i
     */
    //主要操作是找出最大值，即父节点
    static void heapify(int tree[],int n,int i){
        if (i>=n) return;
        int c1 = 2 * i + 1 ;
        int c2 = 2 * i + 2 ;
        int max = i ;
        if (c1 < n && tree[c1]>tree[max]){
            max = c1;
        }
        if (c2 < n && tree [c2] > tree[max]){
            max = c2;
        }

        //需要交换
        if (max != i){
           swap(tree,max,i);
           heapify(tree,n,max);  //  它之下的堆排序
        }
    }

    /**
     * 从最后一个父节点依次向上进行堆排序
     * @param tree   堆数组
     * @param n      数组大小
     */
    static void build_heap(int[] tree,int n){
        int last_node = n-1;
        int parent = (last_node -1)/2;
        int i;
        for (i=parent;i>=0;i--){
            heapify(tree,n,i);
        }
    }

    /**
     * 进行交换   保证父节点大于子节点
     * @param tree
     * @param i
     * @param j
     */
    private static void swap(int[] tree, int i, int j) {
        int temp = tree[i];
        tree[i] = tree[j];
        tree [j] = temp;
    }

    /**
     * 堆进行排序
     * @param tree   堆数组
     * @param n      堆大小
     */
    public static void heap_sort(int[] tree,int n){
        build_heap(tree,n);
        int i;
        for (i=n-1;i>=0;i--){
            swap(tree,i,0);
            heapify(tree,i,0);
        }
    }

    public static void main(String[] args) {
        int tree[]={1,10,4,6,8,0,9};
        heap_sort(tree,tree.length);
        //heapify(tree,tree.length,0);
        for (int i=0;i<tree.length;i++){
            System.out.println(tree[i]);
        }
    }
}
