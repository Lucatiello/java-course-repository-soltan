package by.it.academy.hw9;

public record Pair<A, B>(A first, B second) {
    @Override
    public String toString() {
        return "Swapping the value " + first + "  " + second;
    }

    public Pair<B, A> swap() {
        return new Pair<>(this.second, this.first);
    }

    public void setFirst(A first) {
        System.out.println(first);
    }

    public void setSecond(B second) {
        System.out.println(second);
    }
}
