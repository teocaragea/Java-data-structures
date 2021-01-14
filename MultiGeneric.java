public class MultiGeneric<T, S> {
    private T left;
    private S right;

    public MultiGeneric(T left, S right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public S getRight() {
        return right;
    }

    public void setRight(S right) {
        this.right = right;
    }
}
