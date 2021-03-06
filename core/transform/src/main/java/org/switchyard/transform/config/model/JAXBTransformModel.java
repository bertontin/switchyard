/*
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.switchyard.transform.config.model;

import org.switchyard.config.model.transform.TransformModel;

/**
 * A "transform.jaxb" configuration model.
 *
 * @author <a href="mailto:tom.fennelly@gmail.com">tom.fennelly@gmail.com</a>
 */
public interface JAXBTransformModel extends TransformModel {

    /** The "jaxb" name. */
    public static final String JAXB = "jaxb";

    /** The "contextPath" name. */
    public static final String CONTEXT_PATH = "contextPath";
    
    /** The "enableAttachment" name. */
    public static final String ENABLE_ATTACHMENT = "enableAttachment";

    /** The "enableXOPPackage" name. */
    public static final String ENABLE_XOP_PACKAGE = "enableXOPPackage";

    /**
     * Gets the contextPath attribute.
     * @return the contextPath attribute
     */
    public String getContextPath();

    /**
     * Sets the contextPath attribute.
     * @param contextPath the contextPath attribute
     * @return this JAXBTransformModel (useful for chaining)
     */
    public JAXBTransformModel setContextPath(String contextPath);

    /**
     * Gets enableAttachment attribute.
     * @return the enableAttachment attribute
     */
    public boolean isAttachmentEnabled();

    /**
     * Sets the enableAttachment attribute.
     * @param attachmentEnabled the enableAttachment attribute
     * @return this JAXBTransformModel (useful for chaining)
     */
    public JAXBTransformModel setAttachmentEnabled(boolean attachmentEnabled);

    /**
     * Gets enableXOPPackage attribute.
     * @return the enableXOPPackage attribute
     */
    public boolean isXOPPackageEnabled();

    /**
     * Sets the enableXOPPackage attribute.
     * @param xopEnabled the enableXOPPackage attribute
     * @return this JAXBTransformModel (useful for chaining)
     */
    public JAXBTransformModel setXOPPackageEnabled(boolean xopEnabled);

}
