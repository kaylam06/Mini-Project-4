import org.graalvm.compiler.nodes.memory.FloatingReadNode;

class Main {
  public static void main(String[] args) {
    //objects are created from classes

    sum(2,3);

      Park k = new Park(10,5);

      System.out.println(k.locationOf());
    
    Tampa t = new Tampa(5,5);

    System.out.println(t.cityOf());

    Florida f = new Florida(20,4);

    System.out.println(f.stateOf());

  }

  static int sum(int num1, int num2)
  {
    return num1 + num2;
  }

}