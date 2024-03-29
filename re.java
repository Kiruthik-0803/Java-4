class mark {
    int mark1, mark2, mark3, mark4;

    mark(int mark1,int mark2,int mark3,int mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }



void display() {
    System.out.println(mark1 + "," + mark2 + "," + mark3 + "," + mark4);
    System.out.println(calculate());
}

int calculate() {
    return (mark1 + mark2 + mark3 + mark4) / 4;
}
}

class re {
    public static void main(String[] args) {
        mark m = new mark(1,3,6,8);
        m.display();
    }
}