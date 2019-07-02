/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.util;

import org.eclipse.emf.common.util.URI;

import fr.centralesupelec.edf.riseclipse.cim.cim17.util.AbstractCim17ResourceFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.AbstractCim17Resource.cim.util.CimResourceImpl
 * @generated NOT
 */
public class CimResourceFactoryImpl extends AbstractCim17ResourceFactory {

    @Override
    protected CimResourceImpl createCimResource( URI uri ) {
        return new CimResourceImpl( uri );
    }

}
