
public class MyStack{
 private Node[] values;

 public MyStack(){}
 public MyStack(Node[] values){
  this.values = values;
 }

 public Node pop(){
  Node result = null;
  if ((values != null) && (values.length > 0)){
   result = values[values.length - 1];
   
   Node[] tmpNode = new Node[values.length - 1];
   for (int i = 0; i < values.length – 1; i++)
    tmpNode[i] = values[i];
   this.values = tmpNode;
  }
  return result;
 }
 
 public void push(Node node){
  if (values == null){ // Ngăn xếp đang rỗng 
   values = new Node[1];
   values[0] = node;
  }
  else{ // Ngăn xếp đã có dữliệu 
   Node[] tmpNode = new Node[values.length + 1];
   for (int i = 0; i < values.length; i++)
    tmpNode[i] = values[i];
   tmpNode[values.length] = node;
   this.values = tmpNode;
  }
 }