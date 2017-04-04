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

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject;


public class CimXMLHandler extends fr.centralesupelec.edf.riseclipse.cim.cim17.util.CimXMLHandler {

    public CimXMLHandler( XMLResource xmiResource, XMLHelper helper, Map< ?, ? > options ) {
        super( xmiResource, helper, options );
    }

    @Override
    protected void setFeatureValue( EObject object, EStructuralFeature feature, Object value ) {
        // Ignore mRID
        if(( object instanceof IdentifiedObject )
        && ( feature.getFeatureID() == CimPackage.IDENTIFIED_OBJECT__MRID )) {
            return;
        }
        super.setFeatureValue( object, feature, value );
    }
    
}
