package s.fixed;

public class Main {
    public static void main(String[] args) {
        UserDataManager userManager = new UserDataManager("john_doe", "Password123");
        userManager.registerUser();
        userManager.loginUser();


        /*
        En este código, en representación de la letra “S” o Single Responsibility Principle, se puede observar una clase llamada UserDataManager, 
        la cual se encarga de gestionar el registro e inicio de sesión de un usuario. Sin embargo, además de estas funciones, la clase 
        también contiene la lógica de validación del nombre de usuario y la contraseña. El problema de este diseño se trata de que la 
        clase UserDataManager posee más de una responsabilidad, ya que no solo maneja los procesos de registro y autenticación, sino que 
        también valida las credenciales del usuario. Esto es incorrecto según el principio de responsabilidad única, el cual establece que 
        una clase debe tener una sola razón para cambiar. En este caso, las reglas de validación podrían modificarse por motivos distintos a 
        los cambios en la lógica de registro o inicio de sesión, generando un acoplamiento innecesario. Para solucionar este problema, se separa 
        la lógica de validación en una nueva clase, por Validator, encargada exclusivamente de validar el nombre de usuario y 
        la contraseña. De esta manera, la clase UserDataManager se enfoca únicamente en la gestión de usuarios, mientras que la validación 
        queda aislada en una clase independiente, cumpliendo correctamente con el principio de responsabilidad única.
        */
    }
}
