package ro.unibuc.pao.arrays;

public class WorkingWithArrays {

    /** Arrays can be defined in two ways. First one: */
    private int a[];

    /** Second one. This is preferred. */
    private int[] b;

    private int j, k[]; // evaluate: WorkingWithArrays.class.getDeclaredField("j").getType()

    private int[] l, m;

    /** This allows for better control when declaring multiple variables in one go. */
    private int c[], d; // here c is an array, while d is a simple int
    private int[] e, f; // here both e and f are arrays;

    /** In java, multi-dimension arrays can be thought of as list of lists of lists of... int. That's because multi-dimensional
     * arrays are not necessarily regular. One "line" can have 4 "columns" and another one 5 in a bi-dimensional array. Each
     * new dimension needs to instantiated separately. At declaration, dimensions are not defined, but only at instantiation.*/
    private int g[][] = new int[2][];

    { // instance initialization block
        g[0] = new int[4];
        g[1] = new int[5];
    }

    /** arrays can also be instantiated with explicit values at the time of declaration */
    private int h[][] = {{1, 2}, {2, 3}, {4, 5, 6}};
    private int i[][] = new int[][] {{1,2}, {2}, null};

    public static void main(String args[]) {
        WorkingWithArrays example = new WorkingWithArrays();
    }
}
