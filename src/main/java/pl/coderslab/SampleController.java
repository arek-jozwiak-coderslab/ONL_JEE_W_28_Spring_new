package pl.coderslab;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.WebUtils;

import java.util.Random;

@RestController
public class SampleController {
//    Logger logger = LoggerFactory.getLogger(SampleController.class);

    private final BookDao bookDao;

    public SampleController(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @RequestMapping("/sample-save")
    @ResponseBody
    public String home(){
        Book book = new Book();
        book.setTitleBook("Thinking in Java");
        book.setAuthor("Bruce Eckel");
        bookDao.saveBook(book);
        Long id = book.getId();
        return "saved";
    }


}
