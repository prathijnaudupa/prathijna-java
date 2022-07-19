class Run {

    class Running {
 
        public void show()
        {
            System.out.println("Inner class");
        }
    }
}

class Sports {
 
    public static void main(String[] args)
    {

        Run.Running in = new Run().new Running();
        in.show();
    }
}