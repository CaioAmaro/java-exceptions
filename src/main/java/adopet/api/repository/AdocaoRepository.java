package adopet.api.repository;

import adopet.api.model.Adocao;
import adopet.api.model.StatusAdocao;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdocaoRepository extends JpaRepository<Adocao,Long> {

    Boolean existsPetIdAndStatus(@NotNull Long aLong, StatusAdocao statusAdocao);
}
