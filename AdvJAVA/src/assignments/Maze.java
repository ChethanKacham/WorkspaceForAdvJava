package assignments;

import java.io.*;
import java.util.EmptyStackException;
import java.util.Stack;

import abc.Data;

//class Data {
    public int n; // dimension of maze
    public boolean[][] north; // is there a wall to north of cell i, j
    public boolean[][] east;
    public boolean[][] south;
    public boolean[][] west;

    public Data(String filename) {
        readMaze(filename);
    }

    public void readMaze(String filename) {
        try {
            File file = new File(filename);
            BufferedReader buf = new BufferedReader(new FileReader(file));

            String text = buf.readLine();
            n = Integer.parseInt(text);

            north = new boolean[n + 2][n + 2];
            east = new boolean[n + 2][n + 2];
            south = new boolean[n + 2][n + 2];
            west = new boolean[n + 2][n + 2];

            while ((text = buf.readLine()) != null) {
                String[] tokens = text.split(" ");
                int x = Integer.parseInt(tokens[0]);
                int y = Integer.parseInt(tokens[1]);
                north[x][y] = (tokens[2].equals("1") ? true : false);
                east[x][y] = (tokens[3].equals("1") ? true : false);
                south[x][y] = (tokens[4].equals("1") ? true : false);
                west[x][y] = (tokens[5].equals("1") ? true : false);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Node {
    int a, b;

    Node(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class Maze {
    private int n; // dimension of maze
    private boolean[][] visited;
    private boolean done = false;
    private Data data;

    public Maze(Data data) {
        this.data = data;
        this.n = data.n;
        StdDraw.setXscale(0, n + 2);
        StdDraw.setYscale(0, n + 2);
    }

    public void drawDot(int x, int y, String color) {

        float size = (float) 0.25;
        if (color.equals("RED")) {
            StdDraw.setPenColor(StdDraw.RED);
            size = (float) 0.375;
        } else if (color.equals("BLUE"))
            StdDraw.setPenColor(StdDraw.BLUE);
        else if (color.equals("GRAY"))
            StdDraw.setPenColor(StdDraw.GRAY);
        else
            StdDraw.setPenColor(StdDraw.BLACK);

        StdDraw.filledCircle(x + 0.5, y + 0.5, size);
        StdDraw.show();
        StdDraw.pause(200);
        // try{System.in.read();}
        // catch(Exception e){}
    }

    // draw the maze
    public void draw() {

        StdDraw.setPenColor(StdDraw.BLACK);
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                if (data.south[x][y])
                    StdDraw.line(x, y, x + 1, y);
                if (data.north[x][y])
                    StdDraw.line(x, y + 1, x + 1, y + 1);
                if (data.west[x][y])
                    StdDraw.line(x, y, x, y + 1);
                if (data.east[x][y])
                    StdDraw.line(x + 1, y, x + 1, y + 1);
            }
        }
        StdDraw.show();

        drawDot(n, 1, "RED");
        drawDot(1, n, "RED");
    }

    public void solve() {
        visited = new boolean[n + 2][n + 2];
        Stack<Node> stack = new Stack<Node>();
        stack.push(new Node(1, n));
        int a = 1, b = n;
        try{
            while (true) {
                if (a == n && b == 1) {
                    done = true;
                    drawDot(a, b, "BLUE");
                    break;
                }
                visited[a][b] = true;
                drawDot(a, b, "BLUE");
                if (!data.east[a][b] && !visited[a + 1][b]) {
                    stack.push(new Node(a + 1, b));
                    a++;
                } else if (!data.north[a][b] && !visited[a][b + 1]) {
                    stack.push(new Node(a, b + 1));
                    b++;
                } else if (!data.west[a][b] && !visited[a - 1][b]) {
                    stack.push(new Node(a - 1, b));
                    a--;
                } else if (!data.south[a][b] && !visited[a][b - 1]) {
                    stack.push(new Node(a, b - 1));
                    b--;
                } else {
                    drawDot(a, b, "GRAY");
                    stack.pop();
                    a = stack.peek().a;
                    b = stack.peek().b;
                }
            }

        }
        catch(EmptyStackException e){
            System.out.println("Empty Stack");
        }
    }

    static public void main(String args[]) {

        if (args.length > 0) {
            Data data = new Data(args[0]);
            Maze maze = new Maze(data);

            maze.draw();
            maze.solve();
        } else
            System.out.println("Cannot read data file ...");
    }
}
