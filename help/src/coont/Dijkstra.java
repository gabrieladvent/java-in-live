//void BFS (int awal, int tujuan) {
//    int [] jarak = new int [vertexList];
//    String [] titik = new String [vertexList];
//    boolean visited [] = new boolean [vertexList];
//    LinkedList <Integer> queue = new LinkedList <Integer>();
//
//    visited [awal] = true;
//    queue.add (awal);
//    titik [awal] = kota [awal];
//    while (queue.size() != 0) {
//        awal = queue.poll ();
//                Iterator <EDGE> list = adjacency [awal].listIterator ();
//                int node;
//                while (list.hasNext()) {
//                    EDGE edge = list.next ();
//                    node = edge.getVertex ();
//                    if (!visited [node]) {
//                        titik [node] = titik [awal] + "]" + " --> " +
//                                "[" + kota [node];
//                        jarak [node] = jarak [awal] + edge.getBobot ();
//                        visited [node] = true;
//                        queue.add (node);
//                    }
//                }
//            
//    }
//    System.out.println("--> RUTE : [" + titik [awal] + "]");
//    System.out.println("--> JARAK: " + jarak [awal] + " Km");
//}