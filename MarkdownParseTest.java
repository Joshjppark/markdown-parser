import static org.junit.Assert.*;
import org.junit.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class MarkdownParseTest {
    
    @Test
    public void testsnippet1() {
        try {
            assertEquals(List.of("google.com"),
            MarkdownParse.getLinks(Files.readString(Path.of("snippet1.md"))));
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    @Test
    public void testsnippet2() {
        try {
            assertEquals(List.of("a.com", "a.com(())", "example.com"), 
            MarkdownParse.getLinks(Files.readString(Path.of("snippet1.md"))));
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    @Test
    public void testsnippet3() {
        try {
            assertEquals(List.of("https://www.twitter.com", 
            "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedu", 
            "https://cse.ucsd.edu/"), MarkdownParse.getLinks(Files.readString(Path.of("snippet1.md"))));
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    // @Test
    // public void addition() {
    //     assertEquals(2, 1+1); // checks that 2 == 1+1
    // }

    
    // @Test
    // public void testbasegetLinks() {
    //     try {
    //         assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    //     } catch (Exception e) {
    //         throw new IllegalArgumentException();
    //     }
    // }

    // @Test
    // public void test1getLinks() {
    //     try {
    //         assertEquals(List.of("https://www.youtube.com/"), MarkdownParse.getLinks(Files.readString(Path.of("test1.md"))));
    //     } catch (Exception e) {
    //         throw new IllegalArgumentException();
    //     }
    // }

    // @Test
    // public void test2getLinks() {
    //     try {
    //         assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test2.md"))));
    //     } catch (Exception e) {
    //         throw new IllegalArgumentException();
    //     }
    // }

    // @Test
    // public void test3getLinks() {
    //     try {
    //         assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test3.md"))));
    //     } catch (Exception e) {
    //         throw new IllegalArgumentException();
    //     }
    // }

    // @Test
    // public void test4getLinks() {
    //     try {
    //         assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test4.md"))));
    //     } catch (Exception e) {
    //         throw new IllegalArgumentException();
    //     }
    // }

    // @Test
    // public void test5getLinks() {
    //     try {
    //         assertEquals(List.of("hi.com"), MarkdownParse.getLinks(Files.readString(Path.of("test5.md"))));
    //     } catch (Exception e) {
    //         throw new IllegalArgumentException();
    //     }
    // }

    // @Test
    // public void test6getLinks() {
    //     try {
    //         assertEquals(List.of("thislinkhas()parenthesis.com"), MarkdownParse.getLinks(Files.readString(Path.of("test6.md"))));
    //     } catch (Exception e) {
    //         throw new IllegalArgumentException();
    //     }
    // }

    // @Test
    // public void test_file2getLinks() {
    //     try {
    //         assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(Files.readString(Path.of("test-file2.md"))));
    //     } catch (Exception e) {
    //         throw new IllegalArgumentException();
    //     }
    // }
    
    // @Test
    // public void test_file3getLinks() {
    //     try {
    //         assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file3.md"))));
    //     } catch (Exception e) {
    //         throw new IllegalArgumentException();
    //     }
    // }

    // @Test
    // public void test_file4getLinks() {
    //     try {
    //         assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file4.md"))));
    //     } catch (Exception e) {
    //         throw new IllegalArgumentException();
    //     }
    // }

    // @Test
    // public void test_file5getLinks() {
    //     try {
    //         assertEquals(List.of("page.com"), MarkdownParse.getLinks(Files.readString(Path.of("test-file5.md"))));
    //     } catch (Exception e) {
    //         throw new IllegalArgumentException();
    //     }
    // }

    // @Test
    // public void test_file6getLinks() {
    //     try {
    //         assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file6.md"))));
    //     } catch (Exception e) {
    //         throw new IllegalArgumentException();
    //     }
    // }

    // @Test
    // public void test_file7getLinks() {
    //     try {
    //         assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file7.md"))));
    //     } catch (Exception e) {
    //         throw new IllegalArgumentException();
    //     }
    // }

    // @Test
    // public void test_file8getLinks() {
    //     try {
    //         assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file8.md"))));
    //     } catch (Exception e) {
    //         throw new IllegalArgumentException();
    //     }
    // }

    // @Test
    // public void test_file9getLinks() {
    //     try {
    //         assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file8.md"))));
    //     } catch (Exception e) {
    //         throw new IllegalArgumentException();
    //     }
    // }
}
