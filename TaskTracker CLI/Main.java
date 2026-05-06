import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        TaskManager taskManager=new TaskManager();
        taskManager.readFromFile();
        if(args.length==0)
        {
            System.out.println("No command provided.");
            return;
        }
        String command=args[0];
        switch(command)
        {
            case "add":
                if(args.length<2)
                {
                    System.out.println("Description is required for add command.");
                    return;
                }
                String description=args[1];
                taskManager.addTask(description);
                break;
        
        case "list":
                taskManager.listTasks();
                break;

        case "update":
                if(args.length<3)
                {
                    System.out.println("ID and new description are required for update command.");
                    return;
                }
                int id=Integer.parseInt(args[1]);
                String newDesc=args[2];
                taskManager.updateTask(id,newDesc);
                break;

        case "delete":
            if(args.length<2)
            {
                System.out.println("Delete command requires an ID.");
                return;
            }
            int id1=Integer.parseInt(args[1]);
            taskManager.deleteTask(id1);
            break;
        case "done":
            if(args.length<2)
            {
                System.out.println("Done command requires an ID.");
                return;
            }
            int id2=Integer.parseInt(args[1]);
            taskManager.markDone(id2);
            break;
         case "mark-in-progress":
            if(args.length<2)
            {
                System.out.println("Mark-in-progress command requires an ID.");
                return;
            }
            int id3=Integer.parseInt(args[1]);
            taskManager.markInProgress(id3  );
            break;
        default:
                System.out.println("Unknown command: " + command);

}
    }
}



