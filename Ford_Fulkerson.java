package Ford_Fulkerson;
import java.util.ArrayList;

class Ford_Fulkerson {

   private ArrayList<ArrayList<Integer[]>> G = new ArrayList<ArrayList<Integer[]>>();
   private int[][] g;

   // Default constructor
   Ford_Fulkerson() {
      this.g = new int[8][8];
      this.g[0][1] = 10;
      this.g[0][2] = 5;
      this.g[0][3] = 15;
      this.g[1][2] = 4;
      this.g[1][4] = 9;
      this.g[1][5] = 15;
      this.g[2][3] = 4;
      this.g[2][5] = 8;
      this.g[3][6] = 30;
      this.g[4][5] = 15;
      this.g[4][7] = 10;
      this.g[5][6] = 15;
      this.g[5][7] = 10;
      this.g[6][2] = 30;
      this.g[6][7] = 10;
      ArrayList<Integer[]> one = new ArrayList<Integer[]>();
      ArrayList<Integer[]> two = new ArrayList<Integer[]>();
      ArrayList<Integer[]> three = new ArrayList<Integer[]>();
      ArrayList<Integer[]> four = new ArrayList<Integer[]>();
      ArrayList<Integer[]> five = new ArrayList<Integer[]>();
      ArrayList<Integer[]> six = new ArrayList<Integer[]>();
      ArrayList<Integer[]> seven = new ArrayList<Integer[]>();
      ArrayList<Integer[]> eight = new ArrayList<Integer[]>();
      ArrayList<ArrayList<Integer[]>> G = new ArrayList<ArrayList<Integer[]>>();
      Integer[] s2 = {2,10};
      Integer[] s3 = {3,5};
      Integer[] s4 = {4,15};
      Integer[] two3 = {3,4};
      Integer[] two5 = {5,9};
      Integer[] two6 = {6,15};
      Integer[] three4 = {4,4};
      Integer[] three6 = {6,8};
      Integer[] four7 = {4,30};
      Integer[] five6 = {6,15};
      Integer[] five8 = {8,10};
      Integer[] six7 = {7,15};
      Integer[] six8 = {8,10};
      Integer[] seven8 = {8,10};
      one.add(s2);
      one.add(s3);
      one.add(s4);
      two.add(two3);
      two.add(two5);
      two.add(two6);
      three.add(three4);
      three.add(three6);
      four.add(four7);
      five.add(five6);
      five.add(five8);
      six.add(six7);
      six.add(six8);
      seven.add(seven8);
      G.add(one);
      G.add(two);
      G.add(three);
      G.add(four);
      G.add(five);
      G.add(six);
      G.add(seven);
      G.add(eight);
      printGraph();
   }

   // Import graph constructor
   Ford_Fulkerson(ArrayList graph) {
      this.G = graph;
   }
   
   // Getter
   ArrayList<ArrayList<Integer[]>> getGraph() {
      return this.G;
   }
   
   // Setter
   void setGraph(ArrayList<ArrayList<Integer[]>> graph) {
      this.G = graph;
   }
   
   void printGraph() {
      System.out.println(this.g.length);
      System.out.println(this.g[0].length);
      System.out.println(this.g[1].length);
      for(int i = 0; i < this.g[0].length; i++) {
         for(int j = 0; j < this.g[1].length; j++) {
            System.out.println("test");
         }
      }
   }
   
   public static void main(String[] args) {
      Ford_Fulkerson a = new Ford_Fulkerson();
      System.out.println("Test successful.");
   }
}