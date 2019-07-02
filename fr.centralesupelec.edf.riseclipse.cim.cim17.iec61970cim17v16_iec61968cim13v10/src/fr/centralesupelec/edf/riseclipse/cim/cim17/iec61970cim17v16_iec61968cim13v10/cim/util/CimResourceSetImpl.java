/**
 *  Copyright (c) 2019 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      http://wdi.supelec.fr/software/RiseClipse/
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.util;

import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseResource;
import fr.centralesupelec.edf.riseclipse.util.RiseClipseMetamodel;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;


public class CimResourceSetImpl extends fr.centralesupelec.edf.riseclipse.cim.cim17.util.CimResourceSetImpl {

    public CimResourceSetImpl( boolean strictContent ) {
        super( strictContent );
        
        resourceFactory = new CimResourceFactoryImpl();
    }

    @Override
    protected IRiseClipseResource createRiseClipseResource( URI uri, String contentType ) {
        Optional< String > metamodel = RiseClipseMetamodel.findMetamodelFor( uri );
        if( metamodel.isPresent() && CimPackage.eNS_URI.equals( metamodel.get() )) {
            return resourceFactory.createResource( uri );
        }
        return null;
    }
}
