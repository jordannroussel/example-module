package org.jahia.modules.example.tags;


import org.jahia.services.content.JCRNodeWrapper;
import org.jahia.services.content.nodetypes.ExtendedNodeType;
import org.jahia.services.content.nodetypes.NodeTypeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.RepositoryException;
import javax.jcr.nodetype.NodeType;
import java.util.ArrayList;
import java.util.List;

public class ExampleTag {

	private static final transient Logger LOGGER = LoggerFactory.getLogger(ExampleTag.class);

	public static boolean hasMixin(JCRNodeWrapper node, String mixinName) {
		LOGGER.debug("hasMixin(...) has been called for the mixin : '" + mixinName + "' on the node : '" + node
				.getPath() +"'");
		try {
			List<NodeType> nt = new ArrayList<NodeType>();
			for (NodeType nodeType : node.getMixinNodeTypes()) {
				LOGGER.debug("Mixin node type found : " + nodeType);
				if (nodeType.getName().equals(mixinName)) {
					return true;
				}
			}
		} catch (RepositoryException e) {
			e.printStackTrace();
		}
		return false;
	}
}
