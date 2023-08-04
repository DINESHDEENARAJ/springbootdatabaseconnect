package companydetails.jsw;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class companydetailcontrol
{
    @Autowired
            //POST
    companydetailservice servo;
    @PostMapping("/newcompanydetail")
    public String adding (@RequestBody companydetail cmpy)
    {
        return servo.creation(cmpy).getUsername()+"has been add success";
    }

    //get
    @GetMapping("readonlist")
    public List<companydetail> viewall()
    {
        return servo.listallcompanydetails();
    }
    //put or change the id name
    @PutMapping("updating")

    public String updating (@RequestBody companydetail cmp)
    {
        companydetail com =servo.creation(cmp);
        return com.getUserid()+"has been update pass";
    }
    //delete method
    @DeleteMapping("/deletebyid/{id}")
    public String removing(@PathVariable("id")int id)
    {
        return servo.Deleting(id);
    }
    //read by list
    @GetMapping("/readlist/{id}")
    public Optional<companydetail> gettingon(@PathVariable("id")int id)
    {
        return servo.readlist(id);
    }
}
