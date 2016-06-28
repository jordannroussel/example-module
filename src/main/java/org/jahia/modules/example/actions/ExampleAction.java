package org.jahia.modules.example.actions;


import org.jahia.bin.Action;
import org.jahia.bin.ActionResult;
import org.jahia.services.content.JCRContentUtils;
import org.jahia.services.content.JCRNodeWrapper;
import org.jahia.services.content.JCRPropertyWrapperImpl;
import org.jahia.services.content.JCRSessionWrapper;
import org.jahia.services.render.RenderContext;
import org.jahia.services.render.Resource;
import org.jahia.services.render.URLResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.PropertyIterator;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class ExampleAction extends Action {

	private static final transient Logger LOGGER = LoggerFactory.getLogger(ExampleAction.class);

	@Override
	public ActionResult doExecute(HttpServletRequest req, RenderContext renderContext, Resource resource, JCRSessionWrapper session, Map<String, List<String>> parameters, URLResolver urlResolver) throws Exception {


		// Redirect toward the node on which the action was called
		/*
		ActionResult result = new ActionResult(200, resource.getNode().getPath());
		return result;
		 */

		// When we have to add a parameter to the redirect URL, use this kind of redirect instead
		/*
		String redirectUrl = resource.getNode().getPath() + ".html?key=value";
		renderContext.getResponse().sendRedirect(redirectUrl);
		 */

		// No redirect, will only return a 200
		return ActionResult.OK;
	}
}
