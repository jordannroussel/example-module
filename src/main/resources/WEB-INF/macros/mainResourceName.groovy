/**
 * Print the mainresource name
 */
import org.jahia.services.content.JCRNodeWrapper;

JCRNodeWrapper mainResource = renderContext.getMainResource().getNode();
print(mainResource.getName());