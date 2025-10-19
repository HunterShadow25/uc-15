package Beans;
/**
*classe de controle de acesso entre as telas
*
*@javadoc
*/
public class UsuariosDTO {

    public static String usuarios = "nome";

    public static String getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(String usuarios) {
        UsuariosDTO.usuarios = usuarios;
    }

}
