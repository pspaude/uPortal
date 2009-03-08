/**
 * Copyright (c) 2000-2009, Jasig, Inc.
 * See license distributed with this file and available online at
 * https://www.ja-sig.org/svn/jasig-parent/tags/rel-10/license-header.txt
 */
package org.jasig.portal.groups;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Creates an instance of the reference <code>ICompositeGroupService</code>.
 * @author Dan Ellentuck
 * @version $Revision$
 */

public class ReferenceCompositeGroupServiceFactory implements ICompositeGroupServiceFactory {
    private static final Log log = LogFactory.getLog(ReferenceCompositeGroupServiceFactory.class);
    
/**
 * ReferenceGroupServiceFactory constructor.
 */
public ReferenceCompositeGroupServiceFactory() {
    super();
}
/**
 * Return an instance of the service implementation.
 * @return ICompositeGroupService
 * @exception GroupsException
 */
public ICompositeGroupService newGroupService() 
throws GroupsException
{
    try
    { 
	   ReferenceCompositeGroupService service =  new ReferenceCompositeGroupService();
	   service.initializeComponentServices();
	   return service; 
    }
    catch ( Exception ex )
    {
        log.error( "ReferenceCompositeGroupServiceFactory.newGroupService(): " + ex);
        throw new GroupsException(ex);
    }
}
}