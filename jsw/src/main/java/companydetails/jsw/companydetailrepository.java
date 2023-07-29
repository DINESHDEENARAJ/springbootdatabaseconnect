package companydetails.jsw;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface companydetailrepository extends JpaRepository<companydetail, Integer>
{
}
