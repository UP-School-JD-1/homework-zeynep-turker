public class Point {
    int x;
    int y;

    //Başlatma bloğu örneği
    {
        x = 0;
        y = 0;
    }

    public Point() {
        this(0, 0);
    }

    public Point(int x) {
        this(x, 0);
    }

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
        System.out.println("Point " + this.printPoint() + " oluşturuldu.");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Point'in orijine olan uzaklığı bulunur
     *
     * @return uzaklık
     */
    public double findDistanceToOrijin() {
        double distance;
        distance = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        return distance;
    }

    /**
     * Yollanan point nesnesiyle olan uzaklık bulunur
     *
     * @param point Point nesnesi
     * @return uzaklık
     */
    public double findDistanceToPoint(Point point) {
        double distance;
        distance = Math.sqrt(Math.pow((this.x - point.getX()), 2) + Math.pow((this.y - point.getY()), 2));

        return distance;
    }

    /**
     * point nesnesinin sahip olduğu x ve y değerleri ile yeni bir Point nesnesi oluşturulup return edilir
     *
     * @return Point nesnesi
     */
    public Point clone() {
        System.out.println(this.printPoint() + " noktası klonlanıyor...");
        return new Point(getX(), getY());
    }

    /**
     * belirtilen yönde ilerlenir
     *
     * @param direction yön
     * @param number    ilerlenecek miktar
     */
    public void move(char direction, int number) {
        if (direction == 'x')
            this.x += number;
        else if (direction == 'y')
            this.y += number;
        else
            System.out.println("Yanlış yön girdiniz. Lütfen 'x' veya 'y' şeklinde giriniz.");
    }

    /**
     * Point bilgileri ekrana bastırılır
     * this kullanmasak da olur (gereksiz kullanım)
     */
    public String printPoint() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
