package es.pildoras.spring.mvc.validacionespersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CPostalMadridValidacion.class) // Esta notacion indica la futura clase que contendrá la lógica de la validación.
@Target({ ElementType.METHOD, ElementType.FIELD }) // Destino de nuestra validacion a metodos o campos.
@Retention(RetentionPolicy.RUNTIME) // Chequea la anotacion en tiempo de ejecución.
public @interface CPostalMadrid {

	// Definir el codigo postal por defecto

	public String value() default "28";

	// Definir el mensaje de error

	public String message() default "El C. postal debe comenzar por 28";

	// Definir los grupos
	
	Class<?>[] groups() default {};

	// Definir los payloads
	
	Class<? extends Payload>[] payload() default {};
 
}
