class Display{
    public void displayName()
    {
        System.out.print("Enter Your Name ");
    }
    public void displayHello(String userName)
    {
        String message = "Hello " + userName;
        System.out.println("+"+"-".repeat(message.length() + 6)+"+");
        System.out.println("| "+message+"...  |");
        System.out.println("+"+"-".repeat(message.length() + 6)+"+");
        System.out.println();
        System.out.println("Let's Get Started...");
        System.out.println();
    }
    public void dispGuess()
    {
        System.out.print("Enter Maximum Number ");
    }
    public void dispAnswer(int randomNumber , int userGuess)
    {
        if(randomNumber == userGuess)
        {
            System.out.println("+----------------------------------+");
            System.out.println("| Your Guess Is Matching Perfectly |");
            System.out.println("| You Won...                       |");
            System.out.println("+----------------------------------+");
            System.out.println();
        }
        else
        {
            System.out.println("+-----------------------------+");
            System.out.println("| Better Luck Next Time       |");
            System.out.println("| The Correct Number Was  " + randomNumber +  "   |");
            System.out.println("+-----------------------------+");
        }
    }
    public void dispendLine()
    {
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Do Next Turn...");
        System.out.println("-------------------------------");
        System.out.println();
    }
}

