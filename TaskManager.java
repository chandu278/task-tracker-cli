import java.util.*;
import java.io.*;


public class TaskManager {
    
    ArrayList<Task>tasks=new ArrayList<>();
    File file=new File("./tasks.txt");
    public void addTask(String description)
    {
        Scanner sc=new Scanner(System.in);
    
        String status="pending";
        String createAt=java.time.LocalDate.now().toString();
        String updateAt=java.time.LocalDate.now().toString();
        int id=tasks.size()+1;
        Task task=new Task(id,description,status,createAt,updateAt);
        tasks.add(task);
        saveTasksToFile();
             sc.close();
    }  
    public void listTasks()
    {
        for(Task t:tasks)
        {
            System.out.println(t.getId() + ". " + t.getDescription() + " - " + t.getStatus());

        }
    }  
    public void updateTask(int id,String newDesc)
    {
        for(Task t:tasks)
        {
            if(t.getId()==id)
            {
                t.setDescription(newDesc);
                t.setUpdateAt(java.time.LocalDate.now().toString());
                saveTasksToFile();
            }
        }
    }
    public void deleteTask(int id)
    {
        for(Task t:tasks)
        {
            if(t.getId()==id)
            {
                tasks.remove(t);
                saveTasksToFile();
                break;
            }
        }
    }
    public void markDone(int id)
    {
        for(Task t:tasks)
        {
            if(t.getId()==id)
            {
                t.setStatus("done");
                saveTasksToFile();
                break;
            }
        }
    }

    public void markInProgress(int id)
    {
        for(Task t:tasks)
        {
            if(t.getId()==id)
            {
                t.setStatus("in progress");
                saveTasksToFile();
                break;
            }
        }
    }

    
    public void saveTasksToFile()
    {
        
        try{
            BufferedWriter fw=new BufferedWriter(new FileWriter(file));
            fw.write("[\n");
            for(int i=0;i<tasks.size();i++)
            {
                Task t=tasks.get(i);
                fw.write("{\n");
                fw.write("    \"id\":"+t.getId()+",\n");
                fw.write("    \"description\":\""+t.getDescription()+"\",\n");
                fw.write("    \"status\":\""+t.getStatus()+"\",\n");
                fw.write("    \"createdAt\":\""+t.getCreateAt()+"\",\n");
                fw.write("    \"updatedAt\":\""+t.getUpdateAt()+"\"\n");
                fw.write("}");
                if(i<tasks.size()-1) fw.write(",");
                fw.write("\n");
            }
            fw.write("]");
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void readFromFile() throws IOException
    {
        BufferedReader br=null;
        StringBuilder sb=new StringBuilder();
        if(!file.exists())
        {
            file.createNewFile();
            return;
        }
        
            
        try{
            br=new BufferedReader(new FileReader(file));
           
            String line;
            
            while((line=br.readLine())!=null)
            {
                sb.append(line.trim());
            }
        
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        br.close();

        String content=sb.toString();
        if(content.length()<=2)
        {
           return;
        }
        content=content.substring(1,content.length()-1);
        String [] obj=content.split("\\},\\{");
        for(String s:obj)
        {
            int id = 0;
            String description = "";
            String status = "";
            String createdAt = "";
            String updatedAt = "";
            
            s=s.replace("{","");
            s=s.replace("}","");
            String [] fields=s.split(",");
            for(String f:fields)
            {
                String [] kv=f.split(":");
                String key=kv[0].trim().replace("\"","");
                String value=kv[1].trim().replace("\"","");
                if(key.equals("id"))
                {
                    id=Integer.parseInt(value);
                }
                else if(key.equals("description"))
                {
                    description=value;
                }
                else if(key.equals("status"))
                {
                    status=value;
                }
                else if(key.equals("createdAt"))
                {
                    createdAt=value;
                }
                else if(key.equals("updatedAt"))
                {
                    updatedAt=value;
                }
            }
            Task t = new Task(id, description, status, createdAt, updatedAt);
            tasks.add(t);
        } 
   
    }
}
