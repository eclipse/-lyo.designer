/**
 *
 * $Id$
 */
package adaptorinterface.validation;

import adaptorinterface.BasicCapability;
import adaptorinterface.CreationFactory;
import adaptorinterface.Dialog;
import adaptorinterface.DomainSpecification;
import adaptorinterface.QueryCapability;
import adaptorinterface.ResourceServiceNamespace;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link adaptorinterface.Service}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ServiceValidator {
	boolean validate();

	boolean validateDomainSpecification(DomainSpecification value);
	boolean validateServiceNamespace(ResourceServiceNamespace value);
	boolean validateCreationFactories(EList<CreationFactory> value);
	boolean validateQueryCapabilities(EList<QueryCapability> value);
	boolean validateSelectionDialogs(EList<Dialog> value);
	boolean validateCreationDialogs(EList<Dialog> value);
	boolean validateBasicCapabilities(EList<BasicCapability> value);
	boolean validateUsages(EList<String> value);
}