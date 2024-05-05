import java.io.*;

class CreateFile
{
	public static void main(String args[]) throws Exception
	{
		//File f = new File("Vaibhavi.txt");
		File f = new File("XYZ.txt");
		
		//System.out.println(f.createNewFile());
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		f.setExecutable(true);
		System.out.println(f.canExecute());
		System.out.println(f.exists());
		System.out.println(f.renameTo(f));
		System.out.println(f.length());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.isHidden());
		System.out.println(f.lastModified());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getName());
		System.out.println(f.getTotalSpace());
		//System.out.println(f.delete());
		System.out.println(f.getName());
		f.setWritable(false);
		
		FileReader fr = new FileReader(f);
	}
}
