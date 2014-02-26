package easigreen.system;

import java.io.*;

import org.testng.annotations.*;

/**
 * Tests ResourceGetter functionality.
 * In the process, gets some needed resources!
 *
 * @author Rick Neff
 */
public class TestResourceGetter
{
   /**
    * Holds a Shell object.
    */
   private Shell mShell;

   /**
    * Holds a File folder object.
    */
   private File mFolder;

   /**
    * Constructs a TestResourceGetter instance.
    */
   public TestResourceGetter()
   {
      // intentionally left empty
   }

   /**
    * Sets up each test by creating a new Shell object.
    */
   @BeforeMethod
   public void setUp()
   {
      mShell = new Shell(true);
      String folderName = System.getenv("PH") + File.separator + "lib";
      mFolder = new File(folderName);
      try
      {
         mShell.mkdir(mFolder);
      }
      catch (Exception e)
      {
         System.out.println(e);
      }
   }

   /**
    * Tests getting the first dependencies resources.
    */
   @Test(timeOut = 30000)
   public void gettingFirstDependencies()
   {
      System.out.print("Getting first dependencies...");
      String specification =
         "https://sqlite4java.googlecode.com/files/sqlite4java-282.zip";
      String fileName1 = "sqlite4java-282/sqlite4java.jar";
      String osName = System.getProperty("os.name");
      String fileName2 =
         (osName.startsWith("Mac") ?
          "sqlite4java-282/libsqlite4java-osx.jnilib" :
          (osName.startsWith("Linux") ?
           "sqlite4java-282/libsqlite4java-linux-amd64.so" :
           (osName.startsWith("Windows") ?
            "sqlite4java-282/sqlite4java-win32-x86.dll" :
            "sqlite4java-282/libsqlite4java-android-armv7.so")));
      String file1BaseName = fileName1.substring(fileName1.indexOf('/') + 1);
      String file2BaseName = fileName2.substring(fileName2.indexOf('/') + 1);
      File file1 = new File(mFolder, file1BaseName);
      File file2 = new File(mFolder, file2BaseName);
      if (file1.exists())
      {
         System.out.print("already " );
      }
      else
      {
         ResourceGetter.extractToFile(specification, mFolder.getPath(),
                                      fileName1, fileName2);
      }
      if (osName.startsWith("Mac"))
      {
         try
         {
            File dylib = new File(mFolder, "libsqlite4java-osx.dylib");
            if (! dylib.exists())
            {
               mShell.move(file2, dylib);
            }
            file2 = dylib;
         }
         catch (Exception e)
         {
            System.out.println(e);
         }
      }
      assert (file1.exists());
      assert (file2.exists());

      System.out.println("done.");
   }

   /**
    * Tests getting the second dependency resource.
    */
   @Test(timeOut = 7000)
   public void gettingSecondDependency()
   {
      System.out.print("Getting second dependency...");
      String spec = 
         "https://google-gson.googlecode.com/files/google-gson-2.2.4-release.zip";
      String fileName = "google-gson-2.2.4/gson-2.2.4.jar";
      String fileBaseName = fileName.substring(fileName.indexOf('/') + 1);
      File file = new File(mFolder, fileBaseName);
      if (file.exists())
      {
         System.out.print("already " );
      }
      else
      {
         ResourceGetter.extractToFile(spec, mFolder.getPath(), fileName);
      }
      assert (file.exists());
      System.out.println("done.");
   }
}
