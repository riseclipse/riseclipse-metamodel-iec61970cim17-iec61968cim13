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
import org.eclipse.emf.ecore.EObject;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimObjectWithID;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16.cim.util.CimResourceFactoryImpl
 * @generated NOT
 */
public class CimResourceImpl extends fr.centralesupelec.edf.riseclipse.cim.cim17.util.CimResourceImpl {

    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param uri the URI of the new resource.
     * @generated NOT
     */
    public CimResourceImpl( URI uri ) {
        super( uri );
    }

    // TODO: why do we need to override it ?
    @Override
    public String getID( EObject eObject ) {
        if( eObject instanceof CimObjectWithID ) {
            return (( CimObjectWithID ) eObject ).getID();
        }
        return super.getID( eObject );
    }

    // TODO: why do we need to override it ?
    @Override
    public void setID( EObject eObject, String id ) {
        if( eObject instanceof CimObjectWithID ) {
            (( CimObjectWithID ) eObject ).setID( id );
        }
        super.setID( eObject, id );
    }

} // CimResourceImpl
