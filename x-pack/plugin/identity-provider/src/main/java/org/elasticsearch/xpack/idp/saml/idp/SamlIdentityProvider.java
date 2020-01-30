/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */

package org.elasticsearch.xpack.idp.saml.idp;


/**
 * SAML 2.0 configuration information about this IdP
 */
public interface SamlIdentityProvider {

    String getEntityId();
}
