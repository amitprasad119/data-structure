package com.amit.datastructure.graph;

import java.util.List;

public interface Graph {
    enum GraphType {
        DIRECTED,
        UNDIRECTED
    }
    void addEdges(int v1, int v2);
    List<Integer> getAdjacentVertices(int v);
}
