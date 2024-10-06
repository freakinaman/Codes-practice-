class Foo {
    private volatile int flag = 1;

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        System.out.println("[first] Running");
        printFirst.run();
        flag = 2;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (flag != 2) {
            System.out.println("[second] Waiting");
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        System.out.println("[second] Running");
        printSecond.run();
        flag = 3;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (flag != 3) {
            System.out.println("[third] Waiting");
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        System.out.println("[third] Running");
        printThird.run();
    }
}