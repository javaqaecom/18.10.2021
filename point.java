public class point {
    int x;
    int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void nextx(){

        this.x++;
    }
    void nexty(){

        this.y++;
    }

    @Override
    public String toString() {
        return "point{" +x +","+y+"}";



    }
}
