import java.io.File;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Date;


public class Ex2 {


	public static int CountFilesInDirectory(File file){
		int count=0;  

		File [] files = file.listFiles();
		
		for(File arq:files){  


			if (arq.isDirectory()) {
				CountFilesInDirectory(arq);

				if(arq.isFile()){  
					System.out.println("Arquivo "+(++count)+": "+arq.getName());  

				}  
			}  

			System.out.println("\n número total de arquivos: "+count);  

		}
		return count;  
	}


	public static void main(String[] args) {  
 
	Path dir = '(C:\Users\Jose Oliveira\Documents\Challenge - JAVA PROPRAMMING DOJO - Randstad\Proj15\src)';
	try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
	    for (Path file: stream) {
	        System.out.println(file.getFileName());
	    }
	} catch (IOException | DirectoryIteratorException x) {
	    // IOException can never be thrown by the iteration.
	    // In this snippet, it can only be thrown by newDirectoryStream.
	    System.err.println(x);
	}
	

	System.out.println(file.list());
	
    int count = CountFilesInDirectory(file);
    
    System.out.println(count);

	}
	
	
	
} 


