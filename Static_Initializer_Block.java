
    static Scanner input = new Scanner(System.in);
    static int B = input.nextInt();
    static int H = input.nextInt();
    static boolean flag = true;
    static{
        try{
            if(B<=0 || H<=0){
                flag=false;
                System.out.print("java.lang.Exception: Breadth and height must be positive");
            }
        }catch(Exception e){
             System.out.println(e);
        }
    } 
 
