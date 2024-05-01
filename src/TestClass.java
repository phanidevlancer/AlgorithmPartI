public class TestClass {

    public static void main(String[] args) {
        QuickFind quickFind = new QuickFind(10);
        quickFind.union(4,3);
        quickFind.union(9,4);
        quickFind.union(3,2);
        quickFind.union(9,5);
        System.out.println("quickFind.connected(2,5) : "+quickFind.connected(2,5));


//        QuickUnion quickUnion = new QuickUnion(10);
//        quickUnion.union(4,3);
//        quickUnion.union(3,8);
//        quickUnion.union(9,4);
//        quickUnion.union(2,1);
//        quickUnion.union(5,0);
//        quickUnion.union(7,2);
//        quickUnion.union(6,1);
//        quickUnion.union(7,3);
//
//        System.out.println("connect 1,4 : "+quickUnion.connected(1,4));
//        System.out.println("connect 1,9 : "+quickUnion.connected(1,9));


    }
}
