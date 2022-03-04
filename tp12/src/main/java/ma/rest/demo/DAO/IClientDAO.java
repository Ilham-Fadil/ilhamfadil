package ma.rest.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.rest.demo.Models.Client;


@Repository
public interface IClientDAO extends JpaRepository<Client, Long> {

}
