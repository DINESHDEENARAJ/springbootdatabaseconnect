package companydetails.jsw;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class companydetailservice
{
    @Autowired
    companydetailrepository com;

    public companydetail creation(companydetail comm)
    {
        return com.save(comm);
    }
    //get
    public  List<companydetail> listallcompanydetails()
    {
        return (List<companydetail>) com.findAll();
    }
//DELETE
    public String Deleting(int id)
    {
        companydetail ds=com.findById(id).orElse(new companydetail());
        com.delete(ds);
        return ds.getUsername()+"has been delete passed ";

    }
    //read by list
    public Optional<companydetail>readlist(int id)
    {
        return com.findById(id);
    }
}
