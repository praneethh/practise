package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//find min takes O(1) and all other operations O(logn)

public class MinHeap {

    private List<Node> allNodes = new ArrayList<>();

    public class Node {
        int weight;
        String key;
    }

    public void add(int weight,String key){

        Node node=new Node();
        node.key=key;
        node.weight=weight;

        allNodes.add(node);

        int size = allNodes.size();
        int current = size - 1;
        int parentIndex = (current - 1) / 2;

        while (parentIndex >= 0) {
            Node parentNode = allNodes.get(parentIndex);
            Node currentNode = allNodes.get(current);
            if (parentNode.weight > currentNode.weight) {
                swap(parentNode,currentNode);

                current = parentIndex;
                parentIndex = (parentIndex - 1) / 2;
            } else {
                break;
            }
        }

    }

    private void swap(Node node1,Node node2){
        int weight = node1.weight;
        String data = node1.key;

        node1.key = node2.key;
        node1.weight = node2.weight;

        node2.key = data;
        node2.weight = weight;
    }



    public Node extractMin(){

        int size = allNodes.size() -1;
        Node minNode = new Node();
        minNode.key = allNodes.get(0).key;
        minNode.weight = allNodes.get(0).weight;

        allNodes.get(0).weight = allNodes.get(size).weight;
        allNodes.get(0).key = allNodes.get(size).key;

        allNodes.remove(size);

        int currentIndex = 0;
        size--;
        while(true){
            int left = 2*currentIndex + 1;
            int right = 2*currentIndex + 2;
            if(left > size){
                break;
            }
            if(right > size){
                right = left;
            }
            int smallerIndex = allNodes.get(left).weight <= allNodes.get(right).weight ? left : right;

            if(allNodes.get(currentIndex).weight > allNodes.get(smallerIndex).weight){
                swap(allNodes.get(currentIndex), allNodes.get(smallerIndex));
                currentIndex = smallerIndex;
            }else{
                break;
            }
        }
        return minNode;
    }

    public void printHeap(){
        for(Node n : allNodes){
            System.out.println(n.weight + " " + n.key);
        }
    }


    public static void main(String args[]){

        MinHeap mh=new MinHeap();

        mh.add(40,"praneeth");
        mh.add(30,"prasanth");
        mh.add(20,"pranay");
        mh.add(10,"pramod");

        mh.printHeap();

        System.out.println(mh.extractMin().weight);
        mh.printHeap();
    }
}
