package controllers;

import java.util.HashSet;
import java.util.Set;

import models.Node;

public class Graph {
    Set<Node> nodes;

    //Constructor
    public Graph() {
        this.nodes = new HashSet<>();
    }

    // Metodo para añadir un nodo
    public Node addNode(int value) {
        Node newNode = new Node(value);
        nodes.add(newNode);
        return newNode;
    }

    public void addEdge(Node src, Node dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    // Metodo para imprimir el grafo
    // Para cada nodo imprimir sus conecciones
    public void printGraph() {
        for (Node node : nodes) {
        String linea = "Vertex " + node.getValue() + ": ";
        
        for (Node neighbor : node.getNeighbors()) {
            linea += neighbor.getValue() + " -> ";
        }

        if (!node.getNeighbors().isEmpty()) {
            linea = linea.substring(0, linea.length() - 4);
        }

        System.out.println(linea);
    }
 
    }
    

    public void getDFS(Node startnODE) {
    }

    private void getDFS(Node node, Boolean[] visited) {

    }

    public void getBFS(Node startNode) {

    }

    public int[] getAdjacencyMatrix(Node node) {

    }

    public void printAdjacencyMatrix() {

    }

}
