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

import fr.centralesupelec.edf.riseclipse.cim.cim17.util.AbstractCim17ResourceSetFactory;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseResourceSet;

public class CimResourceSetFactory extends AbstractCim17ResourceSetFactory {

    public CimResourceSetFactory() {
        super();
    }

    @Override
    public IRiseClipseResourceSet createResourceSet( boolean strictContent ) {
        return new CimResourceSetImpl( strictContent );
    }
}
