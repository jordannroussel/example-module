package org.jahia.modules.example.actions;

import org.jahia.bin.Action;
import org.jahia.bin.ActionResult;
import org.jahia.services.content.JCRSessionWrapper;
import org.jahia.services.render.RenderContext;
import org.jahia.services.render.Resource;
import org.jahia.services.render.URLResolver;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jroussel on 05/11/15.
 */
public class ActionReturningJson extends Action {

	private static final transient Logger LOGGER = LoggerFactory.getLogger(ActionReturningJson.class);

	@Override
	public ActionResult doExecute(HttpServletRequest req, RenderContext renderContext, Resource resource, JCRSessionWrapper session, Map<String, List<String>> parameters, URLResolver urlResolver) throws Exception {
		Map<String, String> mapToReturn = new HashMap();
		mapToReturn.put("key1", "value1");
		mapToReturn.put("key2", "value2");

		return new ActionResult(200, null, new JSONObject(mapToReturn));
	}
}
