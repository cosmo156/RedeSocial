package br.edu.ifpb.poo.commads.cli;

import br.edu.ifpb.poo.adpter.Commad;
import br.edu.ifpb.poo.domain.Usuario;
import br.edu.ifpb.poo.repository.AdmUsuarioRepository;
import br.edu.ifpb.poo.service.AdmUsuarioService;
import br.edu.ifpb.poo.validators.ContentValidator;
import br.edu.ifpb.poo.validators.ValidationContext;

public class SearchUserCommad implements Commad {
    @Override
    public void execute() {
        AdmUsuarioService admUsuarioService = new AdmUsuarioService(AdmUsuarioRepository.getInstance());

        ValidationContext<String> strValidationContext = new ValidationContext<>(new ContentValidator());
        String nome = strValidationContext.getValidValue("Digite o nome do usuário que deseja interagir: ", "Nome não pode ser vazio e deve ser maior do que 2 caracteres!", String.class);

        Usuario otherUser = admUsuarioService.search(nome);

    }
}
