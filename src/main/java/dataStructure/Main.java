package dataStructure;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList("elemento 1");

        list.append("elemento2");
        list.append("elemento3");
        list.prepend("elemento 0");



        list.remove(2);
        list.print();

//        list.insert(3, "elemento 2.5");
//        list.print();
//
//        list.set(1, "elemento 0.5");
//
//        list.print();


        //        System.out.println(list.get(2).data);


//        System.out.println(list.removeFirst().data);
        //list.print();
//        list.append("elemento4");
//        list.getHead();
//        list.getTail();
//        list.getLength();
//        list.print();
    }
}