class Penyimpanan<T> {

    T data;

    void setData(T nilai) {
        data = nilai;
    }

    T getData() {
        return data;
    }

    public static void main(String[] args) {

        // String
        Penyimpanan<String> dataString = new Penyimpanan<>();
        dataString.setData("Laptop");
        System.out.println("String  : " + dataString.getData());

        // Integer
        Penyimpanan<Integer> dataInteger = new Penyimpanan<>();
        dataInteger.setData(100);
        System.out.println("Integer : " + dataInteger.getData());

        // Double
        Penyimpanan<Double> dataDouble = new Penyimpanan<>();
        dataDouble.setData(99.5);
        System.out.println("Double  : " + dataDouble.getData());
    }
}
