package object_oriented_programming.practice06.bl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Biblioteca {

    private final List<Material> materiales = new ArrayList<>();
    private final List<Usuario> usuarios = new ArrayList<>();

    public void registrarMaterial(Material material) throws BibliotecaException {
        Objects.requireNonNull(material, "El material es obligatorio.");
        for (Material registrado : materiales) {
            if (registrado.getId().equals(material.getId())) {
                throw new BibliotecaException("Ya existe un material con el identificador " + material.getId() + ".");
            }
        }
        materiales.add(material);
    }

    public void registrarUsuario(Usuario usuario) throws BibliotecaException {
        Objects.requireNonNull(usuario, "El usuario es obligatorio.");
        for (Usuario registrado : usuarios) {
            if (registrado.getId() == usuario.getId()) {
                throw new BibliotecaException("Ya existe un usuario con el identificador " + usuario.getId() + ".");
            }
        }
        usuarios.add(usuario);
    }

    public Material buscarMaterial(String id) throws MaterialNoEncontradoException {
        for (Material material : materiales) {
            if (material.getId().equals(id)) {
                return material;
            }
        }
        throw new MaterialNoEncontradoException("No existe el material " + id + ".");
    }

    public Usuario buscarUsuario(int id) throws UsuarioNoEncontradoException {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        throw new UsuarioNoEncontradoException("No existe el usuario " + id + ".");
    }

    public void prestarMaterial(int usuarioId, String materialId)
            throws UsuarioNoEncontradoException, MaterialNoEncontradoException,
            MaterialNoDisponibleException, MaximoPrestamosException {
        Usuario usuario = buscarUsuario(usuarioId);
        Material material = buscarMaterial(materialId);
        usuario.prestarMaterial(material);
    }

    public void devolverMaterial(int usuarioId, String materialId) throws BibliotecaException {
        Usuario usuario = buscarUsuario(usuarioId);
        Material material = buscarMaterial(materialId);
        usuario.devolverMaterial(material);
    }
}
