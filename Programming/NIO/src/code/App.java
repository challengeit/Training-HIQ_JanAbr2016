package code;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Sandbox for NIO examples.
 * @author Challenge.IT
 */
public class App 
{
	
	
	public static void main(String[] args) throws IOException 
	{
		/*/ Path examples
		{
			FileSystem fs = FileSystems.getDefault();
			Path p1 = fs.getPath("test.txt");
			
			Path p2 = Paths.get("test.txt");
			Path p3 = Paths.get("a/b/c/d/e.txt");
			//Path p3 = Paths.get(URI.create("....."));
			
			System.out.println(p3.getFileName());
			System.out.println(p3.getParent());
			System.out.println(p3.getNameCount());
			System.out.println(p3.getRoot());
			System.out.println(p3.isAbsolute());
			System.out.println(p3.toAbsolutePath());
			System.out.println(p3.toUri());
		}
		//*/
		
		/*/ Path helper methods
		{
			Path p1 = Paths.get("/users/diogo/desktop/java");
			Path p2 = Paths.get("/users/diogo/../documents/training");
			Path p3 = Paths.get("b");
			
			Path normalizedPath = p2.normalize();
			//System.out.println(normalizedPath);
			
			Path subpath = p1.subpath(1, 3);
			//System.out.println(subpath);
			
			//System.out.println(p1.resolve(p3));
			
			//System.out.println(p1.relativize(p2));
		}
		//*/
		
		/*/ Files examples
		{
			Path p1 = Paths.get("/users/diogomatos/desktop/test_folder/hello1.txt");
			//System.out.println(Files.exists(p1, LinkOption.NOFOLLOW_LINKS));
			//System.out.println(Files.notExists(p1));
			
			Path p2 = Paths.get("/users/diogomatos/desktop/a/b/c/abc.txt");
			//Files.createDirectories(p2.getParent());
			//Files.createFile(p2);
			
			//Path p3 = Paths.get("/users/diogomatos/desktop/hello1.txt");
			//Files.deleteIfExists(p3);
			
			Path src = Paths.get("/users/diogomatos/desktop/test_folder");
			Path dst = Paths.get("/users/diogomatos/desktop/copy_to_folder/test_folder");
			//Files.copy(src, dst);
			//Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
			
			Files.move(src, dst, StandardCopyOption.REPLACE_EXISTING);
		}
		//*/
		
		// walk file tree
		{
			Path dst = Paths.get("/users/diogomatos/desktop/copy_to_folder");
			Files.walkFileTree(dst, new FileVisitor<Path>() {
				@Override
				public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
					System.out.println("PRE: " + dir);
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					System.out.println("VISIT: " + file.getFileName());
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
					System.out.println("FAIL: " + file.getFileName());
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
					System.out.println("POST: " + dir);
					return FileVisitResult.CONTINUE;
				}
			});
		}
	}
}