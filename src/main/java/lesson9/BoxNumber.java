package lesson9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BoxNumber<T> {

    private T number;

    private List<BoxNumber<? super BoxNumber>> listNumber = new ArrayList<>();


    public BoxNumber() {

    }

    private BoxNumber(T num) {
        this.number = num;
    }

    public List<? extends BoxNumber> getListBoxNumber() {
        return listNumber;
    }

    public T getNum() {
        return number;
    }

    public void addList(BoxNumber<? super BoxNumber> boxNumber) {
        listNumber.add(boxNumber);
    }


    public void printNumber(List<? extends BoxNumber> list) {
        list.forEach(el -> System.out.println(el.getNum()));
    }


    public void addNumberList(List<? super BoxNumber> list, T num) {
        list.add(new BoxNumber(num));
    }



    public static void main(String[] args) {
        BoxNumber boxNumber = new BoxNumber();
        List listBoxNumber = boxNumber.getListBoxNumber();

        boxNumber.addList(new BoxNumber(new Float(10000.3)));


        boxNumber.addNumberList(listBoxNumber, new Integer(21));
        boxNumber.addNumberList(listBoxNumber, new Long((432L)));
        boxNumber.addNumberList(listBoxNumber, new BigDecimal("1500.00"));
        boxNumber.addNumberList(listBoxNumber, new Double(32.00));

        boxNumber.printNumber(boxNumber.getListBoxNumber());

    }


}
