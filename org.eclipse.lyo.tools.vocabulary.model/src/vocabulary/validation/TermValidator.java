/**
 *
 * $Id$
 */
package vocabulary.validation;


/**
 * A sample validator interface for {@link vocabulary.Term}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TermValidator {
    boolean validate();

    boolean validateName(String value);
    boolean validateLabel(String value);
    boolean validateComment(String value);
    boolean validateSeeAlso(String value);
}
